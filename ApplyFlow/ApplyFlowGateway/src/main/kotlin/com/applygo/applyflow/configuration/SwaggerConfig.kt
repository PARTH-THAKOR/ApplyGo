/**
 * Description : Swagger configuration for the ApplyFlowGateway application.
 * The Swagger configuration is used to define the Swagger rules for the application.
 * The Swagger rules are defined using the Docket method.
 * The Docket method is used to define the Swagger rules for the application.
 */

package com.applygo.applyflow.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger.web.DocExpansion
import springfox.documentation.swagger.web.UiConfiguration
import springfox.documentation.swagger.web.UiConfigurationBuilder
import springfox.documentation.swagger2.annotations.EnableSwagger2


@Configuration
@EnableSwagger2
class SwaggerConfig {

    @Bean
    fun api(): Docket =
        Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.applygo.applyflow"))
            .paths(PathSelectors.any()).build()

    @Bean
    fun uiConfig(): UiConfiguration = UiConfigurationBuilder.builder().docExpansion(DocExpansion.LIST).build()

}
