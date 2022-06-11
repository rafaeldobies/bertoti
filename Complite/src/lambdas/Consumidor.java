package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Livro", 100, .05);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("caderno", 10, .05);
		Produto p3 = new Produto("borracha", 1, .05);
		Produto p4 = new Produto("bolsa", 1002, .05);
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);	
			
			
	}
	
}
