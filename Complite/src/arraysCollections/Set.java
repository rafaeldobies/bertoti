package arraysCollections;

import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
	
		conjunto.add("rafael");
		conjunto.add(31);
		conjunto.add(1.7);
		conjunto.add(true);
		
		System.out.println(conjunto.size());
		conjunto.add('c');
		System.out.println(conjunto.contains("joao"));
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove(true));
		System.out.println(conjunto.size());
	}
}
