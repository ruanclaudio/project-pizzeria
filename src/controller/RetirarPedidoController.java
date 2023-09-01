package controller;

import java.net.URL;
import java.util.ResourceBundle;
import model.entity.Pedido;
import model.util.Utility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class RetirarPedidoController implements Initializable {

	@FXML
	private ChoiceBox<String> choiceBoxRemoverCliente;

	@FXML
	private Button btnRetirarPedido;

	@FXML
	private Button btnVoltar;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for (Pedido pedido : Utility.PEDIDO_REPOSITORY.getPedidos()) {
			choiceBoxRemoverCliente.getItems().add(pedido.getNomeCliente());
		}

	}

	@FXML
	void onClickBtnRetirarPedido(ActionEvent event) {
		try {
			String clienteSelecionado = choiceBoxRemoverCliente.getValue();
			for (Pedido pedido : Utility.PEDIDO_REPOSITORY.getPedidos()) {
				if (clienteSelecionado.equals(pedido.getNomeCliente())) {
					Utility.PEDIDO_REPOSITORY.removerPedido(pedido);
				}
				break;
			}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Sucesso");
			alert.setHeaderText("Pedido retirado com sucesso");
			alert.setContentText("O pedido foi retirado com sucesso.");
			alert.showAndWait();
			choiceBoxRemoverCliente.getSelectionModel().clearSelection();

		} catch (Exception eRetirar) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro");
			alert.setHeaderText("Erro ao retirar pedido");
			alert.setContentText(eRetirar.getMessage());
			alert.showAndWait();
		}

	}

	@FXML
	void onClickBtnVoltar(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = (Stage) btnVoltar.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

}
