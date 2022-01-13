package de.telekom.sea7;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class View extends BaseObject {
	
	private Model model;
	
	public View(Object parent, Model model) {
		super(parent);
		this.model = model;
	}
	
	public void menu() {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("exit")) {
			System.out.println("Enter something: ");
			input = scanner.next();
			
			switch (input) {
				case "transfer":	break;
				case "show":		show();
									break;
				case "exit":		scanner.close();
									System.out.println();
									System.out.println("Programm will be closed...");
									System.out.println();
									break;
				default:			System.out.println("Command unknown. Please enter an existing command. With command 'help' you can list all existing commands.");
									System.out.println();
									break;
			}
		}
	}
	
	private void show() {
		System.out.println("Empfänger: " + model.getEmpfaenger());
		System.out.println("IBAN: " + model.getIban());
		System.out.println("BIC: " + model.getBic());
		System.out.println("Verwendungszweck: " + model.getVerwendungszweck());
		System.out.println("Betrag: " + String.format("%.2f", model.getBetrag()) + " €");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		String formattedDateTime = model.getDatum().format(formatter); 
		System.out.println("Datum: " + formattedDateTime);
	}
}
