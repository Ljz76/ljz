package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication  // 标记为 Spring Boot 应用（自动配置、组件扫描等）
@EnableEurekaServer     // 启用 Eureka Server 功能（核心注解，激活服务注册中心）
public class EurekaServerApplication {
    public static void main(String[] args) {
        // 启动 Spring Boot 应用（加载配置、初始化 Eureka Server）
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}