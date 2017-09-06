package application;

import java.util.Iterator;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Main extends Application {
	CalculateNetSales calNetSales = new CalculateNetSales();
	CalculateSPMH calSPMH = new CalculateSPMH();
	CalculateLabor calLabor = new CalculateLabor();
	Iterator <String>iterator;
	LinkedList<String> name = new LinkedList<String>();
	LinkedList<Double> sales = new LinkedList<Double>();
	LinkedList<Double> spmh = new LinkedList<Double>();
	LinkedList<Double> labor = new LinkedList<Double>();
	String manager;
	int counter = 0;
	@Override

	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Nightly Figures");
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid, 600, 700);

			final Label label = new Label("Hourly Income");
			label.setFont(new Font("Arial", 20));
			grid.add(label, 1, 1);
			grid.setVgap(10);
			grid.setHgap(10);
			Label lblManager = new Label("Manager Name");
			grid.add(lblManager, 1, 2);
			TextField txtManager = new TextField();
			grid.add(txtManager, 2, 2);
			
			Label lblBreakfast = new Label("Breakfast 4am - 11am");
			grid.add(lblBreakfast, 1, 3);
			TextField txtBreakfast = new TextField();
			grid.add(txtBreakfast, 2, 3);

			Label lblLunch = new Label("Lunch 11am - 2pm");
			grid.add(lblLunch, 1, 4);
			TextField txtLunch = new TextField();
			grid.add(txtLunch, 2, 4);

			Label lblMidDay = new Label("Afternoon 2pm - 5pm");
			grid.add(lblMidDay, 1, 5);
			TextField txtMidDay = new TextField();
			grid.add(txtMidDay, 2, 5);

			Label lblDinner = new Label("Dinner 5pm - 8pm");
			grid.add(lblDinner, 1, 6);
			TextField txtDinner = new TextField();
			grid.add(txtDinner, 2, 6);

			Label lblNight = new Label("Night 8pm - Close/Overnight");
			grid.add(lblNight, 1, 7);
			TextField txtNight = new TextField();
			grid.add(txtNight, 2, 7);

			Label lblCrew = new Label("Crew Hours: ");
			grid.add(lblCrew, 1, 12);
			TextField txtCrew = new TextField();
			grid.add(txtCrew, 2, 12);
			Label lblCrewRate = new Label("Crew Rate: ");
			grid.add(lblCrewRate, 1, 13);
			TextField txtCrewRate = new TextField();
			grid.add(txtCrewRate, 2, 13);
			
			Label lblMan = new Label("Manager Hours: ");
			grid.add(lblMan, 1, 14);
			TextField txtMan = new TextField();
			grid.add(txtMan, 2, 14);

			Label lblManRate = new Label("Manager Rate: ");
			grid.add(lblManRate, 1, 15);
			TextField txtManRate = new TextField();
			grid.add(txtManRate, 2, 15);
			
			Label lblSearch = new Label("Search ");
			grid.add(lblSearch, 1, 25);
			TextField txtSearch = new TextField();
			grid.add(txtSearch, 2, 25);

			Button btnSubmit = new Button("Calculate");
			grid.add(btnSubmit, 2, 17);
			Button btnSearch = new Button("Search");
			grid.add(btnSearch, 2, 26);
			
			
			Label lblManagerName = new Label();
			grid.add(lblManagerName, 2, 19);
			Label lblNetSales = new Label();
			grid.add(lblNetSales, 2, 20);
			Label lblSPMH = new Label();
			grid.add(lblSPMH, 2, 21);
			Label lblLabor = new Label();
			grid.add(lblLabor, 2, 22);
			//calNetSales.LastYear = Double.parseDouble(txtLast.getText());
			
			btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					
					calNetSales.setBreakfast(Double.parseDouble(txtBreakfast.getText()));
					calNetSales.setLunch(Double.parseDouble(txtLunch.getText()));
					calNetSales.setMidDay(Double.parseDouble(txtMidDay.getText()));
					calNetSales.setDinner(Double.parseDouble(txtDinner.getText()));
					calNetSales.setNight(Double.parseDouble(txtNight.getText()));
					
					calLabor.setcHours(Double.parseDouble(txtCrew.getText()));
					calLabor.setcRate(Double.parseDouble(txtCrewRate.getText()));;
					calLabor.setmRate(Double.parseDouble(txtManRate.getText()));
					calLabor.setmHours(Double.parseDouble(txtMan.getText()));
					
					calSPMH.setCrewHours(Double.parseDouble(txtCrew.getText()));
					calSPMH.setManHours(Double.parseDouble(txtMan.getText()));
					String manager = txtManager.getText();
					
					calLabor.setNetSales(calNetSales.netSales);
					calSPMH.setNetSales(calNetSales.netSales);
					calLabor.setManagerName(txtManager.getText());
					
					name.add(calLabor.getManagerName());
					
					iterator = name.iterator();
					//calNetSales.setLastYear(Double.parseDouble(txtLast.getText()));
					Label lblReport = new Label("Final Figures");
					grid.add(lblReport, 2, 18);
					lblReport.setFont(new Font("Arial", 16));
					
					lblNetSales.setText(String.format("$%,6.2f", calNetSales.calculateNetSales()));
					lblNetSales.setText("NetSales:  " + (String.format("$%,6.2f", calNetSales.calculateNetSales())));
					sales.add( calNetSales.calculateNetSales());
					
					
					
					lblSPMH.setText(String.format("$%,6.2f", calSPMH.calSPHM()));
					lblSPMH.setText("Sales per Man Hour:  " + (String.format("$%,6.2f", calSPMH.calSPHM())));
					spmh.add(calSPMH.calSPHM());
					
					lblLabor.setText(String.format("$%,6.2f", calLabor.calLabor()));
					lblLabor.setText("Labor: "+ (String.format("$%,6.2f", calLabor.calLabor())));
					labor.add(calLabor.calLabor());
					
					lblManagerName.setText(""+manager);
					
						
				}}
			);
			
			btnSearch.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					
					lblNetSales.setText(String.format("$%,6.2f", calNetSales.calculateNetSales()));
					lblNetSales.setText("NetSales:  " + (String.format("$%,6.2f", calNetSales.calculateNetSales())));
					lblSPMH.setText(String.format("$%,6.2f", calSPMH.calSPHM()));
					lblSPMH.setText("Sales per Man Hour:  " + (String.format("$%,6.2f", calSPMH.calSPHM())));
					lblLabor.setText(String.format("$%,6.2f", calLabor.calLabor()));
					lblLabor.setText("Labor: "+ (String.format("$%,6.2f", calLabor.calLabor())));
					lblManagerName.setText(manager);
					iterator = name.iterator();
					while(iterator.hasNext()){
						
						if(iterator.next().compareToIgnoreCase(txtSearch.getText()) == 0)
						{
						//lblManagerName.setText(calLabor.getManagerName());	
						lblManagerName.setText(name.toString());
						lblNetSales.setText(""+sales);
						lblSPMH.setText(""+spmh);
						//labor.get(counter);
						lblLabor.setText(""+labor);
						
				}
						counter++;
				}
				}});
			
			 
			 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
