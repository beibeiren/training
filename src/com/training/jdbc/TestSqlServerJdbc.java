package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSqlServerJdbc {

	public static void main(String[] args) {
		try {
			// 1. 加载数据库驱动
			//    forName是静态方法，把把驱动程序加载到内存中，把当前加载的驱动程序自动注册到DriverManager中。
			//    DriverManager是JDBC规范中唯一的一个类
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库驱动加载成功");
			// 2. 获取数据库连接
			// 		SSCM --> tcp/ipを有効にする -- service restart
			// 		properties --> security mode --> SQL Server and Windows Authentication mode
			String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=training";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("获取数据库连接成功");
			// 3. 创建Statement用于执行sql语句
			Statement stat = conn.createStatement();
			String insertSql = "insert into student "
					+ "(id, name) values(2, 'Green')";
			int row = stat.executeUpdate(insertSql);
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
