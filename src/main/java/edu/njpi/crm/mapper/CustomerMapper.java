package edu.njpi.crm.mapper;

import edu.njpi.crm.model.Customer;

import java.util.List;

/**
 * @Classname CustomerMapper
 * @Description TODO
 * @Date 2020/12/23 10:31 上午
 * @Created by lqj(1724226325@qq.com)
 */
public interface CustomerMapper {
    //客户列表
    List<Customer> selectCustomerList(Customer customer);
    //客户数
    Integer selectCustomerListCount(Customer customer);
    //创建customer
    Integer createCustomer(Customer customer);

    Integer updateCustomer(Customer customer);

    Customer getCustomerById(Integer id);

    Integer deleteCustomer(Integer id);
}
