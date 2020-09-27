/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By www.yixiang.co
* 注意：
* 本软件为www.yixiang.co开发研制
*/
package co.yixiang.modules.security.security.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author hupeng
 */
@Data
@NoArgsConstructor
public class OnlineUser {

    private String userName;

    private String nickName;

    private String job;

    private String browser;

    private String ip;

    private String address;

    private String key;

    private Date loginTime;

    public OnlineUser(String userName, String nickName, String job, String browser, String ip, String address, String key, Date loginTime) {
        this.userName = userName;
        this.nickName = nickName;
        this.job = job;
        this.browser = browser;
        this.ip = ip;
        this.address = address;
        this.key = key;
        this.loginTime = loginTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getJob() {
        return job;
    }

    public String getBrowser() {
        return browser;
    }

    public String getIp() {
        return ip;
    }

    public String getAddress() {
        return address;
    }

    public String getKey() {
        return key;
    }

    public Date getLoginTime() {
        return loginTime;
    }
}
