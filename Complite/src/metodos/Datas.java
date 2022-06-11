package metodos;

public class Datas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testando o programa!!!!");
		Myname();

		HumanCaracteristics rafael;
		
		rafael = new HumanCaracteristics();
		
		rafael.name = "Rafael";
		rafael.age = 31;
		rafael.height = 1.7;
		rafael.weight = 63;
		rafael.eyeColor = "brown";
		rafael.hairColor = "brown";
		
		rafael.speak();
		
			
		HumanCaracteristics camila;
		
		camila = new HumanCaracteristics();
		
		camila.name = "Camila";
		camila.age = 36;
		camila.height = 1.63;
		camila.weight = 63;
		camila.eyeColor = "brown";
		camila.hairColor = "brown";
		
		camila.speak();
		
	}
	
	public static void Myname(){
		
		System.out.println("my name is Rafael");
		ChamandoUmMetodo.myYear();
	}

}
