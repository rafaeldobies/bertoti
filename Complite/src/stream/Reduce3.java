package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.0);
		Aluno a2 = new Aluno("Bia", 3.0);
		Aluno a3 = new Aluno("Lia", 9.5);
		Aluno a4 = new Aluno("Gui", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = n -> n.nota>=7.0;
		Function<Aluno, Double> notas = n->n.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinar = (m1,m2) -> Media.combinar(	m1, m2);
		
		Media media = alunos.stream()
			.filter(aprovados)
			.map(notas)
			.reduce(new Media(), calcularMedia, combinar);
		
		System.out.println("A média do aluno é " + media.getValor());
			
	}
}
