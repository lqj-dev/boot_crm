package edu.njpi.crm.controller;

import edu.njpi.crm.model.BaseDict;
import edu.njpi.crm.model.Customer;
import edu.njpi.crm.model.User;
import edu.njpi.crm.service.BaseDictService;
import edu.njpi.crm.service.CustomerService;
import edu.njpi.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @Classname CustomerController
 * @Description TODO
 * @Date 2020/12/23 2:46 下午
 * @Created by lqj(1724226325@qq.com)
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private BaseDictService baseDictService;
    //客户来源
    @Value("${customer.from.type}")
    private String FROM_TYPE;
    //客户行业
    @Value("${customer.industry.type}")
    private String INDUSTRY_TYPE;
    //客户级别
    @Value("${customer.level.type}")
    private String LEVEL_TYPE;

    @RequestMapping(value = "/customer/list.action")
    public String list(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer rows,
                       String custName, String custSource, String custIndustry,
                       String custLevel, Model model) {
        //条件查询所有的客户
        Page<Customer> customers = customerService.findCustomerList(page, rows, custName, custSource, custIndustry,
                custLevel);
        model.addAttribute("page", customers);
        List<BaseDict> fromType = baseDictService.findBaseListByTypeCode(FROM_TYPE);
        System.out.println("INDUSTRY_TYPE:" + INDUSTRY_TYPE + "," + "fromType:" + FROM_TYPE);
        List<BaseDict> industryType = baseDictService.findBaseListByTypeCode(INDUSTRY_TYPE);
        List<BaseDict> levelType = baseDictService.findBaseListByTypeCode(LEVEL_TYPE);
        model.addAttribute("fromType", fromType);
        model.addAttribute("industryType", industryType);
        model.addAttribute("levelType", levelType);
        model.addAttribute("custName", custName);
        model.addAttribute("custSource", custSource);
        model.addAttribute("custIndustry", custIndustry);
        model.addAttribute("custLevel", custLevel);
        return "customer";
    }

    @RequestMapping("/customer/create.action")
    @ResponseBody
    public String customerCreate(Customer customer, HttpSession session) {

        //获取Session中的当前用户信息
        User user = (User) session.getAttribute("USER_SESSION");
        //设置createId
        customer.setCustCreateId(String.valueOf(user.getUserId()));
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        //设置时间
        customer.setCustCreateTime(timestamp);
        int rows = customerService.createCustomer(customer);
        System.out.println(customer);
        if (rows > 0) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    @RequestMapping("/customer/getCustomerById.action")
    @ResponseBody
    public Customer getCustomerById(Integer id){
        Customer customer=customerService.getCustomerById(id);
        System.out.println(customer);
        return customer;
    }
    @RequestMapping("/customer/update.action")
    @ResponseBody
    public String customerUpdate(Customer customer) {
        //更新客户信息,根据customerid来更新的
        int rows = customerService.updateCustomer(customer);
        if (rows > 0) {
            return "OK";
        } else {
            return "FAIL";
        }
    }
    @RequestMapping("/customer/delete.action")
    @ResponseBody
    public String customerDelete(Integer id){
        int rows=customerService.deleteCustomer(id);
        if(rows>0){
            return "OK";
        }else{
            return "FAIL";
        }
    }
}
