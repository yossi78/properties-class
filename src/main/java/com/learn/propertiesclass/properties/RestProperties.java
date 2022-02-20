package com.learn.propertiesclass.properties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;




@ConfigurationProperties(prefix = "telemetry.rest", ignoreUnknownFields = false)
@Data
public class RestProperties {

    private String swmUrl;
    private String swmSelectedInstallationPhases;
    private Integer swmConnectTimeOut;
    private Integer swmReadTimeOut;



}
