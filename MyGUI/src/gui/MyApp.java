package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame{
	JButton btn = null;
	MyApp(){
		//frame ����
		setTitle("My First GUI App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		Container cp = getContentPane();
		
		cp.setLayout(new FlowLayout());
		
		cp.setBackground(Color.RED);
	}
	
	
	
	public static void main(String[] args) {
		new MyApp().setVisible(true);//�׷��� �����������̽��� ���� ���۷��� ���� ���� �ʿ�x
		
		
		
	}

}
