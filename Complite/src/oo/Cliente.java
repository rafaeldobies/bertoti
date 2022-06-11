package oo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	List<Compra> compras = new ArrayList<>();
	String nomeCliente;
	double totalCompras;
	
	Cliente (String nome){
		this.nomeCliente = nome;
	}
	void addItensCompra (Compra compra) {
		this.compras.add(compra);
		
	}
	
	double obterValorTotalCompras() {
		for (Compra i:compras) {
			totalCompras += i.valorTotalCompra;
		}
	return totalCompras;
	}
	
	

}
