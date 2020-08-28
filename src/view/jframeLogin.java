package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class jframeLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtfieldemail;
	private JPasswordField pwfieldsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jframeLogin frame = new jframeLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public jframeLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblemail = new JLabel("e-mail");
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblemail.setBounds(37, 28, 72, 30);
		contentPane.add(lblemail);
		
		txtfieldemail = new JTextField();
		txtfieldemail.setBounds(145, 34, 180, 20);
		contentPane.add(txtfieldemail);
		txtfieldemail.setColumns(10);
		
		JLabel lblSenha = new JLabel("senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSenha.setBounds(37, 87, 72, 30);
		contentPane.add(lblSenha);
		
		pwfieldsenha = new JPasswordField();
		pwfieldsenha.setBounds(145, 93, 180, 20);
		contentPane.add(pwfieldsenha);
		
		JButton btnentrar = new JButton("Entrar");
		btnentrar.setBounds(174, 146, 72, 20);
		contentPane.add(btnentrar);
		
		JButton btnlimpar = new JButton("Limpar");
		btnlimpar.setBounds(253, 145, 72, 20);
		contentPane.add(btnlimpar);
	}
}
