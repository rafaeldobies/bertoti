package stream;

public class Media {
	
	private double nota;
	private int quant; 

	public Media adicionar(double valor) {
		nota += valor;
		quant ++;
		return this;
				
	}
	
	public double getValor() {
		return nota/quant;
	}
	
	public static Media combinar (Media m1, Media m2) {
		Media resultante = new Media ();
		resultante.nota = m1.nota+m2.nota;
		resultante.quant = m1.quant + m2.quant;
		return resultante;				
	}
	
}
