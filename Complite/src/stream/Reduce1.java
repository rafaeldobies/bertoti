package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (acum, n) -> acum+n;
		
		Integer total = numeros.stream().reduce(soma).get();
		
		System.out.println(total);
		
		// diferença entre o parallelStream e o Stream
		Integer numeros2 = numeros.parallelStream().reduce(100, soma);//o valor de 100 é add a cada nova iteração
		System.out.println(numeros2);
		
		Integer numeros3 = numeros.stream().reduce(100, soma); // o valor do 100 é somado somente na primeira vez
		System.out.println(numeros3);
		
		
		//Resultado foi um OptionalInteger...
		numeros.stream()
		.filter(n ->n>=5)
		.reduce(soma)
		.ifPresent(System.out::println);		
	}
}
