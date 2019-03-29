/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

/**
 *
 * @author AHMED EeSha
 */
abstract class X{
    X(){
        System.out.println("X()");
    }
    abstract void a();
    void b(){
        System.out.println("X.b()");
        a();
    }
}

class Y extends X{
    void a(){
        System.out.println("Y.a()");
    }
    void b(){
        System.out.println("Y.b()");
    }
    void c(){
        System.out.println("Y.c()");
        super.b();
    }
}
public class NewClass {
    public static void main(String args[]){
        Y y=new Y();
        y.c();
    }
}
