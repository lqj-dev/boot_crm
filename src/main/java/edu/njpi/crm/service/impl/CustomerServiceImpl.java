package edu.njpi.crm.service.impl;

import edu.njpi.crm.mapper.CustomerMapper;
import edu.njpi.crm.model.Customer;
import edu.njpi.crm.service.CustomerService;
import edu.njpi.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


import java.util.List;

/**
 * @Classname CustomerServiceImpl
 * @Description TODO
 * @Date 2020/12/23 2:34 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource, String custIndustry, String custLevel) {
        //创建客户对象
        Customer customer = new Customer();
        //判断名称是否为空
        if(!StringUtils.isEmpty(custName)){
            customer.setCustName(custName);
        }
        if(!StringUtils.isEmpty(custSource)){
            customer.setCustSource(custSource);
        }
        if(!StringUtils.isEmpty(custIndustry)){
            customer.setCustIndustry(custIndustry);
        }
        if(!StringUtils.isEmpty(custLevel)) {
            customer.setCustLevel(custLevel);
        }
        customer.setStart((page-1)*rows);
        customer.setRows(rows);
        //使用customer来查询值
        List<Customer> customers = customerMapper.selectCustomerList(customer);
        //获取总记录数
        Integer count = customerMapper.selectCustomerListCount(customer);
        //创建Page返回对象
        Page<Customer> result=new Page<>();
        result.setCurrentPage(page);
        result.setRows(customers);
        result.setPageSize(rows);
        result.setRecordTotal(count);
        return result;
    }

    @Override
    public int createCustomer(Customer customer) {
        return customerMapper.createCustomer(customer);
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customerMapper.getCustomerById(id);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public Integer deleteCustomer(Integer id) {
        return customerMapper.deleteCustomer(id);
    }
}
