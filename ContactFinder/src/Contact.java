

public class Contact {
	private int id;
	private String nom;
	private String prenom;
	private String societe;
	private String adresse1;
	private String adresse2;
	private String cp;
	private String ville;
	private String email;
	private String telephone1;
	private String telephone2;
	

	public Contact(int pID, String pNom, String pPrenom, String pSociete, String pAdresse1, String pAdresse2, String pCP, String pVille, String pEmail, String pTelephone1, String pTelephone2) {
		this.id = pID;
		setNom(pNom);
		setPrenom(pPrenom);
		setSociete(pSociete);
		setAdresse1(pAdresse1);
		setAdresse2(pAdresse2);
		setCP(pCP);
		setVille(pVille);
		setEmail(pEmail);
		setTelephone1(pTelephone1);
		setTelephone2(pTelephone2);
	}
	
	private void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
		
	}

	private void setTelephone1(String telephone1) {
		this.telephone1 = telephone1;
		
	}

	private void setEmail(String email) {
		this.email = email;
		
	}

	private void setVille(String ville) {
		this.ville = ville;
		
	}

	private void setCP(String cp) {
		this.cp = cp;
		
	}

	private void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
		
	}

	private void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
		
	}

	private void setSociete(String societe) {
		this.societe = societe;
		
	}

	private void setPrenom(String prenom) {
		this.prenom = prenom;
		
	}

	private void setNom(String nom) {
		this.nom = nom;
		
	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom(){
		return prenom;
	}
	
	public String getSociete(){
		return societe;
	}
	
	public String getAdresse1(){
		return adresse1;
	}
	
	public String getAdresse2(){
		return adresse2;
	}
	
	public String getCP(){
		return cp;
	}
	
	public String getVille(){
		return ville;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getTelephone1(){
		return telephone1;
	}
	
	public String getTelephone2(){
		return telephone2;
	}
	
	
	public String toString()
	{
		return getNom()+ " " + getPrenom()+ " "+ getSociete()+ " "+ getAdresse1()+ " "+ getAdresse2()+ " "+ getCP()+ " "+ getVille()+ " "+ getEmail()+ " "+ getTelephone1()+ " "+ getTelephone2();
		
		
	}

}