package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {

	@FXML
	WebView webview;
	
	private WebEngine engine;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webview.getEngine();
		
	}
	
	
	public void btn1(ActionEvent event) {
		engine.load("https://www.google.com");
	}
	public void btn2(ActionEvent event) {
		engine.executeScript("window.location = \"https://findmecreation.wordpress.com//\";");
	}
	public void btn3(ActionEvent event) {
		engine.loadContent("/web/Assignment.html");
	}
	public void btn4(ActionEvent event) {
		engine.reload();
		//engine.getHistory();
	}
	
	
	
}
