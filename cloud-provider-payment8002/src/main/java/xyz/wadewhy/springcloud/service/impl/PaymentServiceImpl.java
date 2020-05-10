package xyz.wadewhy.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.wadewhy.springcloud.dao.PaymentDao;
import xyz.wadewhy.springcloud.entities.Payment;
import xyz.wadewhy.springcloud.service.PaymentService;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.service.impl
 * @NAME: PaymentServiceImpl
 * @Author: 钟子豪
 * @DATE: 2020/5/9
 * @MONTH_NAME_FULL: 五月
 * @DAY: 09
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
