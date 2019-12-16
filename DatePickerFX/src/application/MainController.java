package application;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController implements Initializable {

	@FXML private DatePicker dp;
	@FXML private Label lbldate;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	public void showdate(ActionEvent event) {
		LocalDate ld = dp.getValue();
		lbldate.setText(ld.toString());
	}
	
	public void loadGraph(ActionEvent event) throws Exception{
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Chart.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
}
