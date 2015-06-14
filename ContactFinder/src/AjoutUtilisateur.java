import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;


public class AjoutUtilisateur extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6731390244336287114L;
	private JPanel contentPane;
	private JTextField Login;
	private JTextField Password1;
	private JTextField Password2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutUtilisateur frame = new AjoutUtilisateur();
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
	public AjoutUtilisateur() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Titre = new JLabel("Nouvel Utilisateur");
		Titre.setForeground(new Color(255, 255, 255));
		Titre.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Titre.setBounds(275, 50, 350, 80);
		contentPane.add(Titre);
		
		Login = new JTextField();
		Login.setBounds(450, 250, 200, 25);
		contentPane.add(Login);
		Login.setColumns(10);
		
		Password1 = new JTextField();
		Password1.setBounds(450, 310, 200, 25);
		contentPane.add(Password1);
		Password1.setColumns(10);
		
		Password2 = new JTextField();
		Password2.setBounds(450, 370, 200, 25);
		contentPane.add(Password2);
		Password2.setColumns(10);
		
		JButton btnCréer = new JButton("Cr\u00E9er");
		btnCréer.setBackground(new Color(34, 139, 34));
		btnCréer.setBounds(250, 480, 100, 25);
		contentPane.add(btnCréer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBackground(new Color(178, 34, 34));
		btnAnnuler.setBounds(500, 480, 100, 25);
		contentPane.add(btnAnnuler);
		
		JLabel lblLogin = new JLabel("Login : ");
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(250, 250, 150, 25);
		contentPane.add(lblLogin);
		
		JLabel lblPassword1 = new JLabel("Password : ");
		lblPassword1.setForeground(new Color(255, 255, 255));
		lblPassword1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword1.setBounds(250, 310, 150, 25);
		contentPane.add(lblPassword1);
		
		JLabel lblPassword2 = new JLabel("Confirm Password :");
		lblPassword2.setForeground(new Color(255, 255, 255));
		lblPassword2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword2.setBounds(250, 370, 150, 25);
		contentPane.add(lblPassword2);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("C:\\Users\\Alexandre\\OneDrive\\SIO\\ContactFinder\\logo.jpg"));
		logo.setBounds(10, 11, 150, 134);
		getContentPane().add(logo);
		
		JLabel font = new JLabel("New label");
		font.setIcon(new ImageIcon("C:\\Users\\Alexandre\\OneDrive\\SIO\\ContactFinder\\font.jpg"));
		font.setBounds(0, 0, 794, 571);
		getContentPane().add(font);
	}
}
