
package com.Homepractice.day1113;
/* 
調查五位學生之身高及體重如下。
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
 */
public class ArrayDemo {
    public static void main(String[] args) {
        double [] height = {172,168,164,170,176,199,210};
        double [] weight = {66,72,80,90,50,58,62};
        
        //算出總和
        double h_sum = getsum(height);
        double w_sum = getsum(weight);
        System.out.printf("總身高:%.1f , 總體重:%.1f",h_sum,w_sum);
        //算出平均
        double h_avg = h_sum/getavg(height);
        double w_avg = w_sum/getavg(weight);
        System.out.printf("平均身高:%.1f 平均體重:%.1f",h_avg,w_avg);
        //算出BMI平均
        double bmi_avg = getBMIAvg(height, weight);
        System.out.printf("BMI平均:.2f",bmi_avg);
    }
    
    public static double getBMIAvg(double [] h_array,double []w_array) {
        if(h_array!=w_array){
            System.out.println("資料長度不一樣");
        }
    return 0.0;}  //0.0 字串
    
    public static double getsum(double [] array) {
        double sum= 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    return sum;
    }
    public static double getavg(double []array) {
        double sum = getsum(array);
                return sum/array.length;
    }
}

