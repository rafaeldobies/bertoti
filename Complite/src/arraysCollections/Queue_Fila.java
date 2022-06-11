package arraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila= new LinkedList<>();
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Lia");
		fila.offer("Mia");
		fila.offer("Fia");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
 		
		
	}

}
