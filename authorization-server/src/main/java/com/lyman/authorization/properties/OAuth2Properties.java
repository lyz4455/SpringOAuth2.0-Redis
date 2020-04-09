package com.lyman.authorization.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by lyz4455 on 2020/4/2.
 */
@Data
@ConfigurationProperties(prefix = "ctrip.security.oauth2")
public class OAuth2Properties {

    private OAuth2ClientProperties[] clients = {};
}
