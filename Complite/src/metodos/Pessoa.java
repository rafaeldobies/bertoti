package metodos;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa (String nome, double peso){
		
		nomePessoa = nome;
		pesoPessoa = peso;
		
	}
	
	public void comer(Comida comida) {
		
		System.out.println(this.nomePessoa + " tinha "+ this.pesoPessoa +" kg.");
		
		this.pesoPessoa += comida.pesoComida;
		
		System.out.println("Comeu "+ comida.pesoComida + "de" + comida.nomeComida);
		System.out.println("Agora está com "+this.pesoPessoa+" kg.");
		
	}

}
