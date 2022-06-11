package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculo conta=new Soma();
		System.out.println(conta.executar(2, 3));
		
		conta = new Multiplicar();
		System.out.println(conta.executar(2, 3));
		
		
	}

}
