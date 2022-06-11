package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("rafa", 8.8);
		Aluno a2 = new Aluno("Rob", 3.8);
		Aluno a3 = new Aluno("Ca", 5.8);
		Aluno a4 = new Aluno("Pri", 7.8);
		Aluno a5 = new Aluno("Lucas", 6.8);
		Aluno a6 = new Aluno("Suzy", 7.8);
		
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2,a3,a4,a5,a6);
		
		
		Predicate<Aluno> aprovados = n-> n.nota>=7.0;
		Function<Aluno,	String> saudacoes = n -> "Parabéns " + n.nome + "!!!!! VocÊ foi aprovado!";
		
		alunos.stream()
		.filter(aprovados)
		.map(saudacoes)
		.forEach(System.out::println);
		
	}
}
