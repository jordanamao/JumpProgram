package com.collabera.jdbcdemo.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	
	EmployeeDaoGetAllTest.class,
	EmployeeDaoInsertTest.class,
	EmployeeDaoGetAllTest.class,
	EmployeeDaoDeleteTest.class,
	EmployeeDaoGetAllTest.class,
	})

public class AllTestsEmployeeDao {

}

