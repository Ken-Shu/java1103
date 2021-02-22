package com.Homepractice.OCA物件導向;

public class SonExtendFather extends FatherExtends{
    public static void main(String[] args) {
        FatherExtends fat = new SonExtendFather();
        fat.setmoney(500);
        System.out.println("爸爸有"+fat.money);
        //因為上述 fat 有500 所以同為FatherExtends 的 money 物件
        //但是因為 new 了一個新的 son 物件 所以同時也另外新建了一個 money物件
        //如果將 原先的 money 物件 宣告為 static 的話 則會變成共用物件 
        //此時 fat 和 son 的 money 都會變成 500
        SonExtendFather son = new SonExtendFather();
        System.out.println("爸爸要給兒子200元");
        int fatherForson = 200;
        //兒子的錢
        int son1 = son.setmoney(fatherForson);
        //爸爸剩下的錢
        
        System.out.println("兒子現在有"+son1);
        System.out.println("爸爸還有"+(fat.getmoney()-son1));
        
    }
}