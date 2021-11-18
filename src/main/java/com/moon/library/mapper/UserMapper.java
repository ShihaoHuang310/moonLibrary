package com.moon.library.mapper;

import com.moon.library.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    User getUserByUsername(String username);
    /**
     * 改变密码
     * @param username
     * @param newPassword
     */
    void changePassword(String username, String newPassword);
    /**
     * 获取密码
     * @param username
     * @return
     */
    String getPassword(String username);
}
