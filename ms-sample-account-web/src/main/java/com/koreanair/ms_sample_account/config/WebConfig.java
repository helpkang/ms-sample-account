package com.koreanair.ms_sample_account.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

  }

  @Bean
  public FormattingConversionService statusConversionService (@Autowired  FormattingConversionService  mvcConversionService) {
    mvcConversionService.addConverter(new MyCustomEnumConverter());
    return mvcConversionService;
  }

}

class MyCustomEnumConverter implements Converter<String, HttpStatus> {
  @Override
  public HttpStatus convert(String source) {
    try {
      return HttpStatus.valueOf(Integer.parseInt(source.split(" ")[0]));
    } catch (Exception e) {
      e.printStackTrace();
      return null; // or SortEnum.asc
    }
  }
}