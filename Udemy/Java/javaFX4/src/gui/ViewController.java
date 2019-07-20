package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTesteAction() {
		Alerts.showAlert("Vai Explodir!!!", "Sai Correndo >>>", "1, 2, 3..", AlertType.WARNING);		
	}

}
