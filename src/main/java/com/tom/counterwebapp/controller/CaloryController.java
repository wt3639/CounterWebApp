package com.tom.counterwebapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tom.counterwebapp.bean.Student;
import com.tom.counterwebapp.service.IStudentService;

@Controller
@RequestMapping("/calory")  
public class CaloryController {
	 @Resource  
	    private IStudentService studentService;  
	      
	    @RequestMapping(value="/submit",method={RequestMethod.GET})  
	    public String toIndex(HttpServletRequest request,Model model) throws Exception{  
	        String sex = request.getParameter("Sex");
	        String height = request.getParameter("height");
	        String weight = request.getParameter("weight");
	        String age = request.getParameter("age");
	        String sportIndex = request.getParameter("sportIndex");
	        String aerobic = request.getParameter("aerobic");
	        String goal = request.getParameter("Goal");
	        String energy = request.getParameter("energy");
	        Student student = new Student();
	        student.setName(sex);
	        student.setQq(height);
	        student.setLink(weight);
	        student.setSchool(age);
	        student.setSource(sportIndex);
	        student.setStId(aerobic);
	        student.settA(goal);
	        student.setType(energy);
	        studentService.addStudent(student);
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
	        Integer total =(int) (basic * Double.parseDouble(sportIndex)+Integer.parseInt(aerobic));	         
	            if(goal.equals("muscle")){
	                 need = ( total + Integer.parseInt(energy));
	                 prot =(int) ( 2.2 * Integer.parseInt(weight));
	                 fat =  (int) (need * 0.25 / 8 );
	                 cab =  ((need - prot*4 -fat*8)/4);
	            }else{
	                 need =  ( total - Integer.parseInt(energy));
	                 prot = (int) ( 2.75 * Integer.parseInt(weight));
	                 fat = (int) ( need * 0.2 / 8) ;
	                 cab =  ((need - prot*4 -fat*8)/4);
	               }                
	          	        
	        model.addAttribute("basic", basic); 
	        model.addAttribute("total", total); 
	        model.addAttribute("need", need); 
	        model.addAttribute("prot", prot); 
	        model.addAttribute("fat", fat); 
	        model.addAttribute("cab", cab); 
	        return "calResult";  
	    }
}
