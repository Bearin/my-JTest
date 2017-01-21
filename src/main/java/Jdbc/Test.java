package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class Test {

	public static void main(String[] args) {

	}
	
	static void testPreparedStatement() throws SQLException, ClassNotFoundException {
		//加载数据库驱动
		Class.forName( "com.somejdbcvendor.TheirJdbcDriver" );
		Connection conn = DriverManager.getConnection("mysql:\\localhost:1520",
				"root", "root");
		conn.setAutoCommit(false);  //不自动提交事务
		PreparedStatement preStatement = conn
				.prepareStatement("select distinct loan_type from loan where bank=?");
		preStatement.setString(1, "Citibank");
		
		ResultSet result = preStatement.executeQuery();
		conn.commit(); //显示提交事务

		while (result.next()) {
			System.out.println("Loan Type: " + result.getString("loan_type"));
		}
	}
	
	/**
	 * DataSource 根据环境变量获取配置信息,比如从properties文件加载配置信息
	 * 
	 * DataSource是个接口，方便实现，DriverManager的方法会url等信息直接写在了代码里，DataSource是为了方便第三方的实现。
	 */
	static void testDataSource(){
		DataSource dataSource;
		try{
//			Context initContext = new InitialContext();
//			Context envContext = (Context) initContext.lookup("java:/comp/enc");
//			dataSource = (DataSource)envContext.lookup("jdbc/demo");
//			Connection conn = dataSource.get
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
