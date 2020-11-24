package com.ocp7;

public class Book {
    //建立物件類   //建立屬性(類別屬性)(物件屬性)
 public static String publichName = "gotop"; //物件初始值設定 加上 static(Globlo區域)就會變成類別屬性(大家都共用)
 private String name;  // 物件屬性
 private int price;   // 物件屬性
 // 建立方法 ; getter/setter  && to String();
  public Book(){
     System.out.println("執行 Book 建構子");
 }
  public Book(String name , int price){
      System.out.println("執行Book建構子");
      System.out.printf("書名:%s , 價格: %d \n",name,price);
      this.name=name;
      this.price=price;
  }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "publishName=" + publichName + ", name=" + name + ", price=" + price + '}';
    }

  
 
}
