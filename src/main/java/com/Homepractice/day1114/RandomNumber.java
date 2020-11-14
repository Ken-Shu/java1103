package com.Homepractice.day1114;

public class RandomNumber {

    public static double getBMI(double[] h_array, double[] w_array) {
        double bmi_sum = 0;
        double len = h_array.length;
        for (int i = 0; i < h_array.length; i++) {
            double h = h_array[i];
            double w = w_array[i];
            double bmi = w / Math.pow(h / 100, 2);
            bmi_sum += bmi;
        }
        return bmi_sum;
    }

    public static double getSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    public static double getAvg(double[] array) {
        double sum = getSum(array);
        return sum / array.length;
    }

    public static boolean getBMIboolean(int[] h_array,int n) {
        for (int i = 0; i < h_array.length; i++) {
            if (h_array[i] != n) {
                return false;
            }
        }
        return true;
    }
}
