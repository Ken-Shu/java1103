
package com.StocktoHomework;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.concurrent.FutureTask;
import yahoofinance.Stock;


public class CompanyStock {
    /*
 *primary key(id); 
 *公司名稱 VARCHAR (10);
 *成交價 DECIMAL(10);
 *漲跌 DECIMAL(10);
 *漲跌幅 DECIMAL(10);
 *最高 DECIMAL(10);
 *最低 DECIMAL(10);
*/
    String symbol;
    
    private  static Connection conn;
    static {
        try {
            String url = "jdbc:derby://localhost:1527/APP";
            String user = "app";
            String password = "app";
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void importToStocksNumber(String url) throws Exception{
        String stocks = companyNumber(url);
        String sql = "Insert Into Stock(公司編號,公司名稱,公司股價,公司漲幅)"+"Values(?,?,?,?)";
        try {
            PreparedStatement pstmt = conn.prepareCall(sql);{
            pstmt.clearBatch();
           pstmt.setString(2, stocks);
           pstmt.addBatch();
        
            pstmt.executeBatch();
            System.out.println("匯入成功");
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    //公司名稱
     public String companyNumber(String number) throws Exception{
         this.symbol=number;
        Service service = new Service(this.symbol);
        FutureTask<Stock> task = new FutureTask<>(service);
        new Thread(task).start();
        Stock stock = task.get();
        String name = stock.getName();
        return name;
    }
     //公司股價
     public double companyStock() throws Exception{       
         Service service = new Service(this.symbol);
         FutureTask<Stock> task  = new FutureTask<>(service);
         new Thread(task).start();
         Stock stock = task.get();
         double stockprice =stock.getQuote().getPrice().doubleValue();
         return stockprice;
     }
     //公司漲幅
     public double companyChange() throws Exception{
         Service service = new Service(this.symbol);
         FutureTask<Stock> task = new FutureTask<>(service);
         new Thread(task).start();
         Stock stock = task.get();
         double stockchange = stock.getQuote().getChange().doubleValue();
         return stockchange;         
     }
//     public double company() throws Exception{
//         Service service = new Service(this.symbol);
//         FutureTask<Stock> task = new FutureTask<>(service);
//         new Thread(task).start();
//         Stock stock = task.get();
//         return ;
//     }
}
