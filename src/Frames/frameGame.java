package Frames;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class frameGame extends JFrame{
	
	//JLabel label = new JLabel();
	
	public frameGame(){
//		this.add(label);
//		label.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
