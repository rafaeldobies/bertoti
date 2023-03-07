package padraoObserver;

public class AniversarySurprise {

	public static void main(String[] args) {
		
		Guest guest = new Guest();
		Guest guest2 = new Guest();
		Guest guest3 = new Guest();
		Concierge concierge = new Concierge();
		
		concierge.registerObservers(guest);
		concierge.registerObservers(guest2);
		concierge.registerObservers(guest3);
		concierge.monitoring();
		
	}
}
