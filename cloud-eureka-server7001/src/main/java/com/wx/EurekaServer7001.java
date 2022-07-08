package com.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/23 13:08
 * @message
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001.class,args);
	}

}
