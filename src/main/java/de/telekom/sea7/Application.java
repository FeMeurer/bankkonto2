package de.telekom.sea7;

import java.time.*;

public class Application extends BaseObject {
	
	public Application(int id, Object parent) {
		super(id, parent);
	}
	
	public void run() {
		LocalDateTime datum = LocalDateTime.now(); 
		Model model = new Model(2, this, 50.0f,"Max Mustermann","DE74219866551234567890","BICBICBIC","Hier hast du deine Kohle du Schuft!", datum);
		
		View view = new View(3, this, model);
		view.menu();	
	}
}
