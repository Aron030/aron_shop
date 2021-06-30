package com.xmlvhy.shop.dao;

import com.xmlvhy.shop.params.SystemUserParam;
import com.xmlvhy.shop.pojo.SystemUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SystemUserDao {

    List<SystemUser> selectAllSytemUsers();

    SystemUser selectSystemUserById(int id);

    SystemUser selectSystemUserByLoginName(String loginName);

    int insertSystemUser(SystemUser systemUser);

    int updateSystemUser(SystemUser systemUser);

    int updateSystemUserStatus(@Param("id") int id,@Param("isValid") int isValid);

    List<SystemUser> selectSystemUserByParams(SystemUserParam systemUserParam);

    SystemUser selectSystemUserByLoginNameAndPassword(@Param("loginName") String loginName,
                                                      @Param("password") String password,
                                                      @Param("isValid") int isValid);
}
