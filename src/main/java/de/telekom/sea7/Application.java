package de.telekom.sea7;

import java.time.*;

public class Application extends BaseObject {
	
	public Application(Object parent) {
		super(parent);
	}
	
	public void run() {
		LocalDateTime datum = LocalDateTime.now(); 
		Model model = new Model(this, 50.0f,"Max Mustermann","DE74219866551234567890","BICBICBIC","Hier hast du deine Kohle du Schuft!", datum);
		
		View view = new View(this, model);
		view.menu();	
	}
}
