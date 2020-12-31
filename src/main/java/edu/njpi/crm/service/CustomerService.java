package edu.njpi.crm.service;

import edu.njpi.crm.model.BaseDict;
import edu.njpi.crm.model.Customer;
import edu.njpi.crm.utils.Page;

import java.util.List;

public interface CustomerService {
    Page<Customer> findCustomerList(Integer page,Integer rows,
                                    String custName,String custSource,
                                    String custIndustry,String custLevel);

    int createCustomer(Customer customer);
    public Customer getCustomerById(Integer id);
    int updateCustomer(Customer customer);

    Integer deleteCustomer(Integer id);
}
