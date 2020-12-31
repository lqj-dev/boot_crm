package edu.njpi.crm.test;

import edu.njpi.crm.mapper.CustomerMapper;
import edu.njpi.crm.model.Customer;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/12/25 8:43 上午
 * @Created by lqj(1724226325@qq.com)
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory factory =(SqlSessionFactory) classPathXmlApplicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = factory.openSession();
        CustomerMapper mapper = sqlSession.getMapper(edu.njpi.crm.mapper.CustomerMapper.class);
        Customer customer = new Customer();
        customer.setStart(0);
        customer.setRows(10);
        Integer totalRecord = mapper.selectCustomerListCount(customer);
        System.out.println(totalRecord);

    }
}
