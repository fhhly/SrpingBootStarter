package com.fhh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-03-09 22:47
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {
	@Autowired
	private StarterServiceProperties starterServiceProperties;

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnProperty(prefix = "fhh.service", value = "enable", havingValue = "true")
	StarterService starterService(){
		return new StarterService(starterServiceProperties.getConfig());
	}
}