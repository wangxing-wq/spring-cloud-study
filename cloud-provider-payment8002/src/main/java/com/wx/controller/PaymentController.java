package com.wx.controller;

import com.wx.entity.CommonResult;
import com.wx.entity.Payment;
import com.wx.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/21 12:11
 * @message
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}


	@Value("${server.port}")
	private String port;

	@PostMapping("create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		int count = paymentService.savePayment(payment);
		if (count == 0){
			return new CommonResult<>(444, "创建失败,payment : " + payment);
		}
		return new CommonResult<>(200, "创建成功", payment);
	}

	@GetMapping("/get/{id}")
	public CommonResult<Payment> get(@PathVariable Long id){
		Payment paymentById = paymentService.findPaymentById(id);
		if (paymentById == null){
			return new CommonResult<>(444, "查询失败,id : " + id + port);
		}
		return new CommonResult<>(200, "查询成功" + port, paymentById);
	}

	@GetMapping("info")
	public CommonResult<String> info(){
		return new CommonResult<>(200, "查询成功" + port, port);
	}


}
