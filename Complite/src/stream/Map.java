package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
	
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("bmw ", "audi ", "honda");
		marcas.stream().map(n -> n.toUpperCase()).forEach(print);
		
		//UnaryOperator<String> maiuscula = n -> n.toUpperCase();// utilizando uma classe para chamar a função
		UnaryOperator<String> caracter = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n +"!!!!  ";
		
		System.out.println("\n\n Usando composição de Stream");
		
		marcas.stream().map(Funcoes.maiuscula).map(caracter).map(Funcoes.grito).forEach(print);
		
		
	}

}
