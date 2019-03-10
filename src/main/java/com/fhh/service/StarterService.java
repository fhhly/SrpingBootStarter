package com.fhh.service;

import org.springframework.util.StringUtils;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-03-09 22:42
 */
public class StarterService {
	private String config;

	public StarterService(String config) {
		this.config = config;
	}

	public String[] spilt(String pointChar){
		return StringUtils.split(this.config, pointChar);
	}
}