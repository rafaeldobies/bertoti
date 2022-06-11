package metodos;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		dia=1;
		mes=1;
		ano=1970;
				
	}
	
	Data (int diaIni, int mesIni, int anoIni){
		dia = diaIni;
		mes=mesIni;
		ano = anoIni;
		
		
	}
	
	String dataFormatada() {
		String formato = String.format("%d /%d /%d", dia,mes,ano);
		
		
		return formato;
	}
	
}
