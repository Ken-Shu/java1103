package com.ocp10.Computer;

import java.math.BigInteger;
//若無法跟介面(Computer)同樣 則變成抽象類別(半成品類別)
//需再class 前加上 abstract(抽象)
//interface 跟 abstract 不能 new
public abstract class Mobile implements Computer {

    @Override
    public int add(int x, int y) {
//使用之數值超過long則可用BidInterger(無限大的整數)
//BigDecimal大十進制 可運算小數
        BigInteger b1 = new BigInteger(x + "");
        BigInteger b2 = new BigInteger(y + "");
        BigInteger sum = b1.add(b2);
        return sum.intValue();
    }

}
