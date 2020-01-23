package com.collabera.jdbcdemo.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.jdbcdemo.model.Country;
import com.collabera.jdbcdemo.utils.JdbcUtils;

public class CountryDao {

	private static final Logger logger = Logger.getLogger(CountryDao.class.getName()); //log4J
	//private static final CountryDao countryDao;

	private static HashMap<String,Country> cache = new HashMap <String, Country>();


	private Country resultSetToCountry (ResultSet rs) throws SQLException{

		Country country = null;
		String code = rs.getString("code");
		// is this city already in cache? if so, use it
		if (cache.containsKey(code)) country = cache.get(code);
		else country = new Country();

		country.setCode(code);
		country.setName(rs.getString("Name"));
		country.setRegion(rs.getString("Region"));
		country.setContinent(rs.getString("Continent"));

		String countrycode = rs.getString("countrycode");

		//add this city to the cache
		if (! cache.containsKey(code)) cache.put(code, country);
		//now get reference to the country this city refers
		logger.info("get country for city" + country.getName());
		//Country country = countryDao. findById(country code);
		//city.setCountry(country);
		return country;
	}

	//retrieve a country by its id
	
	public Country findById(Integer id) throws FileNotFoundException, IOException, SQLException {
		
		if (cache.containsKey(id)) return cache.get(id);

		List<Country> list = find ("WHERE id = " +id);
		return list.get(0);
	}

	//retrieve a country by name
	public List<Country> findByName (String name) throws FileNotFoundException, IOException, SQLException{
		
		//List<Country> list = find ("Where name = "+name+ "");
		//return list;

		List<Country> list = new ArrayList<Country>();

		PreparedStatement pstmt = JdbcUtils.getConnection().prepareStatement("SELECT * FROM Country where name + ?");
		pstmt.setString(1, "Thailand");

		try {
			ResultSet rs= pstmt.executeQuery();
			while(rs.next()){
				Country c = resultSetToCountry(rs);
				list.add(c);	
			}

		} catch( SQLException sqle) {
			logger.error("error executing: " + sqle);
		} finally {
			if(pstmt != null) try {pstmt.close();}
			catch(SQLException e) {/* ignore it */}
		}	
		return list;
	}

	
	public List<Country> find (String query) throws FileNotFoundException, IOException, SQLException {

		List<Country> list = new ArrayList<Country>();

		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));
		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");

		java.sql.Statement stmt =  DriverManager.getConnection(dburl, user, password).createStatement();
		String sqlquery = "SELECT * FROM country c" + query;
		
		try {
			logger.debug("executing query: " + sqlquery);
			ResultSet rs = stmt.executeQuery (sqlquery);
			while (rs.next()) {

				Country c = resultSetToCountry (rs);
				list.add(c);
			}

		} catch(SQLException sqle) {
			logger.error("error executing: " + sqlquery, sqle);	
		} finally {

			if (stmt != null) try {stmt.close();}
			catch(SQLException e) { /* ignore it */}
		}
		return list;
	}
	
	
	
	public boolean delete(String code) throws SQLException {
		
		if (code == null ) return false;
		
		PreparedStatement statement = JdbcUtils.getConnection().prepareStatement("DELETE FROM COUNTYR where name = ?");
		statement.setString(1,code);
		
		int count = 0;
		if (statement == null) return false;
		try {
			count = statement.executeUpdate();	
		}catch (SQLException sqle) {
			logger.error("error executing delete for code:" + code);
		}finally {
			
			statement.close();
		}
		
		return count > 0;	
	}
	
	
	public boolean insert (Country country) throws SQLException{
		
		if (country == null) return false;
		
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("INSERT INTO country(code, name, continent, region) VALUES (?,?,?,?)");
				
				statement.setString(1, country.getCode());
				statement.setString(2, country.getName());
				statement.setString(3, country.getContinent());
				statement.setString(4, country.getRegion());
				
				int count = 0;
				try {
					count = statement.executeUpdate();
					
				}catch (SQLException sqle) {			
					logger.error("error executing insert for country: " + country);
					
				} finally {
					statement.close();}
				return count > 0;
	}
	
}
