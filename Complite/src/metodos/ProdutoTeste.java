package metodos;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto.desconto = 0.25;

		Produto p1= new Produto();
		p1.nome = "caneta";
		p1.preco = 10;
		
		Produto p2 = new Produto(2000, "video Game");
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
	}

}
