package com.wx.controller;

import com.wx.entity.CommonResult;
import com.wx.entity.Payment;
import com.wx.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/21 12:11
 * @message
 */
@Slf4j
@RestController
@RequestMapping("payment")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@PostMapping("create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		int count = paymentService.savePayment(payment);
		if (count == 0){
			return new CommonResult<>(444, "创建失败,payment : " + payment);
		}
		log.info("创建信息:{}",payment);
		return new CommonResult<>(200, "创建成功", payment);
	}

	@GetMapping("/get/{id}")
	public CommonResult<Payment> get(@PathVariable Long id){
		Payment paymentById = paymentService.findPaymentById(id);
		if (paymentById == null){
			return new CommonResult<>(444, "查询失败,id : " + id);
		}
		log.info("查询id:{}",id);
		return new CommonResult<>(200, "查询成功", paymentById);
	}

}
