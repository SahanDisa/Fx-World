package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;


public class MainController implements Initializable{

	MyNumber mynum = new MyNumber();
	
	
	@FXML
	public Label lblstatus;
	
	@FXML
	private ProgressBar proA;
	
	@FXML
	private ProgressIndicator proB;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mynum.setNumber(0);
		mynum.numberproperty().addListener(new ChangeListener<Object>() {
		
			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				lblstatus.setText(new Double(mynum.getNumber()).toString());
			}
			
		});
		proA.progressProperty().bind(mynum.numberproperty());
		proB.progressProperty().bind(mynum.numberproperty());
	}
	
	public void BtnClick(ActionEvent event) {
		mynum.setNumber(mynum.getNumber() + 0.1);
	}
	public void Btn2Click(ActionEvent event) {
		mynum.setNumber(mynum.getNumber() - 0.1);
	}
}
