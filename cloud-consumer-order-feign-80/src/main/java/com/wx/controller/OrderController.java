package com.wx.controller;

import com.wx.entity.CommonResult;
import com.wx.entity.Payment;
import com.wx.feign.PaymentFeign;
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

	private final PaymentFeign paymentFeign;

	public OrderController(PaymentFeign paymentFeign){
		this.paymentFeign = paymentFeign;
	}

	@PostMapping("/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		return paymentFeign.create(payment);
	}

	@GetMapping("/payment/get/{id}")
	public CommonResult<Payment> get(@PathVariable Long id){
		return paymentFeign.get(id);
	}

}
