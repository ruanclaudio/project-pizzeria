package model.entity;

public class Pizza extends Item {
	protected String sabor;
	protected String tamanho;

	public Pizza(String codigo, Double preco, String nome, String tamanho) {
		super(codigo,nome ,preco);
		this.tamanho = tamanho;
		
	}

	@Override
	public String toString() {
		return "Pizza de " + nome + "\nTamanho: " + tamanho + "\nR$:  " + preco;
	}
	// Getters e Setters

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
