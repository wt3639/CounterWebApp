package com.test.testmybatis;

import org.junit.Test;

import com.test.basetest.BaseTest;;



public class testMybatis extends BaseTest{
	
	@Test
	public void test()  {
		 		
	}
/*
	@Test
	 @Transactional    
	 
	public void testGet() throws Exception {
		Student student1 = studentDAO.get(1L);
		Assert.assertEquals("id:1 name:刘佳义 school:河北科技大学 qq:1060015371",student1.toString()); 
		
	}
	@Test
	@Transactional   

	public void testUpdate() throws Exception{
		Student student2 = new Student();
		student2.setId(6L);
		student2.setName("Wo");
		studentDAO.updateStudent(student2);
		Student student3 = studentDAO.get(6L);
		Assert.assertEquals("Wo",student3.getName());
	}
	
	@Test
    @Transactional   

	public void testDelete() throws Exception  {
		studentDAO.delStudent(16L);
		Assert.assertEquals(null,studentDAO.get(16L));
	}
	
	@Test
	@Transactional
	public void testAdd() throws Exception{
		Student student = new Student();
		//student.setId(35L);
		student.setName("datian");
		student.setSchool("xiada");
		student.setQq("2333333");
		studentDAO.addStudent(student);
		Assert.assertEquals("datian",studentDAO.selectByQq("2333333").getName());
	}
	
	@Test
	@Transactional
	public void testSelectByName() throws Exception{
		
		Student student =studentDAO.selectByName("No.11");
		Assert.assertEquals("11zhong", student.getSchool());
	}
	
	@Test
	@Transactional
	public void testSelectByStId() throws Exception{
		
		Student student =studentDAO.selectByStId("38");
		Assert.assertEquals("刘佳义", student.getName());
	}
	*/
}
