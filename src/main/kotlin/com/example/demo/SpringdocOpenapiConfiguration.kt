package com.example.demo

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringdocOpenapiConfiguration {

    @Bean
    fun api(): GroupedOpenApi {
        return GroupedOpenApi.builder()
            .group("demo-api")
            .pathsToMatch("/**")
            .build()
    }

    @Bean
    fun growthOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Demo API")
                    .description("Demo")
                    .version("1.0.0")
            )
    }
}
