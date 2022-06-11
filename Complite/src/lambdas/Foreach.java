package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "leo", "gui", "Bia");
		
		System.out.println("Metodo Tradicional...");
		
		for (String nome: aprovados) {
			System.out.println(nome);
		}
	
		System.out.println("\nLambda 01...");
		
		aprovados.forEach(nomes -> System.out.println(nomes + "!!!"));
		
	
		System.out.println("\nMethod Reference...");
		
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda 02...");
		
		aprovados.forEach(nome -> meuFormato(nome));
		
		
		System.out.println("\nMethod Reference 02...");
		
		aprovados.forEach(Foreach::meuFormato);
		
		
		
	
	
	}
	
	static void meuFormato (String nome) {
		System.out.println("Olá! Meu nome é " + nome);
	}

}
