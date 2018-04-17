package com.tom.counterwebapp.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.transform.AbstractClassLoader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tom.counterwebapp.bean.Advertisement;
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
	public List<UserInfo> selectByOpenid(String openid) throws Exception {
		List<UserInfo> ui = uiDAO.get(openid);
		return ui;
	}
	
	public boolean delUser(String openid) throws Exception{
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
    /*
    @Override
	public boolean userExist(String openid) throws Exception {
		// TODO Auto-generated method stub
    	UserInfo ui  = uiDAO.get(openid);
    	if(ui==null) {
    		return false;
    	}else {
		return true;
    	}
	}
*/
   @Override
    public boolean InsertUserByDay(UserInfo ui) throws Exception {
	   int result;
	   if(Math.round(uiDAO.getNewest(ui.getOpenid()).getCreate_at()/86400)==Math.round(new Date().getTime()/86400000)){
      	  result = uiDAO.updateUser(ui);
      	 
      }else{
         result=uiDAO.addUser(ui);
         
      }
	   if(result>0){
		   return true;
	   }else{
		   return false;
	   }
	   
    	
    }
    
    @Override
	public Advertisement getAd(String id) throws Exception {
		Advertisement ad = uiDAO.getAd(id);
		return ad;
	}
}
