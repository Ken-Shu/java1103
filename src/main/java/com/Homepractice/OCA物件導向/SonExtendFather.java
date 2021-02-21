package com.Homepractice.OCA物件導向;

public class SonExtendFather extends FatherExtends{
    public static void main(String[] args) {
        //兒子洗澡
        SonExtendFather so = new SonExtendFather();
        //兒子洗澡 兒子把自己的方法 丟給了爸爸
        FatherExtends fo = new SonExtendFather();
        //爸爸洗澡 爸爸依然照自己的方法 沒有被兒子的方法影響
        FatherExtends foo = new FatherExtends();
        so.brush();
        fo.brush();
        foo.brush();
    }

    @Override
    public void brush() {
        System.out.println("兒子洗澡");
    }
    
}
