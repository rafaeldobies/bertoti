package lambdas;

import java.math.RoundingMode;
import java.text.Format;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto p1 = new Produto("Note", 3569.99, .50);
		
		//cALCULAR PREÇO REAL COM DESCONTO
		
		Function<Produto, Double> desconto = desc -> p1.preco*(1-p1.desconto);
		UnaryOperator<Double> imposto = desc -> desc>=2500?desc*1.085:desc;
		UnaryOperator<Double> frete = imp -> imp>=3000?imp+100:imp+50;
		UnaryOperator<Double> arredondar = arred -> Double.parseDouble(String.format("%.2f", arred));
		Function<Double, String> formatar = form -> ("O preço do produto é R$ "+ form).replace(".", ",");
		
		String precoFinal = desconto.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p1);
		
		System.out.println(precoFinal);
	}
}
