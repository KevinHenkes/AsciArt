import java.util.Scanner;

import entities.letters.FirstTemplate;


public class User {
	private String nomUser = "";
	private String messageAccueil = "";
	
	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getMessageAccueil() {
		return messageAccueil;
	}

	public void setMessageAccueil(String messageAccueil) {
		this.messageAccueil = messageAccueil;
	}

	public void userIdentification() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nom :");
		nomUser = sc.nextLine();
		messageAccueil = "Bonjour" + nomUser;
		FirstTemplate firstTemplate = new FirstTemplate();
		firstTemplate.convert(messageAccueil);
		sc.close();
		System.out.println("Vous pouvez transformer votre texte en Ascii Art  ! ");
		
		
	}
}
