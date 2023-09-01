package controller;

import java.net.URL;
import java.util.ResourceBundle;
import model.entity.Item;
import model.entity.Pedido;
import model.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class ExibirPedidosController implements Initializable {

	@FXML
	private Label lblPedidos;

	@FXML
	private Button btnVoltar;

	@FXML
	private TextArea txtArea;

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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// Torna a TextArea não editavel pelo usuário
		txtArea.setEditable(false);
		String pedidosFormatados = formatarPedidos();
		txtArea.setText(pedidosFormatados);
	}

	private String formatarPedidos() {
		// Cria a String para exibir as informações do pedido
		StringBuilder sb = new StringBuilder();
		for (Pedido pedido : Utility.PEDIDO_REPOSITORY.getPedidos()) {
			sb.append("Cliente: ").append(pedido.getNomeCliente()).append("\n");
			sb.append("Itens do Pedido:\n");
			for (Item item : pedido.getItensPedido()) {
				sb.append(" - ").append(item.getNome()).append(": ").append(item.getPreco()).append("\n");
			}
			sb.append("Total: ").append(pedido.calcularTotal()).append("\n");
			sb.append("--------------------\n");
		}
		return sb.toString();
	}

}