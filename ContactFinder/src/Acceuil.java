import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Acceuil extends JFrame {
	private JTextField txtLogin;
	private JPasswordField passwordField;
	private boolean retVal;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1379236089088315333L;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
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
	public Acceuil() {
		
		retVal = false;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);
		
		JButton Valider = new JButton("Valider");
		Valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (txtLogin.getText().trim().equals("")){
					Programme.showWarning("Le Login est obligatoire.");
					txtLogin.grabFocus();
				}else if(String.valueOf(passwordField.getPassword()).trim().equals("")){
					Programme.showWarning("Le mot de passe est obligatoire.");
					passwordField.grabFocus();
				}else{

					String login = txtLogin.getText();

					String sql = "SELECT * FROM utilisateur WHERE user_Login = '" + login + "'";
					ResultSet rs = Bdd.executeQuery(sql);
					try {
						if(!rs.next()){
							Programme.showError("Votre login est introuvable.");
						}else{
							String password = rs.getString("user_Password");
							

							if(!password.equals(password)){
								Programme.showError("Votre mot de passe n'est pas correct.");
								passwordField.grabFocus();
							
							}else{
								retVal =true;
								dispose();
							}
						}
					} catch (SQLException e1) {
						System.out.println(e1.getMessage());
					}

				}

			}

			
		});
		
		
		Valider.setBackground(new Color(34, 139, 34));
		Valider.setBounds(200, 410, 150, 25);
		getContentPane().add(Valider);
		
		JButton Nouveau = new JButton("Nouvel Utilisateur");
		Nouveau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AjoutUtilisateur();
			}
		});
		Nouveau.setBackground(new Color(255, 140, 0));
		Nouveau.setBounds(500, 410, 150, 25);
		getContentPane().add(Nouveau);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(400, 245, 150, 20);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setBounds(245, 290, 75, 20);
		getContentPane().add(lblPassword);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(245, 245, 75, 20);
		getContentPane().add(lblLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 290, 150, 20);
		getContentPane().add(passwordField);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("C:\\Users\\Alexandre\\OneDrive\\SIO\\ContactFinder\\logo.jpg"));
		logo.setBounds(10, 11, 150, 134);
		getContentPane().add(logo);
		
		JLabel font = new JLabel("New label");
		font.setIcon(new ImageIcon("C:\\Users\\Alexandre\\OneDrive\\SIO\\ContactFinder\\font.jpg"));
		font.setBounds(0, 0, 794, 571);
		getContentPane().add(font);
	}

	
	

	public boolean getValue() {
		
		return retVal;
	}

	
}
