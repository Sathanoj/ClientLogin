package loginScreen;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.SwingConstants;

import Frames.forgotPass;
import Frames.frameGame;
import Register.frameRegister;
import buttonPackage.buttonOBJ;

public class firstScreen extends JFrame implements ActionListener{
	JPanel login= new JPanel();
	JLabel hyperLink = new JLabel("Forgot your password?");
	JLabel imgButton = new JLabel();
	
	private JTextField user, senha, userCaixaTexto, senhaCaixaTexto;
	buttonOBJ loginButton = new buttonOBJ();
	buttonOBJ buttonRegister = new buttonOBJ();
	buttonOBJ buttonExit = new buttonOBJ();
	
	
	 String caixaLogin;
	 String caixaSenha;
	 
	
	public firstScreen() { 
		
		user = new JTextField("User");
		senha = new JTextField("senha");
		userCaixaTexto = new JTextField(50);
		senhaCaixaTexto = new JTextField(50);		
		
		// TEXTO qie nãoda pra editar.
		add(user);
		user.setEditable(false);
		user.addActionListener(this);
		user.setBounds(50, 150, 40, 30);
		user.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(senha);
		senha.setEditable(false);
		senha.setBounds(50, 200, 40, 30);
		senha.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		
		//Caixa para digitar texto.
		add(userCaixaTexto);
		userCaixaTexto.setBounds(90, 150, 120, 30);
		userCaixaTexto.setText(null);
		userCaixaTexto.addActionListener(this);
		
		add(senhaCaixaTexto);
		senhaCaixaTexto.setBounds(90, 200, 120, 30);
		senhaCaixaTexto.addActionListener(this);
		
		ButtonFS();
		imgPos();
		
		
		
		//hyperlink teste
		add(hyperLink);
		hyperLink.setBounds(70, 270, 150, 30);
		hyperLink.setForeground(Color.BLUE.darker());
		hyperLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hyperLink.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				forgotPass FP = new forgotPass();
			}
		});

		
		this.add(login);
		login.setLayout(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
	
	public void ButtonFS() {
		//BOTOES de login e saida 
		add(loginButton);
		loginButton.setText("LOGIN");
		loginButton.setBounds(50, 240, 70, 30);
		loginButton.addActionListener(this);
		
		add(buttonRegister);
		buttonRegister.setText("SIGN IN");
		buttonRegister.setBounds(140, 240, 70, 30);
		buttonRegister.addActionListener(this);
		
		
		add(buttonExit);
		buttonExit.setText("EXIT");
		buttonExit.setBounds(450, 370, 70, 30);
		buttonExit.addActionListener(this);
	}
	
	
	public void pegaLoginSenha() {
		
		caixaLogin = userCaixaTexto.getText();
		caixaSenha = senhaCaixaTexto.getText();
		//System.out.println("Está é sua senha " + caixaLogin);
		
		if("jonathas".equals(caixaLogin) && "1234".equals(caixaSenha)) {
			System.out.println("tudo certo");
			dispose();
			frameGame FG = new frameGame();
		}
		else {
			JOptionPane.showMessageDialog(null, "Error Login");
			System.out.println("Sua senha está errada" + caixaLogin);
		}
		
		

//
	}
	
	public void imgPos() {
		add(imgButton);
		imgButton.setIcon(new ImageIcon("img\\zoro.png"));
		imgButton.setBounds(270, 96, 200, 200);
	}

//	public void checkLogPas() {
//		
//	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==loginButton) {
			//JOptionPane.showMessageDialog(null, loginButton.getText());
			pegaLoginSenha();
		}
		if(event.getSource()==buttonRegister) {
			dispose();
			frameRegister FR = new frameRegister();
		}
		if(event.getSource()==buttonExit) {
			System.exit(0);
		}
	}
	
	
	
	
	
	

	//====================================================================\\
}














