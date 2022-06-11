package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1=new Pessoa(99.65);
		System.out.println(p1.getPeso());
	
		Arroz ing1 = new Arroz(.2);
		Feijao ing2 = new Feijao(.2);
		p1.comer(ing1);
		p1.comer(ing2);
		System.out.println(p1.getPeso());
		
		Sorvete ing3 = new Sorvete(.2);
		p1.comer(ing3);
		System.out.println(p1.getPeso());

		p1.gravar();	}

}
