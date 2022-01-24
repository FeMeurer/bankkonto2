package de.telekom.sea7.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TransactionsImpl implements Iterable, Transactions {
	private List transactions;
	
	public TransactionsImpl() {
		transactions = new ArrayList();
	}
	
	@Override
	public void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck, LocalDateTime datum) {
		Transaction transaction = new TransactionImpl(this, betrag, empfaenger, iban, bic, verwendungszweck, datum);
		transactions.add(transaction);
	}
	
	@Override
	public List get() {
		return transactions;
	}
	
	@Override
	public Transaction getOne(int index) {
		return (Transaction) transactions.get(index);
	}

	@Override
	public Iterator iterator() {
		return transactions.iterator();
	}
}
