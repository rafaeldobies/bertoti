package oo.heranca.desafio;

public class Carro {
	
	int velocidadeAtual;
	final int VELOCIDADEMAXIMA;
	int velocidadeMaxima;
	Carro(){
		this.VELOCIDADEMAXIMA=velocidadeMaxima;
	}
	Carro (int velocidadeMaxima){
		this.VELOCIDADEMAXIMA = velocidadeMaxima;
	}
	
	Boolean Acelerar(){
		
		if (velocidadeAtual+5>=VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += 5;
			
		}
	return true;	
	}
	
	Boolean Frear(){
		if (velocidadeAtual>0) {
				velocidadeAtual -= 5;
				return true;
	} else {
		return false;	
		}
	}
}
