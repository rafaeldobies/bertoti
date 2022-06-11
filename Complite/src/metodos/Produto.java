package metodos;

public class Produto {
	
	double preco;
	String nome;
	static double desconto;
	
	//desconto = 0.25;
	
	Produto(){
		
	}
	
	Produto (double precoProd, String nomeProd){
		nome = nomeProd;
		preco = precoProd;
	
		
	}
	
	double precoComDesconto() {
		
		
		return (preco-preco*desconto);
		
	}

	
	
}
