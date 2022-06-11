package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		//Method Reference
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> printInt = System.out::print;
		
		//Forma de criar stream = Stream.of
		Stream<String> linguagens = Stream.of("Java ", "Lua ", "JS\n");
		linguagens.forEach(print);
		
		//Forma de criar stream = array 
		String[] maisLinguagens = { "Python ", "Lisp ", "Pearl ", "Go\n"};
		Stream.of(maisLinguagens).forEach(print);
		
		Arrays.stream(maisLinguagens).forEach(print);
		
		Arrays.stream(maisLinguagens, 1, 3).forEach(print);// 1 e 3 são indices
		
		List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLinguagens.stream().forEach(print);
		outrasLinguagens.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);  // Gera infinitamente a letra "a"
		//Stream.iterate(0, n -> n+1).forEach(printInt); // Gera a iteração infinita
		

	}

}
