package com.training.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class TestDriver {

	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Class.forName("org.mariadb.jdbc.Driver");
			Enumeration<Driver> drivers = DriverManager.getDrivers();
			while(drivers.hasMoreElements()) {
				Driver driver = drivers.nextElement();
				System.out.println(driver);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
