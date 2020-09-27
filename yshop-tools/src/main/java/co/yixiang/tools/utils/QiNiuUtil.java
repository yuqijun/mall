/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By www.yixiang.co
* 注意：
* 本软件为www.yixiang.co开发研制
*/
package co.yixiang.tools.utils;

import co.yixiang.utils.FileUtil;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 七牛云存储工具类
 * @author hupeng
 * @date 2018-12-31
 */
@Component
public class QiNiuUtil {
    @Value("${qiniu.accessKey}")
    private String aKey;

    @Value("${qiniu.secretKey}")
    private String sKey;

    @Value("${qiniu.bucket}")
    private String Qnbucket;

    private static final String HUAD = "华东";

    private static final String HUAB = "华北";

    private static final String HUAN = "华南";

    private static final String BEIM = "北美";

    /**
     * 得到机房的对应关系
     * @param zone 机房名称
     * @return Region
     */
    public static Region getRegion(String zone){

        if(HUAD.equals(zone)){
            return Region.huadong();
        } else if(HUAB.equals(zone)){
            return Region.huabei();
        } else if(HUAN.equals(zone)){
            return Region.huanan();
        } else if (BEIM.equals(zone)){
            return Region.beimei();
            // 否则就是东南亚
        } else {
            return Region.qvmHuadong();
        }
    }

    /**
     * 默认不指定key的情况下，以文件内容的hash值作为文件名
     * @param file 文件名
     * @return String
     */
    public static String getKey(String file){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return FileUtil.getFileNameNoEx(file) + "-" +
                sdf.format(date) +
                "." +
                FileUtil.getExtensionName(file);
    }

    public String put(String localPath) {
        Configuration cfg = new Configuration(Zone.zone2());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = aKey;
        String secretKey = sKey;
        String bucket = Qnbucket;
        //如果是Windows情况下，格式是 D:\\qiniu\\test.png
        String localFilePath = localPath;
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);

        DefaultPutRet putRet =null;
        try {
            Response response = uploadManager.put(localFilePath, key, upToken);
            //解析上传成功的结果
            putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
        return putRet.key;
    }
}
