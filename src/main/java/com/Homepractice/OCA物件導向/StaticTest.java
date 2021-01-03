
package com.Homepractice.OCA物件導向;

class StaticTest {
    int ns;
    static int s;
        public StaticTest(int ns) {
            if(s<ns){
                s=ns;
                this.ns=ns;
        }           
}
        void doPrint(){
            System.out.println("ns ="+ns+", s =" +s+";\t");
        }
}
