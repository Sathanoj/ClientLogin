package Frames;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buttonPackage.buttonOBJ;

public class forgotPass extends JFrame implements ActionListener{
	
	
	JPanel windowAlert = new JPanel();
	
	JLabel hyperLink = new JLabel("insert herer your email?");
	JTextField txtTop = new JTextField("insert your e-mail");
	JTextField insertPass = new JTextField();
	buttonOBJ buttonEnviar = new buttonOBJ();
	
	
	
	
	public forgotPass() {
		styleTxtFrame();
		
		this.add(windowAlert);
		windowAlert.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,240);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void styleTxtFrame() {
		

		add(txtTop);
		txtTop.setEditable(false);
		txtTop.setBounds(140, 25, 300, 40);
		//txtTop.setText("");
		txtTop.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(insertPass);
		insertPass.setBounds(50, 90, 280, 30);
		//insertPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		add(buttonEnviar);
		buttonEnviar.setBounds(140, 150, 100, 30);
		buttonEnviar.setText(null);
		buttonEnviar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
