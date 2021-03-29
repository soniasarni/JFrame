package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form extends JFrame{
	private JTextField textMot1;
	private JTextField textMot2;
	private JLabel lblResult;
	private String mot1,mot2,message;
	public Form() {
		
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel entrer_nom = new JLabel("entrer votre nom");
		entrer_nom.setOpaque(true);
		entrer_nom.setBorder(new LineBorder(new Color(0, 0, 0)));
		entrer_nom.setHorizontalAlignment(SwingConstants.CENTER);
		entrer_nom.setFont(new Font("Arial", Font.BOLD, 18));
		entrer_nom.setBackground(new Color(51, 51, 204));
		entrer_nom.setForeground(new Color(51, 255, 255));
		entrer_nom.setBounds(66, 30, 324, 49);
		getContentPane().add(entrer_nom);
		
		textMot1 = new JTextField();
		textMot1.setFont(new Font("Serif", Font.BOLD, 18));
		textMot1.setForeground(new Color(0, 0, 0));
		textMot1.setHorizontalAlignment(SwingConstants.CENTER);
		textMot1.setBounds(66, 90, 324, 45);
		getContentPane().add(textMot1);
		textMot1.setColumns(10);
		
		textMot2 = new JTextField();
		textMot2.setBackground(new Color(255, 255, 255));
		textMot2.setFont(new Font("Serif", Font.BOLD, 18));
		textMot2.setForeground(new Color(0, 0, 0));
		textMot2.setHorizontalAlignment(SwingConstants.CENTER);
		textMot2.setColumns(10);
		textMot2.setBounds(66, 159, 324, 45);
		getContentPane().add(textMot2);
		
		JButton btntest = new JButton("tester");
		btntest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mot1=textMot1.getText();
				mot2=textMot2.getText();
				
				if(mot1.equals(mot2)) {
					message="les mots sont semblable";
					
				}else {
					message="les mots sont differents";
				}
				lblResult.setText(message);
			}
			
		});
	
		btntest.setFont(new Font("Serif", Font.BOLD, 18));
		btntest.setBackground(new Color(204, 204, 204));
		btntest.setBounds(203, 238, 89, 23);
		getContentPane().add(btntest);
		
		lblResult = new JLabel("");
		lblResult.setBackground(new Color(255, 204, 204));
		lblResult.setOpaque(true);
		lblResult.setBounds(66, 308, 324, 38);
		getContentPane().add(lblResult);
	}

	public static void main(String[] args) {
		
		  Form fr =new Form();
	      fr.setVisible(true);

	}
}
