package com.report.mange.system;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.report.mange.system.mybatis")
@EnableCaching
@ConfigurationPropertiesScan(basePackages = "com.report.mange.system.config")
@EnableSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ReportMangeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportMangeSystemApplication.class, args);
        System.out.println("启动成功：sa-token配置如下：" + SaManager.getConfig());
        System.out.println("(♥◠‿◠)ﾉﾞ  报表服务启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "$$\\       $$$$$$$\\  $$\\      $$\\ \n" +
                "$$ |      $$  __$$\\ $$ | $\\  $$ |\n" +
                "$$ |      $$ |  $$ |$$ |$$$\\ $$ |\n" +
                "$$ |      $$$$$$$\\ |$$ $$ $$\\$$ |\n" +
                "$$ |      $$  __$$\\ $$$$  _$$$$ |\n" +
                "$$ |      $$ |  $$ |$$$  / \\$$$ |\n" +
                "$$$$$$$$\\ $$$$$$$  |$$  /   \\$$ |\n" +
                "\\________|\\_______/ \\__/     \\__|\n" +
                "                               ");
    }

}
