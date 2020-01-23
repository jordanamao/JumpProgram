package com.collabera.jdbcdemo.dao;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

import com.collabera.jdbcdemo.model.Department;
import com.collabera.jdbcdemo.model.Employee;



public class EmployeeDaoInsertTest {
	
	@Test
	public void testInsert() {
	EmployeeDaoTest employeeDao = new EmployeeDaoTest();
	boolean inserted = false;
	
	try {
		inserted = employeeDao.insert(new Employee(46,"Jon6", "Snow", Department.DEVELOPMENT));
	}catch(SQLException e) {
			e.printStackTrace();
	}
	assertTrue(inserted);
	}


}
