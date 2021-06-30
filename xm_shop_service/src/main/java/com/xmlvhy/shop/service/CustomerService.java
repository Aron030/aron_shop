package com.xmlvhy.shop.service;

import com.xmlvhy.shop.params.CustomerParam;
import com.xmlvhy.shop.pojo.Customer;
import com.xmlvhy.shop.vo.CustomerVo;

import java.util.List;

/**
 * Description: 客户相关业务接口
 */
public interface CustomerService {
    Customer login(String loginName,String password);

    Customer findByPhone(String phone);

    Customer regist(CustomerVo customerVo);

    Boolean modifyCustomerPassword(Customer customer);

    Boolean findByLoginName(String loginName);

    List<Customer> findAllCustomers();

    List<Customer> findCustomersByParams(CustomerParam customerParam);

    Customer findCustomerId(int id);

    Boolean modifyCustomer(CustomerVo customerVo);

    Boolean modifyCustomerStatus(int id);

    Boolean modifyCenterCustomer(Integer customerId, String mobile, String address);

}
