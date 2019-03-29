/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author AHMED EeSha
 */

public class Figure {
	double d1;
	double d2;
	
	Figure(double d1,double d2){
		this.d1=d1;
		this.d2=d2;
	}
	double area() {
		System.out.println("Inside super!");
		return d1*d2;
	}
	
	
	//class printEverything {
		public static void main(String[] args) {
			Figure fgr=new Figure(10,10);
			Rectangle rec=new Rectangle(300,300);
			Triangle tri=new Triangle(1,4);
			
                                                      Figure newF;
                                                      newF=rec;
			System.out.println("#"+newF.area());
                                                        newF=tri;
			System.out.println("#"+newF.area());
                                                        newF=fgr;
			System.out.println("#"+newF.area());
		}
	//}
}

