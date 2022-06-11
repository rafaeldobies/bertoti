package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro civic = new Carro(100);
		System.out.println(civic.velocidadeAtual);
		civic.Acelerar();
		civic.Acelerar();
		civic.Acelerar();
		civic.Acelerar();
		civic.Acelerar();
		System.out.println(civic.velocidadeAtual);
		civic.Frear();
		civic.Frear();
		civic.Frear();
		System.out.println(civic.velocidadeAtual);
		
		Carro ferrari = new Ferrari(100);
		System.out.println(ferrari.velocidadeAtual);
		ferrari.Acelerar();
		ferrari.Acelerar();
		ferrari.Acelerar();
		ferrari.Acelerar();
		ferrari.Acelerar();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.Frear();
		ferrari.Frear();
		ferrari.Frear();
		System.out.println(ferrari.velocidadeAtual);

	}

}
