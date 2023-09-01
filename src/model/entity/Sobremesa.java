package model.entity;


public class Sobremesa extends Item {
	public Sobremesa(String codigo, Double preco , String nome) {
		super(codigo,nome ,preco);
	}

	@Override
	public String toString() {
		return "\n\nSobremesa: " + nome + "\nR$: " + preco;
	}
}
