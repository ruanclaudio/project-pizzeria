package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

	@FXML
	private Button btnLogin;

	@FXML
	private PasswordField txtPassword;

	@FXML
	private TextField txtUser;

	@FXML
	void onClickBtnLogin(ActionEvent event) throws Exception {
		try {
			String usuario = txtUser.getText();
			String senha = txtPassword.getText();

			if (usuario.equals("admin") && senha.equals("1234")) {
				// Redirecionar para a próxima cena
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = (Stage) btnLogin.getScene().getWindow(); // obtém a janela atual
				stage.setScene(scene);
				stage.show();
			} else {
				// Exibir mensagem de erro
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro");
				alert.setHeaderText("Credenciais inválidas");
				alert.setContentText("Por favor, verifique seu nome de usuário e senha.");
				alert.showAndWait();
				
				txtPassword.clear();
			}
		} catch (Exception eLogin) {
			eLogin.printStackTrace();

		}
	}
}
