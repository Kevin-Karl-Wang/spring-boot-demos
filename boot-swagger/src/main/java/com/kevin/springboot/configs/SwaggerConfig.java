package com.kevin.springboot.configs;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author kevin
 */
// 启动时加载类
@Configuration
// 启用Swagger API文档
@EnableSwagger2
public class SwaggerConfig {

    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                // 自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.kevin.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("HIS").description("HIS API 1.0 操作文档")
        //服务条款网址
        .termsOfServiceUrl("https://blog.csdn.net/weixin_42405670").version("1.0")
                .contact(new Contact("鮀城小帅", "https://blog.csdn.net/weixin_42405670", "15989746839@163.com"))
                .build();
    }
}
