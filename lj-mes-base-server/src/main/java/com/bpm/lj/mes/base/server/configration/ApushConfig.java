package com.bpm.lj.mes.base.server.configration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ApushConfig {

    @Value("${apush.config.gexin.appId}")
    private String appId;

    @Value("${apush.config.gexin.appKey}")
    private String appKey;

    @Value("${apush.config.gexin.masterSecret}")
    private String masterSecret;

}
