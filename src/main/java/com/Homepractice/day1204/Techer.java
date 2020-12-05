package com.Homepractice.day1204;

public class Techer {

    public School[] getschools() {
        School[] schools = {
            new StudentOne("Ken", 80, 100),
            new StudentTwo("Kelly", 100, 100)
        };
        return schools;
    }

    //取得數學總分
    public int getmath(School[] schools) {
        int sum = 0;
        for (School sc : schools) {
            sum += sc.getmath();
        }
        return sum;
    }
    //取得英文總分
    public int getenglish(School[] schools){
        int sum = 0;
        for(School sc : schools){
            sum += sc.getenglish();
            }
        return sum;
    }
    //印出學生成績
    public void print(School[]schools){        
        for (School sc : schools){
            String all = sc.getClass().getSimpleName();            
            int math = sc.getmath();
                    int english = sc.getenglish();                    
           System.out.printf("姓名:%s 數學: %d 英文: %d",all,math,english); 
           sc.classroom();
        }
    }
}
