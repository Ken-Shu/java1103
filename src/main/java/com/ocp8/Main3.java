package com.ocp8;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        //int n=2;
        Class[][] classes = {
            {Car.class}, 
            {Bicycle.class}, 
            {Airplane.class}}; //3,1
        RentalCompany rc = new RentalCompany();

        //System.out.println(Arrays.toString(rc.getTransportations()));
        int chang = 0;
        int[][] num2 = {
            {1}, 
            {3}, 
            {2}};//3,1
//        int [][] num ={{rc.rentCar(),rc.rentBicycle(),rc.rentAir()},{1,3,2}};       
//         
//             for (int j = 0; j <= num.length;j++) {
//                
//                 chang = num [1][j];                 
//                 System.out.println(chang);
//             }        
        for (int i = 0; i <= 2; i++) {
            for (Class clazz : classes[0]) {
                clazz = classes[i][0]; //陣列[i][0] 最大陣列為1 內小鎮列為3 所以i值為0,1,2 最大陣列值為0
                for (int num : num2[0]) {
                    num = num2[i][0];
                    boolean success = rc.rentTransportation(clazz, num);

                    System.out.printf("租%s %d 台 %s \n", clazz.getSimpleName(), num, success ? "成功" : "失敗");
                }
            }
        }        
////        rc.rentTransportation(Bicycle.class, 2);
//        rc.rentTransportation(Airplane.class, 2);
//        rc.rentTransportation(Car.class, 2);
        rc.print();
    }
}
