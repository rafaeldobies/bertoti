package padraoObserver;

public class Guest implements birthdayPersonArrivedObserver{
	
	String name;
	
	
	public Guest(String name) {
		
		this.name = name;
	}


	public void arrived(birthdayPersonArrivedEvent event) {
		
		System.out.println(name);
		System.out.println(event.getNow());
		System.out.println("Tell all the guests...");
		System.out.println("Tun off the ligths...");
		System.out.println("Wait a minute...");
		System.out.println("and .... SURPRISE!!!!");
		System.out.println("\n");
		
	}

}
