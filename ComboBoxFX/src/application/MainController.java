package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable{

	@FXML
	public Label myLabel;
	@FXML
	public ListView<String> listview;
	@FXML
	public ComboBox<String> comboBox;
	
	ObservableList<String> listType = FXCollections.observableArrayList("Single","Double","Luxuary","Intermediate");
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		comboBox.setItems(listType);
		listview.setItems(listType);
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void changeText(ActionEvent event) {
		myLabel.setText(comboBox.getValue());
	}

}
