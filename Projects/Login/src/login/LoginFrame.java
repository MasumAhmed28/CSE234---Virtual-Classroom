/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

	Container container=getContentPane();
	
	JLabel labelt=new JLabel("UserName");
	JLabel labelp=new JLabel("PassWord");
	JTextField textField=new JTextField();
	JPasswordField passWord=new JPasswordField();
	JCheckBox checkBox=new JCheckBox("Show Password!");
	JButton button=new JButton("Submit");
	
	LoginFrame(){
		setSize();
		addComponents();
		//manager();
		addActionEvent();
		//actionPerformed(this);
	}
	
//	public void manager() {
//		container.setLayout(null);
//	}
	public void setSize() {
		labelt.setBounds(150, 80, 60, 20);
		labelp.setBounds(150, 120, 60, 20);
		textField.setBounds(220, 80, 250, 20);
		passWord.setBounds(220, 120, 250, 20);
		checkBox.setBounds(220, 160, 200, 30);
		button.setBounds(220, 200, 100, 30);
	}
	
	public void addComponents() {
		container.setLayout(null);
		container.add(labelt);
		container.add(labelp);
		container.add(textField);		
		container.add(passWord);
		container.add(checkBox);
		container.add(button);
	}
	
	public void addActionEvent() {
		checkBox.addActionListener(this);
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg) {
		// TODO Auto-generated method stub
		if(arg.getSource()==button) {
			String userT;
			String pwdT;
			userT=textField.getText();
			pwdT=passWord.getText();
			if(userT.equalsIgnoreCase("EeSha") && pwdT.equalsIgnoreCase("1234")) {
				JOptionPane.showMessageDialog(this, "Login Fucking Successful!");
                                                                        OptionYes op=new OptionYes();
                                                                       // op.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(this, "Invalid USERNAME and PASSWORD!");
			}
		}
		if(arg.getSource()==checkBox) {
			if(checkBox.isSelected()) {
				passWord.setEchoChar((char) 0);
			}
		}
	}			
}
