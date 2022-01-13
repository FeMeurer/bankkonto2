package de.telekom.sea7;

import java.time.*;

public class Application {
	
	public Application() {}
	
	public void run() {
		LocalDateTime datum = LocalDateTime.now(); 
		Model model = new Model(50.0f,"Max Mustermann","DE74219866551234567890","BICBICBIC","Hier hast du dein Kohle du Schuft!", datum);
		
		View view = new View(model);
		view.menu();	
	}
}
