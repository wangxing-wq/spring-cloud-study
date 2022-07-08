package com.wx.service;

import com.wx.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/21 12:11
 * @message
 */
public interface PaymentService {

	int savePayment(Payment payment);

	Payment findPaymentById(@Param("id") Long id);

}
