package co.yixiang.modules.wechat.rest;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import co.yixiang.exception.BadRequestException;
import co.yixiang.modules.wechat.domain.YxSystemConfig;
import co.yixiang.utils.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import co.yixiang.aop.log.Log;
import co.yixiang.modules.wechat.service.YxSystemConfigService;
import co.yixiang.modules.wechat.service.dto.YxSystemConfigQueryCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;

/**
* @author hupeng
* @date 2019-10-10
*/
@Api(tags = "YxSystemConfig管理")
@RestController
@RequestMapping("api")
public class YxSystemConfigController {

    @Autowired
    private YxSystemConfigService yxSystemConfigService;

    @Log("查询YxSystemConfig")
    @ApiOperation(value = "查询YxSystemConfig")
    @GetMapping(value = "/yxSystemConfig")
    @PreAuthorize("hasAnyRole('ADMIN','YXSYSTEMCONFIG_ALL','YXSYSTEMCONFIG_SELECT')")
    public ResponseEntity getYxSystemConfigs(YxSystemConfigQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity(yxSystemConfigService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @Log("新增YxSystemConfig")
    @ApiOperation(value = "新增YxSystemConfig")
    @PostMapping(value = "/yxSystemConfig")
    @PreAuthorize("hasAnyRole('ADMIN','YXSYSTEMCONFIG_ALL','YXSYSTEMCONFIG_CREATE')")
    public ResponseEntity create(@RequestBody String jsonStr){
        if(StrUtil.isNotEmpty(jsonStr)) throw new BadRequestException("演示环境禁止操作");
        JSONObject jsonObject = JSON.parseObject(jsonStr);
        jsonObject.forEach(
                (key,value)->{
                    YxSystemConfig yxSystemConfig = yxSystemConfigService.findByKey(key);
                    YxSystemConfig yxSystemConfigModel = new YxSystemConfig();
                    yxSystemConfigModel.setMenuName(key);
                    yxSystemConfigModel.setValue(value.toString());
                    RedisUtil.set(key,value.toString());
                    if(ObjectUtil.isNull(yxSystemConfig)){
                        yxSystemConfigService.create(yxSystemConfigModel);
                    }else{
                        yxSystemConfigModel.setId(yxSystemConfig.getId());
                        yxSystemConfigService.update(yxSystemConfigModel);
                    }
                }
        );

        return new ResponseEntity(HttpStatus.CREATED);
    }



}