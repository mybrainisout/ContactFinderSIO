import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ListeContact extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeContact frame = new ListeContact();
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
	public ListeContact() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel liste = new JLabel("Liste des contacts");
		liste.setBackground(new Color(255, 255, 255));
		liste.setBounds(150, 200, 500, 250);
		contentPane.add(liste);
		
		JButton supprimer = new JButton("Supprimer");
		supprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		supprimer.setBackground(new Color(165, 42, 42));
		supprimer.setBounds(550, 500, 100, 25);
		contentPane.add(supprimer);
		
		JButton modifier = new JButton("Modifier");
		modifier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		modifier.setBackground(new Color(255, 140, 0));
		modifier.setBounds(350, 500, 100, 25);
		contentPane.add(modifier);
		
		JButton ajouter = new JButton("Ajouter");
		ajouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		ajouter.setBackground(new Color(34, 139, 34));
		ajouter.setBounds(150, 500, 100, 25);
		contentPane.add(ajouter);
		
		JLabel logo = new JLabel("New label");
		logo.setIcon(new ImageIcon("C:\\Users\\Alexandre\\Desktop\\logo.jpg"));
		logo.setBounds(10, 11, 150, 134);
		getContentPane().add(logo);
		
		JLabel font = new JLabel("New label");
		font.setIcon(new ImageIcon("C:\\Users\\Alexandre\\Desktop\\font.jpg"));
		font.setBounds(0, 0, 794, 571);
		getContentPane().add(font);
	}
}
