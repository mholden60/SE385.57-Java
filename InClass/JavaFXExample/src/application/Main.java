package application;
	

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Candy Bar Exercise");
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid,400,400);
			
			Label lblWeight = new Label("Weight In Pounds:");
			grid.add(lblWeight, 1, 1);
			
			TextField txtWeight = new TextField();
			grid.add(txtWeight, 2, 1);
			
			Label lblHeight = new Label("Height In Inches:");
			grid.add(lblHeight, 1, 3);
			
			TextField txtHeight = new TextField();
			grid.add(txtHeight, 2, 3);
			
			Label lblAge = new Label("Age In Years");
			grid.add(lblAge, 1, 4);
			
			TextField txtAge = new TextField();
			grid.add(txtAge, 2, 4);
			
			ToggleGroup group = new ToggleGroup();
			RadioButton rdoMale = new RadioButton("M");
			rdoMale.setToggleGroup(group);
			rdoMale.setSelected(true);
			RadioButton rdoFemale = new RadioButton("F");
			rdoFemale.setToggleGroup(group);
			rdoFemale.setSelected(false);
			
			Label lblSex = new Label("Sex: ");
			grid.add(lblSex, 1, 5);
			HBox hBox = new HBox();
			hBox.getChildren().add(rdoMale);
			hBox.getChildren().add(rdoFemale);
			grid.add(hBox, 2, 5);
			
			Label lblActivty = new Label("Activity Level: ");
			grid.add(lblActivty, 1, 6);
			ChoiceBox cbActivity = new ChoiceBox(FXCollections.observableArrayList("Sedentary", "Somewhat active", "Active","Highly active" ));
			cbActivity.getSelectionModel().selectFirst();
			grid.add(cbActivity, 2, 6);
			
			Button btnSubmit = new Button("Calculate Calories");
			
			grid.add(btnSubmit, 2, 7);
			Label lblCalorie = new Label("Number Of Chocolate Bars");
			grid.add(lblCalorie, 1, 8);
			Label lblResults = new Label("");
			grid.add(lblResults, 1, 9);
			btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
				
				
			    @Override
			    public void handle(ActionEvent e) {
			    	
			    	int age;
					int weight;
					int height;
					String maleOrFemale = null;
					String activity = "";
					double calories = 0;
					weight = Integer.parseInt(txtWeight.getText());
					height = Integer.parseInt(txtHeight.getText());
					age  = Integer.parseInt(txtAge.getText());
					activity = cbActivity.getValue().toString();
					
					String sex="";  // Variable for sex so we only need one output
								    // statement after the IF statements
					if (rdoMale.isSelected())
					{
						maleOrFemale = "Male";
						calories = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
					}
					else if (rdoFemale.isSelected())
					{
						maleOrFemale = "Female";
						
						calories = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
					}
					else
					{
						System.out.println("Invalid entry for sex.");
						return;
					}
					// Adjust calories based on activity level
					if (activity.equals("Sedentary"))
						calories *= 1.2;
					else if (activity.equals("Somewhat active"))
						calories *= 1.3;
					else if (activity.equals("Active"))
						calories *= 1.4;
					else if (activity.equals("Highly active"))
						calories *= 1.4;
					lblResults.setText("A "+ maleOrFemale + " with an activty level of "+activity +" needs to eat "+ (calories / 230) +" to maintain the weight" );
			    }
			});
			
		
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
