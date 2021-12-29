package com.rahul.mybatis.derby.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rahul.mybatis.derby.model.Employee;

@Mapper
public interface EmployeeMyBatisRepository {
	
	@Select("select * from employees")
	public List<Employee> findAll();
	
	@Select("select * from employees where id =#{id}")
	public Employee findById(long id);
	
	@Delete("delete from employees where id =#{id}")
	public int deleteById(long id);
	
	@Insert("insert into employees(id, first_name, last_name, email_address)" + "values (#{id},#{firstname},#{lastname},#{emailId})")
	public int insert (Employee employee);
	
	@Update("Update employees set first_name=#{firstname}, " +
	        " last_name=#{lastname}, email_address=#{emailId} where id=#{id}")
	public int update(Employee employee);
}
