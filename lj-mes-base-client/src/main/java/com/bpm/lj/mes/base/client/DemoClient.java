package com.bpm.lj.mes.base.client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "demo",
        fallbackFactory = DemoFallBackClient.class
)
public interface DemoClient {

}
