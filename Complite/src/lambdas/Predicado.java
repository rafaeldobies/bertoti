package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Produto> isCaro = prod -> (prod.preco*(1-prod.desconto))>=750;

		Produto produto = new Produto("computador", 3000, 0.85);
		System.out.println(isCaro.test(produto));
	}

}
