package com.test.testservice;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.test.basetest.BaseTest;
import com.tom.counterwebapp.bean.Student;
import com.tom.counterwebapp.service.StudentService;



public class ServiceTest extends BaseTest{
	
	@Autowired
	StudentService studentService;
	/*
	@Test
	 @Transactional    
	 
	public void testGet() throws Exception {
		Student student1 = studentService.selectById(1L);
		Assert.assertEquals("id:1 name:刘佳义 school:河北科技大学 qq:1060015371",student1.toString()); 
		
	}
	@Test
	@Transactional  

	public void testUpdate() throws Exception{
		Student student2 = new Student();
		student2.setId(6L);
		student2.setName("Wo");
		boolean result = studentService.updateStudent(student2);
		Assert.assertEquals(true,result);
	}
	
	@Test
   @Transactional   

	public void testDelete() throws Exception  {
		boolean result =studentService.delStudent(6L);
		Assert.assertEquals(true,result);
	}
	
	@Test
	@Transactional
	public void testAdd() throws Exception{
		Student student = new Student();
		//student.setId(35L);
		student.setName("datian");
		student.setSchool("xiada");
		student.setQq("2333333");
		studentService.addStudent(student);
		Assert.assertEquals("datian",studentService.selectByQq("2333333").getName());
	}
	
	@Test
	@Transactional
	public void testSelectByName() throws Exception{
		
		Student student =studentService.selectByName("No.88");
		Assert.assertEquals("88zhong", student.getSchool());
	}
	
	@Test
	@Transactional
	public void testSelectByStId() throws Exception{
		
		Student student =studentService.selectByStId("38");
		Assert.assertEquals("刘佳义", student.getName());
	}
*/
}
