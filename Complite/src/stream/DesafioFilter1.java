package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter1 {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Rafa", "SJC", "Masculino", 33);
		Funcionario f2 = new Funcionario("Lucas", "Jacareí", "Masculino", 32);
		Funcionario f3 = new Funcionario("Matheus", "SJC", "Masculino", 33);
		Funcionario f4 = new Funcionario("Camila", "SJC", "Feminino", 37);
	
		List<Funcionario> func = Arrays.asList(f1, f2, f3, f4);
		
		Predicate<Funcionario> isSaoJose = n -> n.cidade.equals("SJC");
		Predicate<Funcionario> isMasculino = n -> n.sexo.equals("Masculino");
		Function<Funcionario, String> selecionados = n -> n.nome + " está selecionado.";
		
			
		func.stream()
			.filter(isSaoJose)
			.filter(isMasculino)
			.map(selecionados)
			.forEach(System.out::println);
	
	}
	
	
	

}
