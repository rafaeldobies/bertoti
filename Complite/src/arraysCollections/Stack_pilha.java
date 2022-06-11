package arraysCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack_pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.add("Senhor dos anéis");
		livros.add("O hobbit");
		
		System.out.println(livros.size());
		System.out.println(livros.contains("O hobbit"));
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
	}

}
