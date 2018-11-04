package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try {
			// 1. 加载数据库驱动
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库驱动加载成功");
			// 2. 获取数据库连接
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=training";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("获取数据库连接成功");
			// 3. 创建Statement用于执行sql语句
			String insertSql = "insert into student "
					+ "(id, name) values(?, ?)";
			String updateSql = "update student set name = ? where id = ?";
			String deleteSql = "delete from student where id =?";
			PreparedStatement stat = conn.prepareStatement(deleteSql);
//			stat.setString(1, "Carry2");
//			stat.setInt(2, 2);
//			int row = stat.executeUpdate();
//			stat.setString(1, "Carry3");
//			stat.setInt(2, 3);
//			stat.executeUpdate();
			stat.setInt(1, 4);
			int row = stat.executeUpdate();
			if (row == 1) {
				System.out.println("新增数据成功");
			}else {
				System.out.println("新增数据失败");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("数据库驱动加载失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("获取数据库连接失败");
			e.printStackTrace();
		}
		System.out.println("Good bye!");

	}

}
