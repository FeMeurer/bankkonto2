package de.telekom.sea7.View;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import de.telekom.sea7.Model.*;

public class TransactionsViewImpl extends BaseObject implements TransactionsView {
	
	private Transactions transactions;

	public TransactionsViewImpl(Object parent, Transactions transactions) {
		super(parent);
		this.transactions = transactions;
	}

	@Override
	public void menu() {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		while (!input.equals("exit")) {
			System.out.println("Enter something (e.g add - create new transaction, showAll - lists all transactions): ");
			input = scanner.next();

			switch (input) {
			case "add":
				add();
				break;
			case "showOne":
				showOne();
				break;
			case "showAll":
				showAll();
				break;
			case "exit":
				scanner.close();
				System.out.println();
				System.out.println("Programm will be closed...");
				System.out.println();
				break;
			default:
				System.out.println(
						"Command unknown. Please enter an existing command. With command 'help' you can list all existing commands.");
				System.out.println();
				break;
			}
		}
	}
	
	private void showOne() {
		Scanner scannerAdd = new Scanner(System.in);
		System.out.println("Wähle eine Transaktion aus: ");
		int position = scannerAdd.nextInt();
		scannerAdd.nextLine();
		TransactionView transactionView = new TransactionViewImpl(this, transactions.getOne(position));
		transactionView.menu();
	}
	
	private void add() {
		LocalDateTime datum = LocalDateTime.now(); 
		Scanner scannerAdd = new Scanner(System.in);
		
		System.out.println("Wie viel soll überwiesen werden: ");
		float betrag = scannerAdd.nextFloat();
		scannerAdd.nextLine();
		System.out.println("Empfänger: ");
		String empfaenger = scannerAdd.nextLine();
		System.out.println("IBAN: ");
		String iban = scannerAdd.nextLine();
		System.out.println("BIC: ");
		String bic = scannerAdd.nextLine();
		System.out.println("Verwendungszweck: ");
		String verwendungszweck = scannerAdd.nextLine();
		
		transactions.add(betrag,empfaenger,iban,bic,verwendungszweck, datum);
		//scannerAdd.close();
	}
	
	private void showAll() {
		int index = 0;
		for (Object o : transactions) {
			Transaction tempTrans = (Transaction)o;
			System.out.println(tempTrans.getEmpfaenger() + " - " + tempTrans.getVerwendungszweck() + " - " + String.format("%.2f", tempTrans.getBetrag()) + "€");
			index++;
		}
	}
}
