package model;

import java.util.List;
import java.util.ArrayList;

import model.entity.*;

public class Repository implements IRepository {
	private List<Pizza> pizzasCardapio;
	private List<Bebida> bebidasCardapio;
	private List<Sobremesa> sobremesasCardapio;
	private List<Pedido> pedidos;

	public Repository() {
		this.pizzasCardapio = new ArrayList<>();
		this.bebidasCardapio = new ArrayList<>();
		this.sobremesasCardapio = new ArrayList<>();
		this.pedidos = new ArrayList<>();

//	 Adicionando os objetos as suas determinadas listas:
		pizzasCardapio.add(margheritaPequena);
		pizzasCardapio.add(margheritaMedia);
		pizzasCardapio.add(margheritaGrande);
		pizzasCardapio.add(margheritaFamilia);
		pizzasCardapio.add(calabresaPequena);
		pizzasCardapio.add(calabresaMedia);
		pizzasCardapio.add(calabresaGrande);
		pizzasCardapio.add(calabresaFamilia);
		pizzasCardapio.add(quatroqueijosPequena);
		pizzasCardapio.add(quatroqueijosMedia);
		pizzasCardapio.add(quatroqueijosGrande);
		pizzasCardapio.add(quatroqueijosFamilia);
		pizzasCardapio.add(camaraoPequena);
		pizzasCardapio.add(camaraoMedia);
		pizzasCardapio.add(camaraoGrande);
		pizzasCardapio.add(camaraoFamilia);
		pizzasCardapio.add(frangocatupiryPequena);
		pizzasCardapio.add(frangocatupiryMedia);
		pizzasCardapio.add(frangocatupiryGrande);
		pizzasCardapio.add(frangocatupiryFamilia);
		// ----------------------------------
		bebidasCardapio.add(aguacomgas);
		bebidasCardapio.add(aguasemgas);
		bebidasCardapio.add(cocacolalitro);
		bebidasCardapio.add(cocacolalata);
		bebidasCardapio.add(guaranalitro);
		bebidasCardapio.add(guaranalata);
		bebidasCardapio.add(pepsilitro);
		bebidasCardapio.add(cervejalitro);
		// ----------------------------------
		sobremesasCardapio.add(cheesecake);
		sobremesasCardapio.add(sorvetebaunilha);
		sobremesasCardapio.add(sorvetechocolate);
		sobremesasCardapio.add(sliderbrigadeiro);
		sobremesasCardapio.add(sliderdocedeleite);
		sobremesasCardapio.add(sliderdecocada);

	}

	@Override
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);

	}

	@Override
	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);

	}

	@Override
	public List<Pedido> exibirPedido() {
		for (Pedido pedido : pedidos) {
			System.out.println("Nome do Cliente: " + pedido.getNomeCliente());
			System.out.println("Pedido:");
			
			pedido.getItensPedido();
		}
		return pedidos;
	}

	//	Criando objetos para as listas de Pizza

	// 	Pizza de Margherita:
	Pizza margheritaPequena = new Pizza("001", 25.00, "Margherita", "Pequena");
	Pizza margheritaMedia = new Pizza("002", 35.00, "Margherita", "Media");
	Pizza margheritaGrande = new Pizza("003", 45.00, "Margherita", "Grande");
	Pizza margheritaFamilia = new Pizza("004", 57.00, "Margherita", "Familia");

	// 	Pizza de Calabresa:
	Pizza calabresaPequena = new Pizza("005", 27.00, "Calabresa", "Pequena");
	Pizza calabresaMedia = new Pizza("006", 37.00, "Calabresa", "Media");
	Pizza calabresaGrande = new Pizza("007", 45.00, "Calabresa", "Grande");
	Pizza calabresaFamilia = new Pizza("008", 57.00, "Calabresa", "Familia");

	//	Pizza de Quatro Queijos:
	Pizza quatroqueijosPequena = new Pizza("009", 30.00, "Quatro Queijos", "Pequena");
	Pizza quatroqueijosMedia = new Pizza("010", 40.00, "Quatro Queijos", "Media");
	Pizza quatroqueijosGrande = new Pizza("011", 50.00, "Quatro Queijos", "Grande");
	Pizza quatroqueijosFamilia = new Pizza("012", 65.00, "Quatro Queijos", "Familia");

	// 	Pizza de Camarão:
	Pizza camaraoPequena = new Pizza("013", 40.00, "Camarão", "Pequena");
	Pizza camaraoMedia = new Pizza("014", 55.00, "Camarão", "Media");
	Pizza camaraoGrande = new Pizza("015", 65.00, "Camarão", "Grande");
	Pizza camaraoFamilia = new Pizza("016", 80.00, "Camarão", "Familia");

	// Pizza de Frango com Catupiry:
	Pizza frangocatupiryPequena = new Pizza("017", 27.00, "Frango com Catupiry", "Pequena");
	Pizza frangocatupiryMedia = new Pizza("018", 37.00, "Frango com Catupiry", "Media");
	Pizza frangocatupiryGrande = new Pizza("019", 45.00, "Frango com Catupiry", "Grande");
	Pizza frangocatupiryFamilia = new Pizza("020", 57.00, "Frango com Catupiry", "Familia");
	//--------------------------------------------------------------------------------------------

	//Criando objetos para as listas de bebidasCardapio

	Bebida aguacomgas = new Bebida("021", 6.00, "Água com gás");
	Bebida aguasemgas = new Bebida("022", 5.00, "Água sem gás");
	Bebida cocacolalitro = new Bebida("023", 8.00, "Coca-cola litro");
	Bebida cocacolalata = new Bebida("024", 6.00, "Coca-cola lata");
	Bebida guaranalitro = new Bebida("025", 7.00, "Guarana litro");
	Bebida guaranalata = new Bebida("026", 5.50, "Guarana lata");
	Bebida pepsilitro = new Bebida("027", 7.00, "Pepsi litro");
	Bebida cervejalitro = new Bebida("028", 7.00, "Cerveja litro");
	//--------------------------------------------------------------------------------------------

	//Criando objetos para as listas de sobremesasCardapio

	Sobremesa cheesecake = new Sobremesa("029", 23.00, "Cheese Cake");
	Sobremesa sorvetebaunilha = new Sobremesa("030", 7.50, "Sorvete de Baunilha");
	Sobremesa sorvetechocolate = new Sobremesa("031", 8.90, "Sorvete de Chocolate");
	Sobremesa sliderbrigadeiro = new Sobremesa("032", 10.90, "Slider de Brigadeiro");
	Sobremesa sliderdocedeleite = new Sobremesa("033", 11.90, "Slider de Doce de Leite");
	Sobremesa sliderdecocada = new Sobremesa("034", 10.90, "Slider de Cocada");
	
	// Getters e Setters
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pizza> getpizzasCardapio() {
		return pizzasCardapio;
	}

	public List<Bebida> getbebidasCardapio() {
		return bebidasCardapio;
	}

	public List<Sobremesa> getsobremesasCardapio() {
		return sobremesasCardapio;
	}

}
