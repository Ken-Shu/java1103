package com.Homepractice.OCA;

public class Test_5Char {

    public static void main(String[] args) {
        StringBuilder mas = new StringBuilder("Hello");
        //因為char出的字元 Hello 只有到 4 號位置
        //可是 for 回圈內設定到 6 的位置
        //所以系統在執行時 會直接拋出例外 不會執行初回圈內的結果
        try {
            for (int i = 0; i < 6; i++) {
                switch (mas.charAt(i)) {
                    case 'H':
                        System.out.println("H");
                        break;
                    case 'e':
                        System.out.println("e");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("NO");
        }
        System.out.println("mas");
    }

}
