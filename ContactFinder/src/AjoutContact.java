import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class AjoutContact extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7861270466020419663L;
	private JPanel contentPane;
	private JTextField Nom;
	private JTextField Prenom;
	private JTextField Société;
	private JTextField Adresse1;
	private JTextField Adresse2;
	private JTextField CP;
	private JTextField Ville;
	private JTextField Email;
	private JTextField Telephone1;
	private JTextField Telephone2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutContact frame = new AjoutContact();
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
	public AjoutContact() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Nom = new JTextField();
		Nom.setBounds(406, 104, 200, 25);
		contentPane.add(Nom);
		Nom.setColumns(10);
		
		Telephone1 = new JTextField();
		Telephone1.setBounds(406, 424, 200, 25);
		contentPane.add(Telephone1);
		Telephone1.setColumns(10);
		
		Prenom = new JTextField();
		Prenom.setBounds(406, 144, 200, 25);
		contentPane.add(Prenom);
		Prenom.setColumns(10);
		
		Société = new JTextField();
		Société.setBounds(406, 184, 200, 25);
		contentPane.add(Société);
		Société.setColumns(10);
		
		Adresse1 = new JTextField();
		Adresse1.setBounds(406, 224, 200, 25);
		contentPane.add(Adresse1);
		Adresse1.setColumns(10);
		
		Adresse2 = new JTextField();
		Adresse2.setBounds(406, 264, 200, 25);
		contentPane.add(Adresse2);
		Adresse2.setColumns(10);
		
		CP = new JTextField();
		CP.setBounds(406, 304, 200, 25);
		contentPane.add(CP);
		CP.setColumns(10);
		
		Ville = new JTextField();
		Ville.setBounds(406, 344, 200, 25);
		contentPane.add(Ville);
		Ville.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(406, 384, 200, 25);
		contentPane.add(Email);
		Email.setColumns(10);
		
		Telephone2 = new JTextField();
		Telephone2.setBounds(406, 464, 200, 25);
		contentPane.add(Telephone2);
		Telephone2.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNom.setForeground(new Color(255, 255, 255));
		lblNom.setBounds(256, 104, 100, 25);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrenom.setForeground(new Color(255, 255, 255));
		lblPrenom.setBounds(256, 144, 100, 25);
		contentPane.add(lblPrenom);
		
		JLabel lblSociété = new JLabel("Soci\u00E9t\u00E9");
		lblSociété.setForeground(new Color(255, 255, 255));
		lblSociété.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSociété.setBounds(256, 184, 100, 25);
		contentPane.add(lblSociété);
		
		JLabel lblAdresse1 = new JLabel("Adresse1");
		lblAdresse1.setForeground(new Color(255, 255, 255));
		lblAdresse1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdresse1.setBounds(256, 224, 100, 25);
		contentPane.add(lblAdresse1);
		
		JLabel lblAdresse2 = new JLabel("Adresse2");
		lblAdresse2.setForeground(new Color(255, 255, 255));
		lblAdresse2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAdresse2.setBounds(256, 264, 100, 25);
		contentPane.add(lblAdresse2);
		
		JLabel lblCP = new JLabel("Code Postal");
		lblCP.setForeground(new Color(255, 255, 255));
		lblCP.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCP.setBounds(256, 304, 100, 25);
		contentPane.add(lblCP);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setForeground(new Color(255, 255, 255));
		lblVille.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblVille.setBounds(256, 344, 100, 25);
		contentPane.add(lblVille);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmail.setBounds(256, 384, 100, 25);
		contentPane.add(lblEmail);
		
		JLabel lblTelephone1 = new JLabel("Telephone1");
		lblTelephone1.setForeground(new Color(255, 255, 255));
		lblTelephone1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelephone1.setBounds(256, 424, 100, 25);
		contentPane.add(lblTelephone1);
		
		JLabel lblTelephone2 = new JLabel("Telephone2");
		lblTelephone2.setForeground(new Color(255, 255, 255));
		lblTelephone2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTelephone2.setBounds(256, 464, 100, 25);
		contentPane.add(lblTelephone2);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBackground(new Color(34, 139, 34));
		btnValider.setBounds(250, 525, 100, 25);
		contentPane.add(btnValider);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBackground(new Color(178, 34, 34));
		btnAnnuler.setBounds(500, 525, 100, 25);
		contentPane.add(btnAnnuler);
		
		JLabel lblTitre = new JLabel("Nouveau Contact");
		lblTitre.setForeground(new Color(255, 255, 255));
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitre.setBounds(329, 23, 250, 50);
		contentPane.add(lblTitre);


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
