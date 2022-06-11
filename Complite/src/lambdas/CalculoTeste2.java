package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {return x + y; };
		System.out.println(calc.executar(2, 3));
		 
		calc = (z,w) -> z*w;   //quando não existe {} após a -> significa que é uma unica linha de código na função LAMBDA e não tem a palavra RETURN
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());

	}	
		
}
