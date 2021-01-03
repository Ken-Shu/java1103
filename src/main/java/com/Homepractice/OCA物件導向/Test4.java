package com.Homepractice.OCA物件導向;

//public class Test4 {

    class DBConnection {

        String name;
        String password;
    }

    public class Test4 {

        DBConnection configuration(String name1, String password1) {
            System.out.println(name1 + password1);
            return new DBConnection();
        }

        public static void main(String[] args) {
            Test4 t4 = new Test4();
            
            DBConnection dbc = t4.configuration("123", "123");
            //System.out.println(dbc.toString());
            System.out.println(t4.configuration("555", "999"));
        }
    }
//}
