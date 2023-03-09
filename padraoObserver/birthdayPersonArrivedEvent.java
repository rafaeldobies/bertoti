package padraoObserver;

import java.util.Date;

public class birthdayPersonArrivedEvent {
	
	private final Date now;
	
	public birthdayPersonArrivedEvent ( Date now) {
		this.now = now;
		
	}

	public Date getNow() {
		return now;
	}
}
