package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator <Double>calc = (x, y) -> {return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		 
		calc = (z,w) -> z*w;   //quando n�o existe {} ap�s a -> significa que � uma unica linha de c�digo na fun��o LAMBDA e n�o tem a palavra RETURN
		System.out.println(calc.apply(2.0, 3.0));

		BinaryOperator <Integer>calc2 = (x, y) -> {return x + y; };
		System.out.println(calc2.apply(2, 3));
		
		calc = (z,w) -> z*w;   //quando n�o existe {} ap�s a -> significa que � uma unica linha de c�digo na fun��o LAMBDA e n�o tem a palavra RETURN
		System.out.println(calc2.apply(2, 3));

	}	
		
}
