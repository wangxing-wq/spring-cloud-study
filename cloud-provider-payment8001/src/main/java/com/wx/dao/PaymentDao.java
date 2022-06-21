package com.wx.dao;

import com.wx.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/21 12:07
 * @message
 */
public interface PaymentDao {

	int savePayment(@Param("payment") Payment payment);

	Payment findPaymentById(@Param("id") Long id);

}
