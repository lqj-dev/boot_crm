package edu.njpi.crm.mapper;

import edu.njpi.crm.model.Customer;

/**
 * @Classname CustomDao
 * @Description TODO
 * @Date 2020/12/10 4:13 下午
 * @Created by lqj(1724226325@qq.com)
 */
public interface CustomerMapper {
    public Customer getCustomerById(Integer id);
}
