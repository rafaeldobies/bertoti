package padraoObserver;

public class AniversarySurprise {

	public static void main(String[] args) {
		
		Guest guest = new Guest("Guest_1");
		Guest guest2 = new Guest("Guest_2");
		Guest guest3 = new Guest("Guest_3");
		Concierge concierge = new Concierge();
		
		concierge.registerObservers(guest);
		concierge.registerObservers(guest2);
		concierge.registerObservers(guest3);
		
		concierge.monitoring();
		
	}
}
