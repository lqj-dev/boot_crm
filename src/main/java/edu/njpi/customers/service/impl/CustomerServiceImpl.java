package edu.njpi.customers.service.impl;

import edu.njpi.customers.mapper.CustomerMapper;
import edu.njpi.customers.model.Customer;
import edu.njpi.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname CustomerServiceImpl
 * @Description TODO
 * @Date 2020/12/10 4:33 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerDao;
    @Override
    public Customer getCustomerById(Integer id) {
        return customerDao.getCustomerById(id);
    }
}
