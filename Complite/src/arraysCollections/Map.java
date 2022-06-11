package arraysCollections;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
		
		java.util.Map <Integer, String> funcionarios = new HashMap<>();
		
		funcionarios.put(1, "rafael");
		funcionarios.put(2, "Ana");
		funcionarios.put(3, "Camila");
		funcionarios.put(4, "Bia");
		
		System.out.println(funcionarios.size());
		System.out.println(funcionarios.isEmpty());
		
		System.out.println(funcionarios.keySet());
		System.out.println(funcionarios.values());
		System.out.println(funcionarios.entrySet());
		
		System.out.println(funcionarios.get(4));
		
		for (int chave: funcionarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: funcionarios.values()) {
			System.out.println(valor);
		}
		
	}

}
