package padraoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Concierge {
	
	private List <birthdayPersonArrivedObserver> observers= new ArrayList<>();
	
	public void registerObservers ( birthdayPersonArrivedObserver observer) {
		
		observers.add(observer);
	}
	
	public void removeObservers (birthdayPersonArrivedObserver observer) {
		
		observers.remove(observer);
	}
	
	public void monitoring() {
		
		Scanner data = new Scanner(System.in);
		
		String value = "";
		
		while(!"Quit".equalsIgnoreCase(value)) {
			//create an event
			
			// notify the observers
			System.out.println("Birthday Person arrived?");
			value = data.nextLine();
			
			if("Yes".equalsIgnoreCase(value)) {
				birthdayPersonArrivedEvent event = new birthdayPersonArrivedEvent(new Date());
				observers.stream().forEach(ob -> ob.arrived(event));
				value = "quit";
			} else {
				System.out.println("False alarm!!!");
			}
			
		}
		
		data.close();
	}

}
