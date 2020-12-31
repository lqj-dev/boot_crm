package edu.njpi.crm.mapper;

import edu.njpi.crm.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User findUser(@Param("userCode")String user_code,@Param("passwd")String password);
}
