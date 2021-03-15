
package com.StocktoHomework;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateStcok {
    public static void main(String[] args) throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url = "jdbc:derby://localhost:1527/APP";
        String user = "KEN";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user,password);
        System.err.printf("資料庫是否關閉 : %b \n",conn.isClosed());
        
    }
}
