
package com.Homepractice.day0119;

import java.util.Date;
import java.util.concurrent.FutureTask;
import javax.swing.JLabel;
import yahoofinance.Stock;

public class MyStockController implements Runnable{
private String symbol;
private JLabel priceLabel;
private JLabel changleLabel;
public boolean play;

    public MyStockController(String symbol, JLabel priceLabel, JLabel changleLabel) {
        this.symbol = symbol;
        this.priceLabel = priceLabel;
        this.changleLabel = changleLabel;
        play = true;
    }

    @Override
    public void run() {
        while (play) {            
            try {
                System.out.println(new Date());
                FutureTask<Stock> task = new FutureTask<>(new MyStock(symbol));
                new Thread(task).start();
                Stock stock = task.get();
                double price = stock.getQuote().getPrice().doubleValue();
                double change = stock.getQuote().getChange().doubleValue();
                priceLabel.setText(String.format("%.2f",price));
                changleLabel.setText(String.format("%.2f",change));
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }


}
