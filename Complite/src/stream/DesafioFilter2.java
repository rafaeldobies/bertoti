package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter2 {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("notebook", 8499.99, 15.0, 200.0);
		Produto p2 = new Produto("Mouse", 99.99, 5.0, 50.0);
		Produto p3 = new Produto("Fone Ouvido", 149.99, 15.0, 50.0);
		Produto p4 = new Produto("Mochila", 199.99, 30.0, 0.0);
		Produto p5 = new Produto("Mousepad", 29.99, 35.0, 0.0);
	
		List<Produto> carrinho = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> desconto = n-> n.desconto>=30.0;
		Predicate<Produto> isGratis = n -> n.frete==0.0;
		Function<Produto, String> melhoresPromocoes = n -> "Não perca esse produto:\n" +n.nome;
		
		carrinho.stream().filter(desconto).filter(isGratis).map(melhoresPromocoes).forEach(System.out::println);
		
	
	
	
	}
}
