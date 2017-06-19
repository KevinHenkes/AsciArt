package main;

import java.util.Scanner;

import entities.letters.FirstTemplate;
import entities.letters.SecondTemplate;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" \n Choisissez le template 1 ou le template 2 :");
		String choixTemp = sc.nextLine();
		if (choixTemp.equals("1") || choixTemp.equals("2")){
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Vous avez saisi le template " +choixTemp);
			System.out.println("Choisissez l'alphabet 1 ou l'alphabet 2 :");
			String choixAlpha = sc.nextLine();
			if (choixAlpha == "1" || choixAlpha == "2"){
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Vous avez saisi l'alphabet " + choixAlpha);
				System.out.println("Saisissez la chaîne de caractère que vous souhaitez :");
				String Text = sc.nextLine();	
				if (choixTemp.equals("1")) {
				    FirstTemplate firstTemplate = new FirstTemplate();
				    firstTemplate.convert(Text);
				} else {
				    SecondTemplate secondTemplate = new SecondTemplate();
				    secondTemplate.convert(Text);
				}
				
				sc.close();
				sc1.close();
				sc2.close();
				
			}else{
				System.out.println("Vous n'avez pas saisi la bonne valeur");
			}
			
		}else{
			System.out.println("Vous n'avez pas saisi la bonne valeur");
		}
		
	}

}
