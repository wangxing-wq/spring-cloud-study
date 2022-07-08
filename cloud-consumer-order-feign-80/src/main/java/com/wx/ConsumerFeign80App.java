package com.wx;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/22 10:38
 * @message
 */
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(value = "CLOUD-PAYMENT-SERVICE",configuration = RandomRule.class)
@SpringBootApplication
public class ConsumerFeign80App {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeign80App.class,args);
	}

}
