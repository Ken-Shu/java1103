
package com.ocp31_db.drink;

import java.util.Scanner;

public class DrinkStore {
    private static boolean exit;
    public static void main(String[] args) throws Exception {
        while (!exit) {
            menu();
            if(!exit){
            System.out.println("按下任一鍵繼續....");
            System.in.read();
            }
        }
    }
    
    public static void menu() {
        System.out.println("------------");
        System.out.println(" 1 . Read");
        System.out.println(" 2 . Create");
        System.out.println(" 3 . Update amount");
        System.out.println(" 4 . Delete");
        System.out.println(" 5 . Exit");
        System.out.println("------------");
                
    }
    public static void service() {
        Scanner sc = new Scanner(System.in);
        System.out.print("==> ");
        int n = sc.nextInt();
        DrinkDao dao = new DrinkDao();
        switch(n){
            case 1:              
                dao.read();
                break;               
                case 2:
                    System.out.println("Please input drink name : ");
                    String name = sc.next();
                    System.out.println("Please input drink price : ");
                    int price = sc.nextInt();
                    System.out.println("Please input drink amount : ");
                    int amount = sc.nextInt();
                    dao.create(name, n, n);
                break;
                case 3:
                    System.out.println("Please input update id:");
                    int updateId = sc.nextInt();
                    System.out.println("Please input drink amount of update:");
                    int updateAmount = sc.nextInt();
                    dao.update(updateId, updateAmount);
                break;
                case 4:
                    System.out.println("Please input delete id:");
                    int deleteId = sc.nextInt();
                    dao.delete(deleteId);
                break;
                case 5:
                exit =true;
        }
    }
}
