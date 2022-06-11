package oo;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compra compra1 = new Compra();
		compra1.addItens("caneta",1.5, 10);
		compra1.addItens("caderno",15, 10);
		compra1.addItens("borracha",0.5, 10);
		compra1.calculaValorTotal();
		
		Compra compra2 = new Compra();
		compra2.addItens("lápizeira",7.5, 10);
		compra2.addItens("grafite",2.5, 10);
		compra2.addItens("corretivo",1.5, 10);
		compra2.calculaValorTotal();
		
		Cliente cliente1 = new Cliente("Rafael Villa");
		cliente1.addItensCompra(compra1);
		cliente1.addItensCompra(compra2);
		
		System.out.println(compra1.valorTotalCompra);
		System.out.println(compra2.valorTotalCompra);
		System.out.println(cliente1.obterValorTotalCompras());
		
		
	}

}
