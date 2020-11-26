package com.ocp8;

import java.util.Arrays;

public class Main {

    //主程式
    public static void main(String[] args) {
        //開公司
        RentalCompany rc = new RentalCompany();
        //查看庫存
        Transportation[] tranc = rc.getTransportations();
        System.out.println(Arrays.toString(tranc));
        //租一台車
        int sum = 0;
        for (Transportation ts : tranc) {
            if (ts instanceof Car) {//ts裡面是不是包含car 的物件
                //System.out.println(ts); //如果是 就打印ts
                Car car = (Car) ts; //Car(包裝) 轉型成 car  ts是整個大包裝

                //((Car)ts).play();
                //Car car = (Car)ts; 另一種轉型寫法
                //car.play();
                System.out.printf("我要租 %s \n", car);
                int amount = ts.getAmount();
                amount = amount - 1;
                ts.setAmount(amount);
                sum +=1* ts.getPrice();

            }
            if (ts instanceof Bicycle) {
                ((Bicycle) ts).message();
                System.out.printf("我要租: %s \n", ts);
                int amount = ts.getAmount();
                amount = amount - 3;
                ts.setAmount(amount);
                sum += ts.getPrice() * 3;

            }
            if (ts instanceof Airplane) {
                ((Airplane) ts).service();
                System.out.printf("我要租: %s\n", ts);
                int amount = ts.getAmount();
                amount = amount - 2;
                ts.setAmount(amount);
                sum += ts.getPrice() * 2;

            }
        }
        //更新後得庫存資料
        System.out.printf("更新後庫存量:" + Arrays.toString(tranc));
        System.out.println();

        //試問總租金
        System.out.printf("總租金: ",sum);

    }
}
