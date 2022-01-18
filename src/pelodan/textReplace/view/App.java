package pelodan.textReplace.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import pelodan.textReplace.System.SystemLogic;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class App extends JFrame implements ActionListener {

	SystemLogic system = new SystemLogic();
	JButton btnReplace = new JButton();
	JTextArea textArea = new JTextArea(system.getText());
	JTextField txtFWord = new JTextField(system.getWord());
	JTextField txtFReplace = new JTextField(system.getReplace());
	private final JLabel lblNewLabel = new JLabel("Substituir Palavras");
	private final JLabel lblNewLabel_1 = new JLabel("original");
	private final JLabel lblNewLabel_1_1 = new JLabel("substituto");
	
	App(){
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(460, 420);
		getContentPane().setLayout(null);
		txtFReplace.setLocation(352, 30);
		txtFReplace.setHorizontalAlignment(SwingConstants.CENTER);
		txtFReplace.setSize(82, 24);
		getContentPane().add(txtFReplace);
		btnReplace.setText("Substituir");
		btnReplace.setBounds(327, 65, 107, 24);
		getContentPane().add(btnReplace);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textArea.setBounds(10, 90, 424, 280);
		getContentPane().add(textArea);
		txtFWord.setHorizontalAlignment(SwingConstants.CENTER);
		txtFWord.setBounds(260, 30, 82, 24);
		getContentPane().add(txtFWord);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 12, 158, 35);
		
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(260, 12, 82, 14);
		
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(352, 12, 82, 14);
		
		getContentPane().add(lblNewLabel_1_1);
		btnReplace.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btnReplace) {
			try {
				system.setText(textArea.getText());
				system.setWord(txtFWord.getText());
				system.setReplace(txtFReplace.getText());
				system.replaceWord();
				textArea.setText(system.getText());
			} catch (Exception e2) {}
		}
	}
	
	public static void main(String[] args) {
		new App();
	}
}
