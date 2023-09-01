package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.List;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import model.util.Utility;
import model.entity.*;

public class CardapioController implements Initializable {

	@FXML
	private ChoiceBox<String> choiceBoxBebida;
// 	Declara um array de String chamado bebidas
	private String[] bebidas = { "Água com gás", "Água sem gás", "Coca-cola litro", "Coca-cola lata", "Guarana litro",
			"Guarana lata", "Pepsi litro", "Cerveja litro" };

	@FXML
	private ChoiceBox<String> choiceBoxPizza;
// 	Declara um array de String chamado pizzas
	private String[] pizzas = { "Margherita Pequeno", "Margherita Médio", "Margherita Grande", "Margherita Família",
			"Calabresa Pequeno", "Calabresa Médio", "Calabresa Grande", "Calabresa Família", "Quatro Queijos Pequeno",
			"Quatro Queijos Média", "Quatro Queijos Grande", "Quatro Queijos Família", "Camarão Pequeno",
			"Camarão Médio", "Camarão Grande", "Camarão Família", "Frango Pequeno", "Frango Médio", "Frango Grande",
			"Frango Família" };
	@FXML
	private ChoiceBox<String> choiceBoxSobremesa;
// 	Declara um array de String chamado sobremesas
	private String[] sobremesas = { "Cheese Cake", "Sorvete de Baunilha", "Sorvete de Chocolate",
			"Slider de Brigadeiro", "Slider de Doce de Leite", "Slider de Cocada" };

	@FXML
	private Button btnConfirmar;

	@FXML
	private Button btnAdicionar;
	
    @FXML
    private Button btnVoltar;

	@FXML
	private TextField txtFieldNomeCliente;

	private List<Item> itensTemp = new ArrayList<>();
	private String nomeClienteTemp = null;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
// 		Inicializa as opções dentro de cada ChoiceBox
		choiceBoxPizza.getItems().addAll(pizzas);
		choiceBoxBebida.getItems().addAll(bebidas);
		choiceBoxSobremesa.getItems().addAll(sobremesas);
		
	}

	@FXML
	void onClickBtnAdicionarAoPedido(ActionEvent event) throws Exception {
		try {
			String nomeCliente = txtFieldNomeCliente.getText().trim();

// 			Verifica se o TextField foi preenchido com o nome do cliente
			if (nomeCliente.isEmpty()) {
				throw new Exception("Nome do cliente não inserido");
			}

// 			Adiciona o que foi digitado pelo usuário ao atributo
			nomeClienteTemp = nomeCliente;

			String bebidaSelecionada = choiceBoxBebida.getValue();
			String pizzaSelecionada = choiceBoxPizza.getValue();
			String sobremesaSelecionada = choiceBoxSobremesa.getValue();

			String codigoBebida = null;
			String codigoPizza = null;
			String codigoSobremesa = null;

//			Verificando a pizza selecionada
			if (pizzaSelecionada != null) {
				switch (pizzaSelecionada) {
				case "Margherita Pequeno":
					codigoPizza = "001";
					break;
				case "Margherita Médio":
					codigoPizza = "002";
					break;
				case "Margherita Grande":
					codigoPizza = "003";
					break;
				case "Margherita Família":
					codigoPizza = "004";
					break;
				case "Calabresa Pequeno":
					codigoPizza = "005";
					break;
				case "Calabresa Médio":
					codigoPizza = "006";
					break;
				case "Calabresa Grande":
					codigoPizza = "007";
					break;
				case "Calabresa Família":
					codigoPizza = "008";
					break;
				case "Quatro Queijos Pequeno":
					codigoPizza = "009";
					break;
				case "Quatro Queijos Média":
					codigoPizza = "010";
					break;
				case "Quatro Queijos Grande":
					codigoPizza = "011";
					break;
				case "Quatro Queijos Família":
					codigoPizza = "012";
					break;
				case "Camarão Pequeno":
					codigoPizza = "013";
					break;
				case "Camarão Médio":
					codigoPizza = "014";
					break;
				case "Camarão Grande":
					codigoPizza = "015";
					break;
				case "Camarão Família":
					codigoPizza = "016";
					break;
				case "Frango Pequeno":
					codigoPizza = "017";
					break;
				case "Frango Médio":
					codigoPizza = "018";
					break;
				case "Frango Grande":
					codigoPizza = "019";
					break;
				case "Frango Família":
					codigoPizza = "020";
					break;
				}
			}

// 			Verificando a bebida selecionada
			if (bebidaSelecionada != null) {
				switch (bebidaSelecionada) {
				case "Água com gás":
					codigoBebida = "021";
					break;
				case "Água sem gás":
					codigoBebida = "022";
					break;
				case "Coca-cola litro":
					codigoBebida = "023";
					break;
				case "Coca-cola lata":
					codigoBebida = "024";
					break;
				case "Guarana litro":
					codigoBebida = "025";
					break;
				case "Guarana lata":
					codigoBebida = "026";
					break;
				case "Pepsi litro":
					codigoBebida = "027";
					break;
				case "Cerveja litro":
					codigoBebida = "028";
					break;
				}
			}

// 			Verificando a sobremesa selecionada
			if (sobremesaSelecionada != null) {
				switch (sobremesaSelecionada) {
				case "Cheese Cake":
					codigoSobremesa = "029";
					break;
				case "Sorvete de Baunilha":
					codigoSobremesa = "030";
					break;
				case "Sorvete de Chocolate":
					codigoSobremesa = "031";
					break;
				case "Slider de Brigadeiro":
					codigoSobremesa = "032";
					break;
				case "Slider de Doce de Leite":
					codigoSobremesa = "033";
					break;
				case "Slider de Cocada":
					codigoSobremesa = "034";
					break;
				}
			}

//			Adicionar código para processar o pedido com base no código do item selecionado
//			Realiza a verificação de quais itens foram selecionados e adiciona a lista de itens
			if (codigoPizza != null) {
				for (Pizza pizza : Utility.PEDIDO_REPOSITORY.getpizzasCardapio()) {
					if (pizza.getCodigo().equals(codigoPizza)) {
						itensTemp.add(pizza);
					}
				}
			}

			if (codigoBebida != null) {
				for (Bebida bebida : Utility.PEDIDO_REPOSITORY.getbebidasCardapio()) {
					if (bebida.getCodigo().equals(codigoBebida)) {
						itensTemp.add(bebida);
					}
				}
			}

			if (codigoSobremesa != null) {
				for (Sobremesa sobremesa : Utility.PEDIDO_REPOSITORY.getsobremesasCardapio()) {
					if (sobremesa.getCodigo().equals(codigoSobremesa)) {
						itensTemp.add(sobremesa);
					}
				}
			}
//			Verifica se algum item foi adicionado a lista
			if (itensTemp.isEmpty()) {
				throw new Exception("Nenhum item adicinado ao pedido!");

			}
			
// 			Adiciona o objeto Pedido a lista de Pedidos na Repository
			Pedido novoPedido = new Pedido(nomeClienteTemp, itensTemp, 0.0);
			novoPedido.calcularTotal();
			Utility.PEDIDO_REPOSITORY.adicionarPedido(novoPedido);

// 			Verificação se o pedido foi adicionado
			if (Utility.PEDIDO_REPOSITORY.getPedidos().contains(novoPedido)) {
// 				Pedido adicionado com sucesso
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Sucesso");
				alert.setHeaderText("Pedido adicionado com sucesso");
				alert.setContentText("O pedido foi adicionado com sucesso.");
				alert.showAndWait();
				choiceBoxPizza.getSelectionModel().clearSelection();
				choiceBoxBebida.getSelectionModel().clearSelection();
				choiceBoxSobremesa.getSelectionModel().clearSelection();
				txtFieldNomeCliente.clear();
				
			} else {
// 				Falha ao adicionar o pedido
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro");
				alert.setHeaderText("Erro ao adicionar o pedido");
				alert.setContentText("O pedido não pôde ser adicionado. Por favor, tente novamente.");
				alert.showAndWait();
			}
			
			

// 		Tratamento das excessões
		} catch (Exception eAdicionarBtn) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Erro ao adicionar ao pedido");
			alert.setContentText(eAdicionarBtn.getMessage());
			alert.showAndWait();
		}
	}
	
	

	@FXML
	void onClickBtnConfirmarPedido(ActionEvent event) throws Exception {
		try {
			if (Utility.PEDIDO_REPOSITORY.getPedidos().isEmpty()) {
// 				Exibir mensagem de erro informando que nenhum pedido foi adicionado
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro");
				alert.setHeaderText("Nenhum pedido adicionado");
				alert.setContentText("Por favor, adicione pelo menos um pedido antes de continuar");
				alert.showAndWait();
			} else {
// 				Redirecionar para a próxima cena
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/ExibirPedidos.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) btnConfirmar.getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			}

		} catch (Exception eConfirmBtn) {
			eConfirmBtn.printStackTrace();
		}
	}

	@FXML
	void onClickBtnVoltar(ActionEvent event) throws Exception {
		// Retorna a tela de menu
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = (Stage) btnVoltar.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
