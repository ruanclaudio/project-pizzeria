package model.entity;

public class Bebida extends Item{
	
	public Bebida(String codigo, Double preco, String nome) {
		super(codigo,nome ,preco);
		
	}

	@Override
	public String toString() {
		return "\n\nBebida: " + nome + "\nR$: " + preco;
	}
}
