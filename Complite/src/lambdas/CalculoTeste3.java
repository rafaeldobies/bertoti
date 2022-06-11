package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator <Double>calc = (x, y) -> {return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		 
		calc = (z,w) -> z*w;   //quando não existe {} após a -> significa que é uma unica linha de código na função LAMBDA e não tem a palavra RETURN
		System.out.println(calc.apply(2.0, 3.0));

		BinaryOperator <Integer>calc2 = (x, y) -> {return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (z,w) -> z*w;   //quando não existe {} após a -> significa que é uma unica linha de código na função LAMBDA e não tem a palavra RETURN
		System.out.println(calc2.apply(2, 3));

	}	
		
}
