package model.entity;

public abstract class Item {
	protected String codigo;
	protected String nome;
	protected Double preco;
	
	public Item(String codigo,String nome ,Double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public abstract String toString();
	

	public String getCodigo() {
		return codigo;
	}

	public Double getPreco() {
		return preco;
	}


	public String getNome() {
		return nome;
	}
	
}
