/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmnet.farmnetwebservice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author CHILIKWEM
 */
public class DbConnection {

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/farmnet";

        String user = "student";
        String pass = "student";

        Connection conn = null;

        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to a selected database...");
        
        conn = DriverManager.getConnection(url, user, pass);

        return conn;

    }

}