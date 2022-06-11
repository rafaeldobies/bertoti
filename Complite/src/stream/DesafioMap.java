package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<Integer> print = System.out::println;
		
		//Não é necessário criar ima LAMBDA, porque ja existe uma função que faz isso na classe Integer
		Function<Integer, String> toBinario = n->Integer.toBinaryString(n);
		
		UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
		
		Function<String, Integer> toInteiro = n -> Integer.parseInt(n, 2);
		
		Stream<Integer> stream = numeros.stream();
		
		stream
		//.map(toBinario)
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(toInteiro)
		.forEach(print);
		
		
	}

}
