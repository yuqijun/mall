package co.yixiang.gen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.yixiang")
@MapperScan("co.yixiang.gen")
public class GApplication {
    public static void main(String [ ] args){
        SpringApplication.run(GApplication.class, args);
    }
}
