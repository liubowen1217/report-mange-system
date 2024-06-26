//package com.report.mange.system.swagger;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @Decription SWAGGER
// */
//@Configuration
//@EnableSwagger2
//@ConditionalOnProperty(name = "swagger.enable", havingValue = "true")
//public class Swagger2Config implements WebMvcConfigurer {
//
//    /**
//     * 显示swagger-ui.html文档展示页，还必须注入swagger资源：
//     *
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//
//    /**
//     * swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
//     *
//     * @return Docket
//     */
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                //此包路径下的类，才生成接口文档
//                .apis(RequestHandlerSelectors.basePackage("com.fallrain.fallrainspringboot"))
//                //加了ApiOperation注解的类，才生成接口文档
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
////				.securitySchemes(Collections.singletonList(securityScheme()));
//        //.globalOperationParameters(setHeaderToken());
//    }
//
//
//    /**
//     * api文档的详细信息函数,注意这里的注解引用的是哪个
//     *
//     * @return
//     */
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                // //大标题
//                .title("XX项目-XX管理-API接口文档")
//                // 版本号
//                .version("1.0")
////				.termsOfServiceUrl("NO terms of service")
//                // 描述
//                .description("后台API接口")
//                // 作者
//                .contact("XXX团队")
//                .license("The Apache License, Version 2.0")
//                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
//                .build();
//    }
//
//}
//
