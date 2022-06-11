package arraysCollections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("rafael"));
		lista.add(new Usuario("João"));
		lista.add(new Usuario("Miguel"));
		lista.add(new Usuario("Manuel"));
		lista.add(new Usuario("Rafael"));
		
		Usuario u1= new Usuario("Ana");
		lista.add(u1);
		
		System.out.println(lista.contains(new Usuario("Rafael")));
		System.out.println(lista.size());
		System.out.println(lista.get(3).nome);
		System.out.println(lista.remove(new Usuario("rafael")));
		System.out.println(lista.size());
		
		for (Usuario u: lista){
			System.out.println(u.nome);
		}
		
	}

}
