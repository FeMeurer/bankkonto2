package de.telekom.sea7.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Transactions implements Iterable {
	private ArrayList transactions;
	
	public Transactions() {
		transactions = new ArrayList();
	}
	
	public void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck, LocalDateTime datum) {
		Transaction transaction = new Transaction(this, betrag, empfaenger, iban, bic, verwendungszweck, datum);
		transactions.add(transaction);
	}
	
	public ArrayList get() {
		return transactions;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return transactions.iterator();
	}
}
