package edu.njpi.crm.controller;

import edu.njpi.crm.model.Customer;
import edu.njpi.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname CustomerController
 * @Description TODO
 * @Date 2020/12/10 4:34 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(value="/customerId")
    public String findCustomerById(Integer id, Model model){
        System.out.println("id="+id);
        Customer customer = customerService.getCustomerById(id);
        model.addAttribute("customer",customer);
        return "customer";
    }
}
