package com.wx.controller;

import com.wx.entity.CommonResult;
import com.wx.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/22 17:16
 * @message
 */
@RestController
@RequestMapping("consumer")
public class OrderController {

	private final RestTemplate restTemplate;
	private final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/payment";

	public OrderController(RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}

	@PostMapping("/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		return restTemplate.postForObject(PAYMENT_URL + "/create", payment, CommonResult.class);
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> get(@PathVariable int id){
		return restTemplate.getForObject(PAYMENT_URL + "/get/" + id,CommonResult.class);
	}

}
