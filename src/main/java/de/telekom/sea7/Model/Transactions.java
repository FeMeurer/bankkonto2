package de.telekom.sea7.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Transactions extends Iterable {

	void add(float betrag, String empfaenger, String iban, String bic, String verwendungszweck, LocalDateTime datum);

	List get();
	
	Transaction getOne(int index);

	Iterator iterator();
	
	

}