package edu.njpi.crm.model;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/12/16 1:48 下午
 * @Created by lqj(1724226325@qq.com)
 */
public class User {
    private int userId;
    private String userCode;
    private String userName;
    private String password;
    private int state;

    public User() {
    }

    public User(String userCode, String password) {
        this.userCode = userCode;
        this.password = password;
    }

    public User(int userId, String userCode, String userName, String password, int state) {
        this.userId = userId;
        this.userCode = userCode;
        this.userName = userName;
        this.password = password;
        this.state = state;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", state=" + state +
                '}';
    }
}
