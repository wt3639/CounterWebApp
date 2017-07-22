package com.tom.counterwebapp.dao;

import java.util.List;

import com.tom.counterwebapp.bean.Student;



public interface StudentDAO {

	public int addStudent(Student student) throws Exception;

	public int updateStudent(Student student) throws Exception;
	
	public Student get(Long id) throws Exception;
	
	public int delStudent(Long id) throws Exception;
	
    public List<Student> query() throws Exception ;
	
    public Student selectByQq(String qq) throws Exception;
	
    public Student selectByName(String name) throws Exception;
	
    public Student selectByStId(String stId) throws Exception;
}