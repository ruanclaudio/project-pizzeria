package model;

import java.util.List;

import model.entity.Pedido;

public interface IRepository {
	void adicionarPedido(Pedido pedido);
	void removerPedido(Pedido pedido);
	List<Pedido> exibirPedido();
}
