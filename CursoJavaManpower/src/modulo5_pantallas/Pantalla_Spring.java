package modulo5_pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pantalla_Spring {

	private JFrame frame;
	private JTextField textField;
	private JTextField lblMayuscula_result;
	private JTextField lblMinuscula_result;
	private JTextField lblLetra_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla_Spring window = new Pantalla_Spring();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantalla_Spring() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("String");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(175, 11, 74, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mayuscula");
		lblNewLabel_1.setBounds(49, 105, 87, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese texto");
		lblNewLabel_1_1.setBounds(49, 67, 87, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Miniscula");
		lblNewLabel_1_2.setBounds(49, 149, 87, 27);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("'O'------>2");
		lblNewLabel_1_2_1.setBounds(49, 194, 87, 27);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(187, 70, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblMayuscula_result = new JTextField();
		lblMayuscula_result.setBounds(187, 108, 86, 20);
		frame.getContentPane().add(lblMayuscula_result);
		lblMayuscula_result.setColumns(10);
		
		lblMinuscula_result = new JTextField();
		lblMinuscula_result.setBounds(187, 152, 86, 20);
		frame.getContentPane().add(lblMinuscula_result);
		lblMinuscula_result.setColumns(10);
		
		lblLetra_result = new JTextField();
		lblLetra_result.setBounds(187, 197, 86, 20);
		frame.getContentPane().add(lblLetra_result);
		lblLetra_result.setColumns(10);
		

		
		
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lblMayuscula_result.setText(textField.getText().toUpperCase());
				lblMinuscula_result.setText(textField.getText().toLowerCase());
				lblLetra_result.setText(textField.getText().replace('o', '2'));
				
			}
		});
		btnCalcular.setBounds(315, 196, 89, 23);
		frame.getContentPane().add(btnCalcular);
	}
}
