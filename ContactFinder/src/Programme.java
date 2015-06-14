import javax.swing.JOptionPane;




public class Programme {

	public static void main(String[] args) {
		Bdd.openConnexion();
		try
		{
			Acceuil uneConnexion = new Acceuil();

			uneConnexion.setVisible(true);
			if(uneConnexion.getValue()){
				//Connexion Ok
				System.out.println("User connect�");
				new Acceuil();
			}else{
				System.out.println("User non connect�");
				Bdd.closeConnexion();
				System.exit(0);
			}

			//A la fermeture: Bdd.closeConnexion();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void showError(String pMessage) {
		JOptionPane.showMessageDialog(null, pMessage, "Erreur", JOptionPane.ERROR_MESSAGE);

	}

	public static void showWarning(String pMessage) {
		JOptionPane.showMessageDialog(null, pMessage, "Attention!", JOptionPane.WARNING_MESSAGE);
	}
	
	public static void showInformation(String pMessage){
		JOptionPane.showMessageDialog(null, pMessage, "Informations", JOptionPane.INFORMATION_MESSAGE);
	}

}
