package metodos;

public class Animals {

	
		String color;
		double weight;
		double envergadura;
		
		
	public Animals(String color, double weight, double envergadura) {
			super();
			this.color = color;
			this.weight = weight;
			this.envergadura = envergadura;
		}


	public void passaros() {
		
		System.out.printf("O passaro é %s tem %f quilos e as asas medem %f metros de envergadura.\n", color, weight,envergadura);
		
		
	}
	
	public void eat() {
		
		System.out.println("i'm eating....");
	}
	
	public void sleep() {
		System.out.println("i'm sleeping...");
	}
}
