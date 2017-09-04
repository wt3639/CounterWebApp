package com.tom.counterwebapp.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tom.counterwebapp.bean.UserInfo;
import com.tom.counterwebapp.dao.UserInfoDAO;


@Service(value="UserInfoService")
public class UserInfoService implements IUserInfoService{
	@Autowired  
	UserInfoDAO uiDAO;
	
	@Override
	public int addUser(UserInfo ui) throws Exception {
		// TODO Auto-generated method stub
		int result = uiDAO.addUser(ui);
		return result;
	}

	@Override
	public boolean updateUser(UserInfo ui) throws Exception {
		int result = uiDAO.updateUser(ui);
		if(result>0)
			return true;
		else 
			return false;
	}

	@Override
	public UserInfo selectByOpenid(Long openid) throws Exception {
		UserInfo ui = uiDAO.get(openid);
		return ui;
	}
	
	public boolean delUser(Long openid) throws Exception{
		int result = uiDAO.delUser(openid);
		if(result>0)
			return true;
		else 
			return false;
	}
	 
    public List<UserInfo> selectAll() throws Exception{
    	List<UserInfo> ls = uiDAO.query();
    	return ls;
    }

}
