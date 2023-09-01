package model.entity;

import java.util.List;
import java.util.ArrayList;

public class Pedido {
	protected String nomeCliente;
	protected List<Item> itensPedido = new ArrayList<>();
	protected Double total = 0.0;
	
	public Pedido(String nomeCliente, List<Item> itensPedido, Double total) {
		this.nomeCliente = nomeCliente;
		this.itensPedido = itensPedido;
		this.total = total;
	}
	
	// Adiciona um item a lista de Pedidos
	public void adicionarItem(Item item) {
		itensPedido.add(item);
	}
	
	public Double calcularTotal() {
		total = 0.0;
		for (Item item : itensPedido) {
			total += item.getPreco();
		}
		return total;
	}
	
	public String toString() {
		return "\nCliente: " + nomeCliente + 
				"\nPedido: \n" + itensPedido +
				"\n\nTotal: R$ " + calcularTotal();
	}
	
	// Gerando Getters e Setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public List<Item> getItensPedido() {
		return itensPedido;
	}
	public void setItensPedido(List<Item> itensPedido) {
		this.itensPedido = itensPedido;
	}
	
}
