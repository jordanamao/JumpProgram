package com.collabera.jdbcdemo.dao;

import static org.junit.Assert.assertTrue;

import java.sql.SQLException;

import org.junit.Test;

public class EmployeeDaoDeleteTest {
	
	@Test
	public void testDelete() {
		
		boolean deleted = false;
		
		EmployeeDaoTest employeeDao = new EmployeeDaoTest();
		
		try {
			deleted = employeeDao.delete(46);
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		assertTrue(deleted);
	}

}
