package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;



public class Streams {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Rafa","João", "Gui","Zé");
		
		System.out.println("Usando for...");
		
		for (int i=0; i<aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		System.out.println("\nUsando foreach...");
		
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		
		Iterator<String> i = aprovados.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
		System.out.println("\nUsando Stream...");
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
	}
	
}
