package de.telekom.sea7;

import de.telekom.sea7.Model.BaseObject;
import de.telekom.sea7.Model.Transactions;
import de.telekom.sea7.View.TransactionsView;

public class Application extends BaseObject {
	
	public Application(Object parent) {
		super(parent);
	}
	
	public void run() {
		Transactions model = new Transactions();
		
		TransactionsView view = new TransactionsView(this, model);
		view.menu();	
	}
}
