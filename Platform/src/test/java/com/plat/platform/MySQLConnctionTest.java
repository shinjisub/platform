package com.plat.platform;


import java.sql.DriverManager;

import org.junit.Test;


public class MySQLConnctionTest {
	

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/platform?useSSL=false&serverTimezone=Asia/Seoul";
    private static final String USER = "root";
    private static final String PASSWORD = "TIGER";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try(java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("접속완료 : "+connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
