package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;

public class ChartController {
	
	@FXML PieChart pe;
	
	public void showGraph(ActionEvent event) {
		ObservableList<Data> list = FXCollections.observableArrayList(
				new PieChart.Data("Java",50),
				new PieChart.Data("C++",0),
				new PieChart.Data("C",80),
				new PieChart.Data("Web Dev",80),
				new PieChart.Data("Python",20));
		pe.setData(list);
	}
	
	
}
