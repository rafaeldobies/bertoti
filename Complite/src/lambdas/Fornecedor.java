package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<List<String>> umaLista = () -> Arrays.asList("bia" , "lia", "gui");
		System.out.println(umaLista.get());
	}

}
