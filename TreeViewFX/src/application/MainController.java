package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable {

	
	@FXML
	public TreeView<String> treeview;
	
	Image icon = new Image(
			getClass().getResourceAsStream("/img/icons8_folder_50px.png"));

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		root.setExpanded(true);
		
		TreeItem<String> fileA = new TreeItem<>("File_A", new ImageView(icon));
		TreeItem<String> fileB = new TreeItem<>("File_B", new ImageView(icon));
		TreeItem<String> fileC = new TreeItem<>("File_C", new ImageView(icon));
		
		root.getChildren().addAll(fileA,fileB,fileC);
		fileA.getChildren().addAll(fileB,fileC);
		
		treeview.setRoot(root);
	}

}
