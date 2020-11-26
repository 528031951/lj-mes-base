package com.bpm.lj.mes.base.server.configration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class MailConfig {

    @Value("${exchange.mail.server}")
    private String mailServer;

    @Value("${exchange.mail.user}")
    private String user;

    @Value("${exchange.mail.password}")
    private String password;

}
