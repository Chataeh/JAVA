package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame{
	JButton btn = null;
	MyApp(){
		//frame 생성
		setTitle("My First GUI App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		Container cp = getContentPane();
		
		cp.setLayout(new FlowLayout());
		
		cp.setBackground(Color.RED);
	}
	
	
	
	public static void main(String[] args) {
		new MyApp().setVisible(true);//그래픽 유저인터페이스는 굳이 래퍼런스 변수 생성 필요x
		
		
		
	}

}
