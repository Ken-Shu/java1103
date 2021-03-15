
package com.StocktoHomework;

public class Stock1 {
    //股票編號
    private int id; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String 公司名稱;
    private double 成交價;
    private double 漲跌;
    private double 漲跌幅;
    private double 最高;
    private double 最低;

    public String get公司名稱() {
        return 公司名稱;
    }

    public void set公司名稱(String 公司名稱) {
        this.公司名稱 = 公司名稱;
    }

    public double get成交價() {
        return 成交價;
    }

    public void set成交價(double 成交價) {
        this.成交價 = 成交價;
    }

    public double get漲跌() {
        return 漲跌;
    }

    public void set漲跌(double 漲跌) {
        this.漲跌 = 漲跌;
    }

    public double get漲跌幅() {
        return 漲跌幅;
    }

    public void set漲跌幅(double 漲跌幅) {
        this.漲跌幅 = 漲跌幅;
    }

    public double get最高() {
        return 最高;
    }

    public void set最高(double 最高) {
        this.最高 = 最高;
    }

    public double get最低() {
        return 最低;
    }

    public void set最低(double 最低) {
        this.最低 = 最低;
    }
    
}
