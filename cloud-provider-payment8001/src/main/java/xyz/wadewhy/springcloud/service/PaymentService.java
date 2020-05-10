package xyz.wadewhy.springcloud.service;

import org.apache.ibatis.annotations.Param;
import xyz.wadewhy.springcloud.entities.Payment;

/**
 * @PACKAGE_NAME: xyz.wadewhy.springcloud.service
 * @NAME: PaymentService
 * @Author: 钟子豪
 * @DATE: 2020/5/9
 * @MONTH_NAME_FULL: 五月
 * @DAY: 09
 * @DAY_NAME_FULL: 星期六
 * @PROJECT_NAME: cloud2020
 **/
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
