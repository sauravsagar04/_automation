package storedprocedureTesting;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SPtesting {
	Connection con = null;
	Statement stmt=null;
	ResultSet rs;
	CallableStatement cstmt;
	ResultSet rs1;
	ResultSet rs2;
	
	//we have to run only once before all the test methods
	@BeforeClass
	void setup() throws SQLException {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","12345");
	}
	
	@AfterClass
	void closeConection() throws SQLException {
		con.close();
	}
	
	@Test(priority=1)
	void test_storedProcedureExists() throws SQLException {
		stmt = con.createStatement();
		rs = stmt.executeQuery("SHOW PROCEDURE STATUS WHERE name='selectallcustomers'");
		
		rs.next();  //pointing to current row of resultset
		Assert.assertEquals(rs.getString("Name"), "selectallcustomers");
	}
	
	
	@Test(priority=2)
	void test_SelectAllCustomers() throws SQLException {
		//here we use callableStatement variable to run the storedprocedure query
		cstmt = con.prepareCall("{call selectallcustomers()}");  
		
		rs1 = cstmt.executeQuery(); //resultset 1
		
	
		
		stmt = con.createStatement();
		rs2 = stmt.executeQuery("select * from customers");
		
		
		Assert.assertEquals(compareResultSets(rs1,rs2), true);
		
	}
	
	@Test(priority=3)
	void order_cust_no() throws SQLException {
		cstmt = con.prepareCall("{call get_order_cust_no(?,?,?,?,?)}");
		cstmt.setInt(1, 141);
		
		cstmt.registerOutParameter(2, Types.INTEGER);
		cstmt.registerOutParameter(3, Types.INTEGER);
		cstmt.registerOutParameter(4, Types.INTEGER);
		cstmt.registerOutParameter(5, Types.INTEGER);
		
		cstmt.executeQuery();
		
		int shipped = cstmt.getInt(2);
		int canceled = cstmt.getInt(3);
		int resolved = cstmt.getInt(4);
		int disputed = cstmt.getInt(5);
		
		System.out.println(shipped+" "+canceled+" "+resolved+" "+disputed);
	}
	
	
	
	public boolean compareResultSets(ResultSet resultSet1, ResultSet resultSet2) throws SQLException {
		//here resultset1.next() point to current row of rs1 and resultset2.next() point to 
		// to current row of rs2 then using for loop it compare the every column
		//after for loop complete the first cycle then resultset1.next() move to next row and 
		//compare it next row of rs2
		while(resultSet1.next()) {               
			resultSet2.next();
			int count = resultSet1.getMetaData().getColumnCount();
			for(int i=1;i<=count;i++) {
				if(!StringUtils.equals(resultSet1.getString(i),resultSet2.getString(i))) {
					return false;
				}
			}
		}
		return true;
	}
	

}
