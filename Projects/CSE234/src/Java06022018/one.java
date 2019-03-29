/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java06022018;

/**
 *
 * @author HP
 */
public class one {
    public static void main(String args[]){
        Box myBox1=new Box();
        Box myBox2=new Box();
        Box myBox3=new Box(4);
        myBox1.height=10;
        myBox1.width=10;
        myBox1.length=10;
        myBox2.setDimension(3, 5, 10);
        Box myBox4=new Box(4,2,7);
        Box myBox5=new Box(5);
        Box myBox6= new Box(myBox2);
        myBox4.changeValue(myBox3);
        Box myBox7= new Box(5);
        myBox2.changeValue(myBox1.height, myBox1.width, myBox1.length);
        myBox1.changeValue(myBox7);
        System.out.println("Volume1 = "+myBox1.getVolume());
        System.out.println("Volume2 = "+myBox2.getVolume());
        System.out.println("Volume3 = "+myBox3.getVolume());
        System.out.println("Volume4 = "+myBox4.getVolume());
        System.out.println("Volume5 = "+myBox5.getVolume());
        System.out.println("Volume6 = "+myBox6.getVolume());
        System.out.println("Volume7 = "+myBox7.getVolume());
        System.out.println(myBox6.isEqual(myBox2));
        System.out.println(myBox7.isEqual(myBox5));
        System.out.println(myBox4.isEqual(myBox3));
        System.out.println("The Dimension of myBox6 is :");
        myBox6.getDimension();
    }
}
