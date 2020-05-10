package xyz.wadewhy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud
 * @NAME: EurekaMain7001
 * @Author: 钟子豪
 * @DATE: 2020/5/10
 * @MONTH_NAME_FULL: 五月
 * @DAY: 10
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2020
 **/
@SpringBootApplication
//注册中心，管理注册进来的微服务
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
