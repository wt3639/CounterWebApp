package com.tom.counterwebapp.service;

import java.util.List;

import com.tom.counterwebapp.bean.UserInfo;


public interface IUserInfoService {
	public int addUser(UserInfo ui) throws Exception;
	public boolean updateUser(UserInfo ui) throws Exception;
	public UserInfo selectByOpenid(Long openid) throws Exception;
	public boolean delUser(Long openid) throws Exception;
    public List<UserInfo> selectAll() throws Exception ;
}
