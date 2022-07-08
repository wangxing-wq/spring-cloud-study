package com.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/24 13:39
 * @message
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaSever7002 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSever7002.class,args);
	}

}
