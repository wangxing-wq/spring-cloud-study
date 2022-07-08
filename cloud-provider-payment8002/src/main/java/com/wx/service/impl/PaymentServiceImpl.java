package com.wx.service.impl;

import com.wx.dao.PaymentDao;
import com.wx.entity.Payment;
import com.wx.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/21 12:38
 * @message
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Resource
	private PaymentDao paymentDao;

	@Override
	public int savePayment(Payment payment) {
		return paymentDao.savePayment(payment);
	}

	@Override
	public Payment findPaymentById(Long id) {
		return paymentDao.findPaymentById(id);
	}
}
