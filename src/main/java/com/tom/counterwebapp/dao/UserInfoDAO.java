package com.tom.counterwebapp.dao;

import java.util.List;

import com.tom.counterwebapp.bean.Advertisement;
import com.tom.counterwebapp.bean.UserInfo;

public interface UserInfoDAO {
	public int addUser(UserInfo ui) throws Exception;

	public int updateUser(UserInfo ui) throws Exception;
	
	public List<UserInfo> get(String openid) throws Exception;
	
	public UserInfo getNewest(String openid) throws Exception;
	
	public int delUser(String openid) throws Exception;
	
    public List<UserInfo> query() throws Exception ;
    
    public Advertisement getAd(String id) throws Exception;
}
