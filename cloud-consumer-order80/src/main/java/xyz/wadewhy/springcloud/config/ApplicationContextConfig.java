package xyz.wadewhy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.config
 * @NAME: ApplicationContextConfig
 * @Author: 钟子豪
 * @DATE: 2020/5/9
 * @MONTH_NAME_FULL: 五月
 * @DAY: 09
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020
 * 微服务之间的调用 restTemplate
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //完成负载均衡注解
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
