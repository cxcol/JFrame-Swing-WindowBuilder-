package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JFrameCadastroCategoria extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldnome;
	private JTextField textFieldDesc;
	private JTextField textFieldCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameCadastroCategoria frame = new JFrameCadastroCategoria();
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
	public JFrameCadastroCategoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Categoria");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(104, 11, 233, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(38, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDescrio.setBounds(38, 108, 73, 14);
		contentPane.add(lblDescrio);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCor.setBounds(38, 157, 46, 14);
		contentPane.add(lblCor);
		
		textFieldnome = new JTextField();
		textFieldnome.setColumns(10);
		textFieldnome.setBounds(188, 71, 247, 20);
		contentPane.add(textFieldnome);
		
		textFieldDesc = new JTextField();
		textFieldDesc.setColumns(10);
		textFieldDesc.setBounds(188, 112, 247, 20);
		contentPane.add(textFieldDesc);
		
		textFieldCor = new JTextField();
		textFieldCor.setColumns(10);
		textFieldCor.setBounds(188, 151, 247, 20);
		contentPane.add(textFieldCor);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(346, 194, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblCategoriasCadastradas = new JLabel("Categorias Cadastradas");
		lblCategoriasCadastradas.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCategoriasCadastradas.setBounds(104, 224, 233, 14);
		contentPane.add(lblCategoriasCadastradas);
	}
}
