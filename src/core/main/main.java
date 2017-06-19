package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n Choisissez le template 1 ou le template 2 :");
		String choixTemp = sc.nextLine();
		if (choixTemp == "1" || choixTemp == "2"){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Vous avez saisi le template " +choixTemp);
			System.out.println("Choisissez l'alphabet 1 ou l'alphabet 2 :");
			String choixAlpha = sc.nextLine();
			if (choixAlpha == "1" || choixAlpha == "2"){
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Vous avez saisi l'alphabet " + choixAlpha);
				System.out.println("Saisissez la chaîne de caractère que vous souhaitez :");
				String Text = sc.nextLine();				
				
			}else{
				System.out.println("Vous n'avez pas saisi la bonne valeur");
			}
			
		}else{
			System.out.println("Vous n'avez pas saisi la bonne valeur");
		}
		
	}

}
