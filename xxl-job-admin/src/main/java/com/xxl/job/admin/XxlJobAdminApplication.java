package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**
 * @author xuxueli 2018-10-28 00:38:13
 */
@SpringCloudApplication
@EnableApolloConfig
public class XxlJobAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxlJobAdminApplication.class, args);
	}

}