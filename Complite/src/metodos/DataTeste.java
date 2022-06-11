package metodos;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Data data1= new Data();
		data1.ano = 1989;
		data1.mes = 10;
		data1.dia = 8;
		
		Data data2= new Data();
		data2.ano = 1984;
		data2.mes = 10;
		data2.dia = 26;

		Data d3= new Data();
		Data d4= new Data(15,7,2021);
		System.out.printf("Rafael nasceu no dia %d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("Camila nasceu no dia %d/%d/%d\n", data2.dia, data2.mes, data2.ano);
		System.out.println("Camila nasceu em " + d3.dataFormatada());
		System.out.println("Rafael nasceu em " + d4.dataFormatada());
		
		
	}

}
