package com.tom.counterwebapp.controller;

import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.tom.counterwebapp.bean.Advertisement;
import com.tom.counterwebapp.bean.OpenidJson;
import com.tom.counterwebapp.bean.RespondResult;
import com.tom.counterwebapp.bean.UserInfo;
import com.tom.counterwebapp.service.IUserInfoService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/calory")  
public class CaloryController {
	    @Resource  
	    private IUserInfoService uiService;  
	      
	    @RequestMapping(value="/submit",method={RequestMethod.GET})  
	    public String toIndex(HttpServletRequest request,Model model) throws Exception{ 
	        String sex = request.getParameter("sex");
	        String height = request.getParameter("height");
	        String weight = request.getParameter("weight");
	        String age = request.getParameter("age");
	        String sportIndex = request.getParameter("sportindex");
	        String aerobic = request.getParameter("aerobic");
	        String goals = request.getParameter("goals");
	        String energy = request.getParameter("energy");
	        UserInfo ui = new UserInfo();
	        ui.setOpenid("website"+(int)(Math.random()*1000000000));
	        ui.setNickname("none");
	        ui.setRegion("unknown");
	        ui.setSex(sex);
	        ui.setHeight(Integer.parseInt(height));
	        ui.setWeight(Float.parseFloat(weight));
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
	         
	             basic = (int) (90 + 4.8* Integer.parseInt(height) + 13.4* Float.parseFloat(weight) - 5.7* Integer.parseInt(age));
	        }
	        else {
	             basic = (int) ( 450 + 3.1* Integer.parseInt(height) + 9.2* Float.parseFloat(weight) - 4.3* Integer.parseInt(age));      
	        }	       
	        Integer total =(int) (basic * Float.parseFloat(sportIndex)+Integer.parseInt(aerobic));	         
	            if(goals.equals("muscle")){
	                 need = ( total + Integer.parseInt(energy));
	                 prot =(int) ( 2.2 * Integer.parseInt(weight));
	                 fat =  (int) (need * 0.25 / 9 );
	                 cab =  ((need - prot*4 -fat*9)/4);
	            }else{
	                 need =  ( total - Integer.parseInt(energy));
	                 prot = (int) ( 2.75 * Float.parseFloat(weight));
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
	    public Map<String, Object> toJson(HttpServletRequest request) throws Exception{  
	    	Map<String,Object> modelMap = new HashMap<String,Object>();
	    	int result=0;
	    	String openid = request.getParameter("openid");
	    	String nickname = request.getParameter("nickname");
	    	String region = request.getParameter("region");
	        String sex = request.getParameter("sex");
	        String height = request.getParameter("height");
	        String weight = request.getParameter("weight");
	        String age = request.getParameter("age");
	        String sportIndex = request.getParameter("sportindex");
	        String aerobic = request.getParameter("aerobic");
	        String goals = request.getParameter("goals");
	        String energy = request.getParameter("energy");
	        UserInfo ui = new UserInfo();	
	        String decodenickname = new String(nickname.getBytes("ISO-8859-1"),"UTF-8");
	       // String decodenickname = new String("你好呀".getBytes("UTF-8"),"ISO-8859-1");
	        ui.setOpenid(openid);
	        ui.setNickname(decodenickname);
	        ui.setRegion(region);
	        ui.setSex(sex);
	        ui.setHeight(Integer.parseInt(height));
	        ui.setWeight(Float.parseFloat(weight));
	        ui.setAge(Integer.parseInt(age));
	        ui.setSportIndex(Float.parseFloat(sportIndex));
	        ui.setAerobic(Integer.parseInt(aerobic));
	        ui.setGoals(goals);
	        ui.setEnergy(Integer.parseInt(energy));
	        if(Math.round(uiService.selectByOpenid(openid).get(0).getCreate_at()/86400)==Math.round(new Date().getTime()/86400000)){
	        	 uiService.updateUser(ui);
	        }else{
	            result = uiService.addUser(ui);
	        }
	        modelMap.put("success", result);     
	        return modelMap;  
	    }
	    
	    
	    @RequestMapping(value="/getOpenid",method={RequestMethod.GET})  
	    @ResponseBody
	    public String toOpenid(HttpServletRequest request) throws Exception{  
	    	String ucode = request.getParameter("ucode");
	    	RestTemplate restTemplate=new RestTemplate();
	        String appid="wxbada8bbe7db00ca6";//appid需自己提供，此处的appid我随机编写  
	        String secret = "c871e2321371599cf9db00683d9376a6";//secret需自己提供，此处的secret我随机编写  
	        String url="https://api.weixin.qq.com/sns/jscode2session?appid="+appid+"&secret="+secret+"&js_code="+ucode+"&grant_type=authorization_code";
	        /* 注意：必须 http、https……开头，不然报错，浏览器地址栏不加 http 之类不出错是因为浏览器自动帮你补全了 */
	        HttpHeaders headers = new HttpHeaders();
	        /* 这个对象有add()方法，可往请求头存入信息 */       
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        /* 解决中文乱码的关键 , 还有更深层次的问题 关系到 StringHttpMessageConverter，先占位，以后补全*/ 
	        HttpEntity<String> entity = new HttpEntity<String>(headers);
	        /* body是Http消息体例如json串 */ 
	        //OpenidJson oj = new OpenidJson();
	        //restTemplate.getForObject(url, OpenidJson.class, oj);
	        ResponseEntity<String> re = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
	        /*上面这句返回的是往 url发送 post请求 请求携带信息为entity时返回的结果信息
	        String.class 是可以修改的，例如User.class，这样你就可以有 User resultUser接返回结果了*/
	        
	      //定义两种不同格式的字符串
	        String objectStr=re.getBody();
	        //1、使用JSONObject
	        JSONObject jsonObject=JSONObject.fromObject(objectStr);
	        OpenidJson oj=(OpenidJson)JSONObject.toBean(jsonObject, OpenidJson.class);
	        //获得jsonArray的第一个元素
	        //System.out.println("stu:"+oj);
	        return oj.getOpenid();
	    }
	    
	    @RequestMapping(value="/getAd",method={RequestMethod.GET})  
	    @ResponseBody
	    public Advertisement toAd(HttpServletRequest request) throws Exception{  
	    	Advertisement advertisement = new Advertisement();
	    	String id = request.getParameter("id");
	    	Advertisement ad2 = uiService.getAd(id);
	    	advertisement.setId(id);
	    	advertisement.setUpdateFlag(ad2.getUpdateFlag());
	    	advertisement.setText(ad2.getText());
	    	return advertisement;
	    	
	    }
	    
	    @RequestMapping(value="/getHistory",method={RequestMethod.GET})  
	    @ResponseBody
	    public Map<String, Object> toHistory(HttpServletRequest request) throws Exception{ 
	    	Map<String,Object> modelMap = new HashMap<String,Object>();
	    	String id = request.getParameter("id");
	    	List<UserInfo> uiList = uiService.selectByOpenid(id);
	    	modelMap.put("userList", uiList);
	    	return modelMap;
	    	
	    }
	    
}


