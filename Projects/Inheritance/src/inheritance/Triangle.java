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
class Triangle extends Figure{
		Triangle(double t1,double t2){
			super(t1,t2);
		}
		double area() {
			System.out.println("Inside the Triangle!");
			return d1*d2;
		}
	}
