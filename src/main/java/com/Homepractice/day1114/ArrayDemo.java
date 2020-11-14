
package com.Homepractice.day1114;




public class ArrayDemo {
    public static void main(String[] args) {
        double [] height ={180,170,150,165,188};
        double [] weight ={80,65,80,72,80};
        double bmi = RandomNumber.getBMI(height, weight);
        double h_sum = RandomNumber.getSum(height);
        double w_sum = RandomNumber.getSum(weight);
        double h_avg = RandomNumber.getAvg(height);
        double w_avg = RandomNumber.getAvg(weight);
        
        System.out.printf("總身高:%.1f,總體重:%.1f,身高平均:%.1f,體重平均:%.1f\n",h_sum,w_sum,h_avg,w_avg);
        System.out.println(bmi);
    }
}
