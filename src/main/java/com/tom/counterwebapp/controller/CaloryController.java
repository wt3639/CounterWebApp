package com.tom.counterwebapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tom.counterwebapp.bean.RespondResult;
import com.tom.counterwebapp.bean.UserInfo;
import com.tom.counterwebapp.service.IUserInfoService;

@Controller
@RequestMapping("/calory")  
public class CaloryController {
	    @Resource  
	    private IUserInfoService uiService;  
	      
	    @RequestMapping(value="/submit",method={RequestMethod.GET})  
	    public String toIndex(HttpServletRequest request,Model model) throws Exception{ 
	    	String openid = request.getParameter("openid");
	        String sex = request.getParameter("sex");
	        String height = request.getParameter("height");
	        String weight = request.getParameter("weight");
	        String age = request.getParameter("age");
	        String sportIndex = request.getParameter("sportindex");
	        String aerobic = request.getParameter("aerobic");
	        String goals = request.getParameter("goals");
	        String energy = request.getParameter("energy");
	        UserInfo ui = new UserInfo();
	        if(openid==null) {
	        	ui.setOpenid(new Double(Math.random()*100000).longValue());
	        }else {
	        	ui.setOpenid(Long.parseLong(openid));
	        }
	        ui.setSex(sex);
	        ui.setHeight(Integer.parseInt(height));
	        ui.setWeight(Integer.parseInt(weight));
	        ui.setAge(Integer.parseInt(age));
	        ui.setSportIndex(Float.parseFloat(sportIndex));
	        ui.setAerobic(Integer.parseInt(aerobic));
	        ui.setGoals(goals);
	        ui.setEnergy(Integer.parseInt(energy));
	        
	        uiService.addUser(ui);
	        Integer basic =null;
	        Integer need=null;
	        Integer prot =null;
	        Integer fat =null;
	        Integer cab =null;
	        if(sex.equals("male")){
	         
	             basic = (int) (90 + 4.8* Integer.parseInt(height) + 13.4* Integer.parseInt(weight) - 5.7* Integer.parseInt(age));
	        }
	        else {
	             basic = (int) ( 450 + 3.1* Integer.parseInt(height) + 9.2* Integer.parseInt(weight) - 4.3* Integer.parseInt(age));      
	        }	       
	        Integer total =(int) (basic * Float.parseFloat(sportIndex)+Integer.parseInt(aerobic));	         
	            if(goals.equals("muscle")){
	                 need = ( total + Integer.parseInt(energy));
	                 prot =(int) ( 2.2 * Integer.parseInt(weight));
	                 fat =  (int) (need * 0.25 / 9 );
	                 cab =  ((need - prot*4 -fat*9)/4);
	            }else{
	                 need =  ( total - Integer.parseInt(energy));
	                 prot = (int) ( 2.75 * Integer.parseInt(weight));
	                 fat = (int) ( need * 0.2 / 9) ;
	                 cab =  ((need - prot*4 -fat*9)/4);
	               }                
	          	        
	        model.addAttribute("basic", basic); 
	        model.addAttribute("total", total); 
	        model.addAttribute("need", need); 
	        model.addAttribute("prot", prot); 
	        model.addAttribute("fat", fat); 
	        model.addAttribute("cab", cab); 
	        return "calResult";  
	    }
	    
	    @RequestMapping(value="/getjson",method={RequestMethod.GET})  
	    @ResponseBody
	    public RespondResult toJson(HttpServletRequest request) throws Exception{  
	    	RespondResult rr = new RespondResult();
	    	String openid = request.getParameter("openid");
	        String sex = request.getParameter("sex");
	        String height = request.getParameter("height");
	        String weight = request.getParameter("weight");
	        String age = request.getParameter("age");
	        String sportIndex = request.getParameter("sportindex");
	        String aerobic = request.getParameter("aerobic");
	        String goals = request.getParameter("goals");
	        String energy = request.getParameter("energy");
	        UserInfo ui = new UserInfo();
	        if(openid==null) {
	        	ui.setOpenid(new Double(Math.random()*100000).longValue());
	        }else {
	        	ui.setOpenid(Long.parseLong(openid));
	        }
	        ui.setSex(sex);
	        ui.setHeight(Integer.parseInt(height));
	        ui.setWeight(Integer.parseInt(weight));
	        ui.setAge(Integer.parseInt(age));
	        ui.setSportIndex(Float.parseFloat(sportIndex));
	        ui.setAerobic(Integer.parseInt(aerobic));
	        ui.setGoals(goals);
	        ui.setEnergy(Integer.parseInt(energy));    
	        uiService.addUser(ui);
	        Integer basic =null;
	        Integer need=null;
	        Integer prot =null;
	        Integer fat =null;
	        Integer cab =null;
	        if(sex.equals("male")){
	         
	             basic = (int) (90 + 4.8* Integer.parseInt(height) + 13.4* Integer.parseInt(weight) - 5.7* Integer.parseInt(age));
	        }
	        else {
	             basic = (int) ( 450 + 3.1* Integer.parseInt(height) + 9.2* Integer.parseInt(weight) - 4.3* Integer.parseInt(age));      
	        }	       
	        Integer total =(int) (basic * Float.parseFloat(sportIndex)+Integer.parseInt(aerobic));	         
	            if(goals.equals("muscle")){
	                 need = ( total + Integer.parseInt(energy));
	                 prot =(int) ( 2.2 * Integer.parseInt(weight));
	                 fat =  (int) (need * 0.25 / 9 );
	                 cab =  ((need - prot*4 -fat*9)/4);
	            }else{
	                 need =  ( total - Integer.parseInt(energy));
	                 prot = (int) ( 2.75 * Integer.parseInt(weight));
	                 fat = (int) ( need * 0.2 / 9) ;
	                 cab =  ((need - prot*4 -fat*9)/4);
	               }                
	        rr.setBasic(basic);  	        
	        rr.setCab(cab);
	        rr.setFat(fat);
	        rr.setNeed(need);
	        rr.setProt(prot);
	        rr.setTotal(total);
	        return rr;  
	    }
}
