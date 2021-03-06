package com.wx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/20 22:36
 * @message
 */
@MapperScan("com.wx.dao")
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8001App {

	public static void main(String[] args) {
		SpringApplication.run(Payment8001App.class,args);
	}

}
