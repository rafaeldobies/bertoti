package oo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	double valorTotalCompra;
	List<Item> itens = new ArrayList<>();
	
	void addItens (String nome, double preco, int quant) {
		
		this.itens.add(new Item(quant, new Produto(nome, preco)));
	}
	
	double calculaValorTotal() {
		for (Item i: itens) {
			valorTotalCompra += (i.quantidade*i.produto.preco);
		}
		return valorTotalCompra;
		
	}
		
}
