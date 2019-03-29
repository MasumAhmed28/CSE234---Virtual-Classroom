//package coding;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author AHMED EeSha
// */
//interface A{
//    int a=10;
//    final int b=20;
//    void am();
//}
//interface B extends A{
//    static int b=30;
//    int c=50;
//    public interface C{
//        final static int c=40;
//        void bm();
//        void am();
//    }
//    void bm();
//}
//
//public class Test implements B {
//    int a=60;
//    public static void main(String args[]){
//        Test ob=new Test();
//        //ob.am();
//        A a=ob;
//        B b=ob;
//        //C c=ob;
//        a.am();
//        b.am();
//        b.bm();
//        //c.bm();
//        
//        
//    }
//    
////    void am(){
////        System.out.println("am");
////    }
////    void bm(){
////        System.out.println("bm");
////    }
//}
