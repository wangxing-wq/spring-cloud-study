package com.wx.feign;

import com.wx.entity.CommonResult;
import com.wx.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/7/8 11:15
 * @message
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
@RequestMapping("payment")
public interface PaymentFeign {

	@PostMapping("create")
	CommonResult<Payment> create(@RequestBody Payment payment);

	@GetMapping("/get/{id}")
	CommonResult<Payment> get(@PathVariable("id") Long id);

	@GetMapping("info")
	CommonResult<String> info();


}
