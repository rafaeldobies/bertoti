package arraysCollections;

import java.util.Scanner;

public class DesafioMediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantNotas=0;
		double media;
		double total=0;
		System.out.println("quantas notas serão inseridas?");
		Scanner entrada = new Scanner(System.in);
		quantNotas= entrada.nextInt();
		
		double[] notas= new double[quantNotas];
		if (quantNotas>0) {
			
			for (int i=0; i<quantNotas; i++) {
				
				System.out.printf("Insira a nota %d", i+1);
				notas[i]=entrada.nextDouble();
			
			} 
		}
		
		for (double nota: notas) {
			
			total+=nota;
		}
		
		System.out.println(media=total/notas.length);
			
				
				
		

	}

}
