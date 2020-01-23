package com.collabera.day19_maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.jdbcdemo.dao.CityDao;
import com.collabera.jdbcdemo.dao.CountryDao;
import com.collabera.jdbcdemo.model.City;
import com.collabera.jdbcdemo.model.Country;
import com.collabera.jdbcdemo.utils.JdbcUtils;


/**
 * Hello world!
 *
 */

public class App 
{
	static Logger log = Logger.getLogger(App.class.getName());

	public static void main( String[] args ) throws IOException{

		log.debug("Hello World!");
		log.info("JDBC test app started..");

		//get db properties
		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));

		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");

		//connect to database
		Connection conn = null;
		

		try {
			//conn2 = JdbcUtils.getConnection().createStatement();
			conn = (Connection) DriverManager.getConnection(dburl, user, password);		
			
			if(conn!=null) {
				System.out.println("mysql connection successfully acquired!");}

			String sql = "select * from city";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				log.info(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));}

			rs.close();
			conn.close();

		}catch (Exception ex) {
			System.out.println(ex.getMessage());}
		
		
		CityDao cityDao = new CityDao();

		try {
			List<City> cities = cityDao.findByName("Miami");
			if (cities.size() > 0) {	
				log.info(cities.get(0));}
		}catch (Exception e) {
			log.error(e.getMessage());
		}

		log.info("Testing CountryDao...");
		CountryDao countryDao = new CountryDao();


		try {
			log.info ("Testing CountryDao ...");
			List<Country> countries = countryDao.findByName("Congo");
			if (countries.size() > 0) {	
				log.info(countries.get(0));}
		}catch (Exception e) {
			log.error(e.getMessage());
		}

		
		try {
			String code = "XYZ";
			boolean count = countryDao.delete("XYZ");
			log.info("SUCCESS: Delete country: " + code );
		}catch (Exception x) {
			log.error(x.getMessage());	
		}
		
		
		try {
			Country country = new Country("AAA", "DDD", "Asia", "WWW");
			boolean success = countryDao.insert(country);
			if(success)
				log.info("SUCCESS: Insert Country: " + country);
		}catch (Exception x) {
			log.error(x.getMessage());
		}
	}
}
