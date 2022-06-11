package stream;

import java.util.Arrays;
import java.util.List;

public class DistinctSkipLimitTakeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Aluno a1 = new Aluno("Ana", 8.0);
			Aluno a2 = new Aluno("Bia", 9.0);
			Aluno a3 = new Aluno("Lia", 9.5);
			Aluno a4 = new Aluno("Gui", 10.0);
			Aluno a5 = new Aluno("Ana", 8.0);
			Aluno a6 = new Aluno("Bia", 9.0);
			Aluno a7 = new Aluno("Lia", 9.5);
			Aluno a8 = new Aluno("Gui", 10.0);
			
			List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
			
			System.out.println("\ndistinct....\n");
			alunos.stream().distinct() // tem que criar o hashCode e Equals na classe aluno para funcionar
			.forEach(System.out::println);
			
			System.out.println("\nSkip / Limit....\n");
			alunos.stream().distinct() // tem que criar o hashCode e Equals na classe aluno para funcionar
			.skip(1)  // pula 1 item
			.limit(2) // limita a 2 respostas
			.forEach(System.out::println);
			
			System.out.println("\ntakeWhile....\n");
			alunos.stream().distinct() // tem que criar o hashCode e Equals na classe aluno para funcionar
			.skip(2)
			.takeWhile(a->a.nota>7) // pega enquanto a nota é maior ou igual a 7
			.forEach(System.out::println);
			
	}
}
