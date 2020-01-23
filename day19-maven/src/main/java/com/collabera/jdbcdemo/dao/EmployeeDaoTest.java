package com.collabera.jdbcdemo.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.day19_maven.App;
import com.collabera.jdbcdemo.model.Country;
import com.collabera.jdbcdemo.model.Department;
import com.collabera.jdbcdemo.model.Employee;
import com.collabera.jdbcdemo.utils.JdbcUtils;


public class EmployeeDaoTest
{
	static Logger logger = Logger.getLogger(EmployeeDaoTest.class.getName());


	public static void main( String[] args ) throws IOException, SQLException{


		//testing the insert function
		try {
			Department[] department = Department.values();
			Employee employee = new Employee (3,"Jordan","Mao", department[3]);

			boolean success = EmployeeDaoTest.insert(employee);
			if(success)
				logger.info("SUCCESS: Insert Employee: " + employee);
		}catch (Exception x) {
			logger.error(x.getMessage());
		}


		//testing the delete function
		try {
			int id = 9;
			boolean count = EmployeeDaoTest.delete(id);
			logger.info("SUCCESS: Delete employee with employee_id: " + id);
		}catch (Exception x) {
			logger.error(x.getMessage());	
		}


		//testing the getAllEmployee function
		try {
			List<Employee> employees = getAllEmployees();
			System.out.println("Printing out all employees!");
			for(int i=0;i<employees.size();i++){
				System.out.println(employees.get(i));} 

		}catch(Exception x) {
			logger.error(x.getMessage());
		}
	}

	static List<Employee> getAllEmployees() throws FileNotFoundException, IOException, SQLException{

		Connection conn = JdbcUtils.getConnection();
		List<Employee> employees = new ArrayList<Employee>();
		Department[] department = Department.values();

		if(conn!=null) {
			System.out.println("mysql connection successfully acquired!");}

		String sql = "select * from employees";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while(rs.next()) {
			logger.info(rs.getInt("employee_id") + " " + 
					rs.getString("lastName") + " " +
					rs.getString("firstName") + " " + 
					rs.getInt("department_id"));

			Employee employee = new Employee();

			employee.setId(rs.getInt("employee_id"));
			employee.setLastName(rs.getString("lastName"));
			employee.setFirstName(rs.getString("firstName"));

			for (Department d : department) 
			{ if ((d.ordinal()+1) == rs.getInt("department_id"))  //integer value of enum starts from 0
			{employee.setDepartment(d);}
			}

			employees.add(employee);
		}
		rs.close();
		conn.close();

		return employees;
	}


	public static boolean insert (Employee employee) throws SQLException{

		if (employee == null) {return false;}

		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstm = conn.prepareStatement("INSERT INTO `employees` VALUES (?,?,?,?)");

		pstm.setInt(1, employee.getId());
		pstm.setString(2, employee.getLastName());
		pstm.setString(3, employee.getFirstName());
		pstm.setInt(4, (employee.getDepartment().ordinal())+1);

		int count = 0;
		try {
			//executeUpdate returns 1 if updates correctly, else returns 0.
			count = pstm.executeUpdate();

		}catch (SQLException sqle) {			
			logger.error("error executing insert for employee: " + employee);		
		} finally {
			pstm.close();}
		return count > 0;
	}



	public static boolean delete(int id) throws SQLException {

		//if (id ) return false;

		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstmt = conn.prepareStatement("DELETE FROM `employees` WHERE employee_id = ?");
		pstmt.setInt(1,id);

		int count = 0;
		if (pstmt == null) return false;
		try {
			count = pstmt.executeUpdate(); //count should equal to 1, if successful 	
		}catch (SQLException sqle) {
			logger.error("error executing delete for employee:" + id);
		}finally {

			pstmt.close();
		}
		return count > 0;	
	}

}



	

	
	

