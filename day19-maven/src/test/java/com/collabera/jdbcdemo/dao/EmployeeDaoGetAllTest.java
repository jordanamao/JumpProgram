package com.collabera.jdbcdemo.dao;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.collabera.jdbcdemo.model.Employee;

public class EmployeeDaoGetAllTest {
	
	
	@Test
	public void testGetAllEmployees() throws FileNotFoundException, IOException {
		
		EmployeeDaoTest employeeDao = new EmployeeDaoTest();
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			list = employeeDao.getAllEmployees();
			
		}catch(SQLException e1) {
			
			e1.printStackTrace();
		}
		
		for(Employee e:list)
			System.out.println(e);
		
		System.out.println("-----------------------------");
		
		assertTrue(list.size()>0);
		
	}

}
