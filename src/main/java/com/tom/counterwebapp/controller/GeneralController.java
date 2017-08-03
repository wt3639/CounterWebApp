package com.tom.counterwebapp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import com.tom.counterwebapp.bean.Student;
import com.tom.counterwebapp.service.IStudentService;


@Controller
@RequestMapping("/user")  
public class GeneralController {

	   @Resource  
	    private IStudentService studentService;  
	      
	    @RequestMapping("/showUser")  
	    public String toIndex(HttpServletRequest request,Model model) throws Exception{  
	        Long studentId = Long.parseLong(request.getParameter("id"));  
	        Student student = this.studentService.selectById(studentId);  
	        model.addAttribute("student", student);  
	        return "result";  
	    }
	    
	    @RequestMapping("/delete")  
	    public String delete(HttpServletRequest request,Model model) throws Exception{  
	        Long studentId = Long.parseLong(request.getParameter("id"));  
	        boolean status = this.studentService.delStudent(studentId);  
	        model.addAttribute("status", status);  
	        return "redirect";  
	    }
	    
	    @RequestMapping("/update")  
	    public String update(Student student,Model model) throws Exception{  
	        Boolean status = this.studentService.updateStudent(student);  
	        model.addAttribute("status", status);  
	        return "redirect";  
	    }
	    
}
