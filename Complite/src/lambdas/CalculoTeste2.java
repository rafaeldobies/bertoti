package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {return x + y; };
		System.out.println(calc.executar(2, 3));
		 
		calc = (z,w) -> z*w;   //quando n�o existe {} ap�s a -> significa que � uma unica linha de c�digo na fun��o LAMBDA e n�o tem a palavra RETURN
		System.out.println(calc.executar(2, 3));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());

	}	
		
}
