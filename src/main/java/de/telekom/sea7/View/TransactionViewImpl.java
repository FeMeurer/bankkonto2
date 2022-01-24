package de.telekom.sea7.View;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import de.telekom.sea7.Model.BaseObject;
import de.telekom.sea7.Model.Transaction;

public class TransactionViewImpl extends BaseObject implements TransactionView {
	
	private Transaction transaction;
	
	public TransactionViewImpl(Object parent, Transaction transaction) {
		super(parent);
		this.transaction = transaction;
	}
	
	@Override
	public void menu() {
		String input = "";
		Scanner scannerOneTrans = new Scanner(System.in);
		while (!input.equals("back")) {
			System.out.println("Enter something: ");
			input = scannerOneTrans.next();
			
			switch (input) {
				case "show":		show();
									break;
				case "back":		//scannerOneTrans.close();
									break;
				default:			System.out.println("Command unknown. Please enter an existing command. With command 'help' you can list all existing commands.");
									System.out.println();
									break;
			}
		}
	}
	
	private void show() {
		System.out.println("Empfänger: " + transaction.getEmpfaenger());
		System.out.println("IBAN: " + transaction.getIban());
		System.out.println("BIC: " + transaction.getBic());
		System.out.println("Verwendungszweck: " + transaction.getVerwendungszweck());
		System.out.println("Betrag: " + String.format("%.2f", transaction.getBetrag()) + " €");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		String formattedDateTime = transaction.getDatum().format(formatter); 
		System.out.println("Datum: " + formattedDateTime);
	}
}
