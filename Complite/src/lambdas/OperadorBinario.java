package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryOperator<Double> media = (n1, n2) -> (n1+n2)/2;
		System.out.println(media.apply(9.5, 5.6));
		
		Function<Double, String> resultado = m-> m>=7? "aprovado":"Reprovado";
		System.out.println(media.andThen(resultado).apply(9.5, 5.2));
		
		//BiFunction<Double, Double, String> media1 = (n1, n2) -> ((n1+n2)/2) >=7 ? "Aprovado": "Reprovado";
		
		BiFunction<Double, Double, String> media1 = (n1, n2) -> {
			double media3 = (n1+n2)/2;
			return media3 >=7 ? "Aprovado": "Reprovado";
				
		};	 
		System.out.println(media1.apply(3.3, 8.2));
	}

}
