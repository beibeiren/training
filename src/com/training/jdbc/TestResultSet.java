package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResultSet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			// 1. 加载数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库驱动加载成功");
			// 2. 获取数据库连接
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=training";
			String username = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("获取数据库连接成功");
			// 3. 创建Statement用于执行sql语句
			stat = conn.createStatement();
			String sql = "select * from student ";
			// 4. 获得查询结果
			rs = stat.executeQuery(sql);
			while (rs.next()) {// 判断是否有下一行，如果有移动到下一行
				// 在结果集中通过字段名获取数据，数据类型和数据库中数据类型保持一致(通过字段名获取)
				Integer id = rs.getInt("id");  
				String name = rs.getString("name");
				System.out.println("id=" + id + ", name=" + name);
			}
			rs = stat.executeQuery(sql);
			while (rs.next()) {// 判断是否有下一行，如果有移动到下一行
				// 在结果集中也可以通过下标获取数据，与数组和集合不同，JDBC的下标是是从1开始(通过下标获取)
				int i = 1;
				Integer id2 = rs.getInt(i++);  
				String name2 = rs.getString(i++);
				System.out.println("id2=" + id2 + ", name2=" + name2);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动加载失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("获取数据库连接失败");
			e.printStackTrace();
		} finally {
			// 5. 关闭并释放资源
			try {
				if (conn != null) {
					conn.close();
				}
				if (stat != null) {
					stat.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Good bye!");
	}

}
