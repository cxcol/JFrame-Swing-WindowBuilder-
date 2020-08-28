package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Choice;
import javax.swing.SwingConstants;

public class cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldendereco;
	private JTextField textFieldlogradouro;
	private JTextField textFieldbairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastro frame = new cadastro();
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
	public cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblendereco = new JLabel("Endere\u00E7o:");
		lblendereco.setBounds(26, 36, 58, 14);
		contentPane.add(lblendereco);
		
		textFieldendereco = new JTextField();
		textFieldendereco.setBounds(111, 33, 367, 20);
		contentPane.add(textFieldendereco);
		textFieldendereco.setColumns(10);
		
		JLabel lblcep = new JLabel("CEP:");
		lblcep.setBounds(26, 160, 46, 14);
		contentPane.add(lblcep);
		
		JFormattedTextField formattedTxtFieldCEP = new JFormattedTextField();
		formattedTxtFieldCEP.setBounds(111, 157, 116, 20);
		contentPane.add(formattedTxtFieldCEP);
		
		JButton btnbuscacep = new JButton("Buscar");
		btnbuscacep.setBounds(242, 156, 72, 23);
		contentPane.add(btnbuscacep);
		
		JButton btnsabercep = new JButton("N\u00E3o sei Meu CEP!");
		btnsabercep.setBounds(331, 156, 129, 23);
		contentPane.add(btnsabercep);
		
		JTextArea txtarreference = new JTextArea();
		txtarreference.setBounds(111, 214, 174, 60);
		contentPane.add(txtarreference);
		
		JLabel lblendref = new JLabel("Refer\u00EAncia:");
		lblendref.setBounds(26, 219, 75, 14);
		contentPane.add(lblendref);
		
		JButton btncadastrar = new JButton("Cadastrar!");
		btncadastrar.setBounds(160, 285, 89, 23);
		contentPane.add(btncadastrar);
		
		JButton btnlimpar = new JButton("Limpar Campos");
		btnlimpar.setBounds(262, 285, 116, 23);
		contentPane.add(btnlimpar);
		
		JLabel lbllogradouro = new JLabel("Logradouro:");
		lbllogradouro.setBounds(26, 73, 75, 14);
		contentPane.add(lbllogradouro);
		
		textFieldlogradouro = new JTextField();
		textFieldlogradouro.setBounds(111, 74, 367, 20);
		contentPane.add(textFieldlogradouro);
		textFieldlogradouro.setColumns(10);
		
		Choice choicecidade = new Choice();
		choicecidade.setBounds(350, 213, 28, 20);
		contentPane.add(choicecidade);
		
		Choice choiceestado = new Choice();
		choiceestado.setBounds(450, 213, 28, 20);
		contentPane.add(choiceestado);
		
		JLabel lblcidade = new JLabel("Cidade:");
		lblcidade.setBounds(307, 219, 37, 14);
		contentPane.add(lblcidade);
		
		JLabel lblestado = new JLabel("Estado:");
		lblestado.setBounds(405, 219, 46, 14);
		contentPane.add(lblestado);
		
		JLabel lblbairro = new JLabel("Bairro:");
		lblbairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblbairro.setBounds(26, 116, 46, 14);
		contentPane.add(lblbairro);
		
		textFieldbairro = new JTextField();
		textFieldbairro.setBounds(111, 113, 247, 20);
		contentPane.add(textFieldbairro);
		textFieldbairro.setColumns(10);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
