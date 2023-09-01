package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.animation.PauseTransition;

import model.Repository;
import model.util.Utility;

public class MenuController {

	@FXML
	private Button btnEncerrarSistema;

	@FXML
	private Button btnExibirPedidos;

	@FXML
	private Button btnRealizarPedido;

	@FXML
	private Button btnRetirarPedido;

	// Instanciando objetos
	Repository repository = new Repository();

	@FXML
	void onBtnClickEncerrarSistema(ActionEvent event) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Encerrando Sistema");
		alert.setHeaderText(null);
		alert.setContentText("Encerrando o sistema...");

		alert.show();

		PauseTransition pause = new PauseTransition(Duration.seconds(3));
		pause.setOnFinished(e -> {
			Stage stage = (Stage) btnEncerrarSistema.getScene().getWindow();
			stage.close();
			Platform.exit();
		});

		pause.play();
	}

	@FXML
	void onBtnClickExibirPedidos(ActionEvent event) throws Exception {
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
				Stage stage = (Stage) btnRealizarPedido.getScene().getWindow();
				stage.setScene(scene);
				stage.show();
			}

		} catch (Exception eConfirmBtn) {
			eConfirmBtn.printStackTrace();
		}
	}

	@FXML
	void onBtnClickRealizarPedido(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cardapio.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = (Stage) btnRealizarPedido.getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	void onBtnClickRetirarPedido(ActionEvent event) {
		try {
			if (Utility.PEDIDO_REPOSITORY.getPedidos().isEmpty()) {
// 				Exibir mensagem de erro informando que nenhum pedido foi adicionado
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro");
				alert.setHeaderText("Nenhum pedido adicionado");
				alert.setContentText("Por favor, adicione pelo menos um pedido antes de continuar");
				alert.showAndWait();
			} else {
// 				Redirecionar para a retirada
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RetirarPedido.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) btnRealizarPedido.getScene().getWindow();
				stage.setScene(scene);
				stage.show();

			}

		} catch (Exception eConfirmBtn) {
			eConfirmBtn.printStackTrace();
		}
	}

}
