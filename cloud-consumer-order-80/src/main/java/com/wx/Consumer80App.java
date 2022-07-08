package com.wx;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/22 10:38
 * @message
 */
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = RandomRule.class)
@SpringBootApplication
public class Consumer80App {

	public static void main(String[] args) {
		SpringApplication.run(Consumer80App.class,args);
	}

}
