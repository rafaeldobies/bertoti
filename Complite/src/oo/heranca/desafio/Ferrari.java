package oo.heranca.desafio;

public class Ferrari extends Carro{

	int VELOCIDADEMAXIMA;
	Ferrari (int velocidadeMaxima){
		this.VELOCIDADEMAXIMA = velocidadeMaxima;
	}
	Boolean Acelerar(){
	if (velocidadeAtual+15>=VELOCIDADEMAXIMA) {
		velocidadeAtual = VELOCIDADEMAXIMA;
	} else {
		velocidadeAtual += 15;
	}
	return true;	
	}
	
	Boolean Frear(){
		if (velocidadeAtual>0) {
				velocidadeAtual -= 15;
				return true;
	} else {
		return false;	
		}
	}
}
