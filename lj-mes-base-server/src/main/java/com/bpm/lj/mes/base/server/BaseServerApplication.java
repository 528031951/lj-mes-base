package com.bpm.lj.mes.base.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.bpm.lj.mes.base.server.mapper")
@EnableFeignClients(
        basePackages = {"com.bpm.log.client","com.bpm.lj.mes.base.server.util"}
)
@ComponentScan({"com.bpm.lj.mes.base"})
public class BaseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseServerApplication.class, args);
    }

}
