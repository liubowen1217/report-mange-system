package com.report.mange.system.config;

import com.report.mange.system.model.SnowflakeProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data//包名更改成自己的
@ConfigurationProperties(prefix = "com.linshan")
public class TestProperties {

    private SnowflakeProperties snowflake;

}
