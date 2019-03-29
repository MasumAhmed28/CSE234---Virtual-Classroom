/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;

public class LOG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LoginFrame login=new LoginFrame();
			login.setVisible(true);
			login.setBounds(300, 150, 700, 400);
			login.setTitle("Login Form!");
			login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//login.setResizable(false);			
			
	}

}
