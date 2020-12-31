package edu.njpi.crm.model;

import java.util.Date;

/**
 * @Classname Customer
 * @Description TODO
 * @Date 2020/12/17 4:54 下午
 * @Created by lqj(1724226325@qq.com)
 */
public class Customer {
    private int custId;            //客户编号
    private String custName;       //客户名称
    private String custUserId;     //负责人id
    private String custCreateId;   //创建人id
    private String custSource;     //客户信息来源
    private String custIndustry;   //客户所属行业
    private String custLevel;      //客户级别
    private String custLinkMan;    //联系人
    private String custPhone;      //固定电话
    private String custMobile;     //移动电话
    private String custZipCode;    //邮政编码
    private String custAddress;    //联系地址
    private Date custCreateTime;   //创建时间
    private Integer start;         //起始行
    private Integer rows;          //所取行

    public Customer() {
    }

    public Customer(int custId, String custName, String custUserId, String custCreateId, String custSource, String custIndustry, String custLevel, String custLinkMan, String custPhone, String custMobile, String custZipCode, String custAddress, Date custCreateTime, Integer start, Integer rows) {
        this.custId = custId;
        this.custName = custName;
        this.custUserId = custUserId;
        this.custCreateId = custCreateId;
        this.custSource = custSource;
        this.custIndustry = custIndustry;
        this.custLevel = custLevel;
        this.custLinkMan = custLinkMan;
        this.custPhone = custPhone;
        this.custMobile = custMobile;
        this.custZipCode = custZipCode;
        this.custAddress = custAddress;
        this.custCreateTime = custCreateTime;
        this.start = start;
        this.rows = rows;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(String custUserId) {
        this.custUserId = custUserId;
    }

    public String getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(String custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkMan() {
        return custLinkMan;
    }

    public void setCustLinkMan(String custLinkMan) {
        this.custLinkMan = custLinkMan;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipCode() {
        return custZipCode;
    }

    public void setCustZipCode(String custZipCode) {
        this.custZipCode = custZipCode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public Date getCustCreateTime() {
        return custCreateTime;
    }

    public void setCustCreateTime(Date custCreateTime) {
        this.custCreateTime = custCreateTime;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custUserId='" + custUserId + '\'' +
                ", custCreateId='" + custCreateId + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custLinkMan='" + custLinkMan + '\'' +
                ", custPhone='" + custPhone + '\'' +
                ", custMobile='" + custMobile + '\'' +
                ", custZipCode='" + custZipCode + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custCreateTime=" + custCreateTime +
                ", start=" + start +
                ", rows=" + rows +
                '}';
    }
}
