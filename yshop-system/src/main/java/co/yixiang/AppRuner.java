/**
* Copyright (C) 2018-2020
* All rights reserved, Designed By www.yixiang.co
* 注意：
* 本软件为www.yixiang.co开发研制
*/
package co.yixiang;

import co.yixiang.annotation.AnonymousAccess;
import co.yixiang.utils.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hupeng
 * @date 2018/11/15 9:20:19
 */
@SpringBootApplication
public class AppRuner {

    public static void main(String[] args) {
        SpringApplication.run(AppRuner.class, args);
        System.out.println(
                     "              __                  \n" +
                    "  __ __ ___  / /  ___   ___       \n" +
                    " / // /(_-< / _ \\/ _ \\ / _ \\   \n" +
                    " \\_, //___//_//_/\\___// .__/    \n" +
                    "/___/                /_/          \n "+

                    "\n意象yshop电商系统管理后台启动成功 \n官网：https://www.yixiang.co 提供技术支持ﾞ  \n");
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
//
//    @Bean
//    public ServletWebServerFactory webServerFactory() {
//        TomcatServletWebServerFactory fa = new TomcatServletWebServerFactory();
//        fa.addConnectorCustomizers(connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
//        return fa;
//    }

    /**
     * 访问首页提示
     * @return /
     */
    @GetMapping("/")
    @AnonymousAccess
    public String index() {
        return "Backend service started successfully";
    }
}
