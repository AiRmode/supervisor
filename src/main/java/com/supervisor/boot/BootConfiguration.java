package com.supervisor.boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.supervisor.atlassian.rest", "com.supervisor.service.impl", "com.supervisor.web.controller"})
@EntityScan(basePackages = {"com.supervisor.entity"})
@EnableJpaRepositories(basePackages = {"com.supervisor.repository"})
public class BootConfiguration {

}
