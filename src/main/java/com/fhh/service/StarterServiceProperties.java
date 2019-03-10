package com.fhh.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-03-09 22:46
 */
@ConfigurationProperties("com.fhh.service")
public class StarterServiceProperties {
	private String config;

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}
}