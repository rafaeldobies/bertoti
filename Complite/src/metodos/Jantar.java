package metodos;

public class Jantar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1= new Pessoa("Camila",61);
		Pessoa p2= new Pessoa("Rafael",63);
		Pessoa p3= new Pessoa("Giovana",10);
		Pessoa p4= new Pessoa("Isabella",15);
		
		Comida c1= new Comida("Arroz", 0.200);
		Comida c2= new Comida("Feijão", 0.100);
		Comida c3= new Comida("Alface", 0.050);
		Comida c4= new Comida("Carne", 0.250);
		Comida c5= new Comida("Tomate", 0.150);
		Comida c6= new Comida("Suco", 0.180);
		
		p1.comer(c1);
		p1.comer(c2);
		p1.comer(c3);
		p1.comer(c5);
		
		p2.comer(c1);
		p2.comer(c2);
		p2.comer(c3);
		p2.comer(c4);
		
		
		p3.comer(c6);
		p3.comer(c5);
		
		p4.comer(c1);
		p4.comer(c6);
		p4.comer(c3);
		p4.comer(c5);
		
		

	}

}
