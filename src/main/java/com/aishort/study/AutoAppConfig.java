package com.aishort.study;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = {"com.aishort.study.member"},
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
