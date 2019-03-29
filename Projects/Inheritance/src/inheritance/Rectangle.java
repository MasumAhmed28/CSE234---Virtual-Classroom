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
class Rectangle extends Figure{
		Rectangle(double r1,double r2){
			super(r1,r2);
		}
		double area() {
			System.out.println("Inside Rectangle!");
			return d1*d2;
		}
}