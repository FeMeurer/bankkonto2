package de.telekom.sea7;

import de.telekom.sea7.Model.BaseObject;
import de.telekom.sea7.Model.Transactions;
import de.telekom.sea7.Model.TransactionsImpl;
import de.telekom.sea7.View.TransactionsView;
import de.telekom.sea7.View.TransactionsViewImpl;

public class ApplicationImpl extends BaseObject implements Application {
	
	public ApplicationImpl(Object parent) {
		super(parent);
	}
	
	@Override
	public void run() {
		Transactions model = new TransactionsImpl();
		
		TransactionsView view = new TransactionsViewImpl(this, model);
		view.menu();	
	}
}
