package metodos;

public class HumanCaracteristics {
	
	String name;
	String eyeColor;
	String hairColor;
	double weight;
	int age;
	double height;
	
	public void speak() {
		
		System.out.println("my name is "+ name);
		System.out.println("I'm "+age+ "years old");
		System.out.println("My hair is " +  hairColor + " and i have " + eyeColor + "eyes");
		System.out.println("My weigth is "+ weight + " and i have "+height+ "meters tall");
		
	}

}
