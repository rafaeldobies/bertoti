package metodos;

public class Parrow extends bird implements Flyable{
	
	public Parrow(String color, double weight, double envergadura) {
		super(color, weight, envergadura);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("a parrow can fly....");
	}
	
	
}
