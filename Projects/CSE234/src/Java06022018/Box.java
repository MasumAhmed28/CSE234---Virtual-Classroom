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
public class Box {
    int height=1;
    int width=1;
    int length=1;
    Box(int h,int w,int l){
        height=h;
        width=w;
        length=l;
    }
    Box(){
        height=1;
        width=1;
        length=1;
    }
    Box(int l){
        height=width=length=l;
    }
    Box(Box b){
        height=b.height;
        length=b.length;
        width=b.width;
    }
    void setDimension(int h,int w,int l){
        height=h;
        width=w;
        length=l;
    }
    void getDimension(){
        System.out.println("Height = " + height + " " + "Width = " + width + " " + "Length = " + length);
    }
    int getVolume(){
        return height*width*length;
    }
    boolean isEqual(Box b){
        if(b.height==this.height && b.length==this.length && b.width==this.width){
            return true;
        }
        return false;
    }
    void changeValue(int h,int w,int l){
        this.height*=h;
        this.width*=w;
        this.length*=l;
    }
    void changeValue(Box b){
        this.height=b.height;
        this.width=b.width;
        this.length=b.length;
    }
}
