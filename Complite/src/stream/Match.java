package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Aluno a1 = new Aluno("Ana", 8.0);
			Aluno a2 = new Aluno("Bia", 9.0);
			Aluno a3 = new Aluno("Lia", 9.5);
			Aluno a4 = new Aluno("Gui", 10.0);
			
			List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
			
			Predicate<Aluno> aprovados = n -> n.nota>=7.0;
			Predicate<Aluno> reprovados = aprovados.negate();
			
			System.out.println(alunos.stream().allMatch(aprovados));
			System.out.println(alunos.stream().anyMatch(aprovados));
			System.out.println(alunos.stream().noneMatch(reprovados));
	
			
	
	}
	

}
