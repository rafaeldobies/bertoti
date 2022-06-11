package metodos;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animals pato = new Animals("branco", 10,0.70);
		
		pato.passaros();
		
		bird arara= new bird("azul",10,.8);
		
		arara.passaros();
		
		Parrow jack=new Parrow("verde",8,.6);
		jack.passaros();
		jack.fly();
	}

}
