package Register;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buttonPackage.buttonOBJ;
import loginScreen.firstScreen;

public class frameRegister extends JFrame implements ActionListener{
	JPanel frame1 = new JPanel();

	private JTextField
					nickName, 
					name,
					lastName, 
					age,
					mail,
					nickBox,
					nameBox,
					lastBox,
					ageBox,
					mailBox;
	
	buttonOBJ registerACCB = new buttonOBJ();
	buttonOBJ backB = new buttonOBJ();
	buttonOBJ exitB = new buttonOBJ();

	
	public frameRegister(){
		nickName = new JTextField("NICK");
		name     = new JTextField("NAME");
		lastName = new JTextField("LAST");
		age      = new JTextField("AGE");
		mail     = new JTextField("E-MAIL");
		
		nickBox = new JTextField(100);
		nameBox = new JTextField(100);
		lastBox = new JTextField(100);
		ageBox  = new JTextField(100);
		mailBox = new JTextField(100);
		

		
		textBox();
		letterRegister();
		botoesteste();
		
		this.add(frame1);
		frame1.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

	public void textBox() {
		//posicao das caixas para inserir textos
		
		add(nickBox);
		nickBox.setBounds(180, 50, 200, 30);
		nickBox.addActionListener(this);
		
		add(nameBox);
		nameBox.setBounds(180, 90, 200, 30);
		nameBox.addActionListener(this);
		
		add(lastBox);
		lastBox.setBounds(180, 130, 200, 30);
		lastBox.addActionListener(this);
		
		add(ageBox);
		ageBox.setBounds(180, 180, 200, 30);
		ageBox.addActionListener(this);
		
		add(mailBox);
		mailBox.setBounds(180, 230, 200, 30);
		mailBox.addActionListener(this);
	}
	
	public void caddastrando() {
		
		//nickBox = nickbox.getText();
		
	}
	
	public void letterRegister() {
		//posicoes do botao
		add(nickName);
		nickName.setEditable(false);
		nickName.setBounds(140, 50, 40, 30);
		nickName.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(name);
		name.setEditable(false);
		name.setBounds(140, 90, 40, 30);
		name.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(lastName);
		lastName.setEditable(false);
		lastName.setBounds(140, 130, 40, 30);
		lastName.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(age);
		age.setEditable(false);
		age.setBounds(140, 180, 40, 30);
		age.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		add(mail);
		mail.setEditable(false);
		mail.setBounds(140, 230, 40, 30);
		mail.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	}

	public void botoesteste() {
		
		
		add(registerACCB);
		registerACCB.setText("REGISTER");
		registerACCB.setBounds(170, 300, 90, 30);
		registerACCB.addActionListener(this);
		//=========================================================\\
		add(backB);
		backB.setText("BACK");
		backB.setBounds(300, 300, 70, 30);
		backB.addActionListener(this);
		
		add(exitB);
		exitB.setText("EXIT");
		exitB.setBounds(450, 370, 70, 30);
		exitB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==exitB) {
			System.exit(0);
		}
		if(event.getSource()==backB) {
			dispose();
			firstScreen FS = new firstScreen();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
//==============================================================\\
}
