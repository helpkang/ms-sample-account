package com.koreanair.ms_ibe.config;

import static com.google.common.base.Predicates.or;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .tags(
        		new Tag("Availability", "Revenue availability services", 1),
        		new Tag("ReservationSearch", "Reservation search services", 2),
                new Tag("Member", "Membership services", 3),
                new Tag("InstantSearch", "Instant search services", 4)
                )
          .select()
          .apis(RequestHandlerSelectors.any())
          .paths(or(PathSelectors.ant("/api/**/*"), PathSelectors.ant("/inter/**/*")))
          .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("KE MVP(Minimum Viable Product) API")
                .description("KE MVP(Minimum Viable Product) API Description")
                //.contact(new Contact("TestName", "http:/test-url.com", "test@test.de"))
                //.license("Apache 2.0")
                //.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .version("1.0.0")
                .build();
    }
}
