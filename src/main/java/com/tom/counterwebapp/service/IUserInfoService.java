package com.tom.counterwebapp.service;

import java.util.List;

import com.tom.counterwebapp.bean.Advertisement;
import com.tom.counterwebapp.bean.UserInfo;


public interface IUserInfoService {
	public int addUser(UserInfo ui) throws Exception;
	public boolean updateUser(UserInfo ui) throws Exception;
	public List<UserInfo> selectByOpenid(String openid) throws Exception;
	public boolean delUser(String openid) throws Exception;
    public List<UserInfo> selectAll() throws Exception ;
    //public boolean userExist(String openid) throws Exception;
    public Advertisement getAd(String id) throws Exception;
}
