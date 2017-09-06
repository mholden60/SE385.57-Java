package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			primaryStage.setTitle("Nightly Figures");
			GridPane grid = new GridPane();
			Scene scene = new Scene(grid, 750, 600);

			final Label label = new Label("Hourly Income");
			label.setFont(new Font("Arial", 20));
			grid.add(label, 3, 1);
// **************************HOURS***************************************
			Label lbl12am = new Label("12AM");
			grid.add(lbl12am, 1, 2);
			TextField txt12am = new TextField();
			grid.add(txt12am, 2, 2);

			Label lbl1am = new Label("1AM");
			grid.add(lbl1am, 1, 3);
			TextField txt1am = new TextField();
			grid.add(txt1am, 2, 3);

			Label lbl2am = new Label("2AM");
			grid.add(lbl2am, 1, 4);
			TextField txt2am = new TextField();
			grid.add(txt2am, 2, 4);

			Label lbl3am = new Label("3AM");
			grid.add(lbl3am, 1, 5);
			TextField txt3am = new TextField();
			grid.add(txt3am, 2, 5);

			Label lbl4am = new Label("4AM");
			grid.add(lbl4am, 1, 6);
			TextField txt4am = new TextField();
			grid.add(txt4am, 2, 6);

			Label lbl5am = new Label("5AM");
			grid.add(lbl5am, 1, 7);
			TextField txt5am = new TextField();
			grid.add(txt5am, 2, 7);

			Label lbl6am = new Label("6AM");
			grid.add(lbl6am, 1, 8);
			TextField txt6am = new TextField();
			grid.add(txt6am, 2, 8);

			Label lbl7am = new Label("7AM");
			grid.add(lbl7am, 1, 9);
			TextField txt7am = new TextField();
			grid.add(txt7am, 2, 9);

			Label lbl8am = new Label("8AM");
			grid.add(lbl8am, 1, 10);
			TextField txt8am = new TextField();
			grid.add(txt8am, 2, 10);

			Label lbl9am = new Label("9AM");
			grid.add(lbl9am, 1, 11);
			TextField txt9am = new TextField();
			grid.add(txt9am, 2, 11);

			Label lbl10am = new Label("10AM");
			grid.add(lbl10am, 1, 12);
			TextField txt10am = new TextField();
			grid.add(txt10am, 2, 12);

			Label lbl11 = new Label("11AM");
			grid.add(lbl11, 1, 13);
			TextField txt111am = new TextField();
			grid.add(txt111am, 2, 13);

			Label lbl12pm = new Label("12PM");
			grid.add(lbl12pm, 4, 2);
			TextField txt12pm = new TextField();
			grid.add(txt12pm, 5, 2);

			Label lbl1pm = new Label("1PM");
			grid.add(lbl1pm, 4, 3);
			TextField txt1pm = new TextField();
			grid.add(txt1pm, 5, 3);

			Label lbl2pm = new Label("2PM");
			grid.add(lbl2pm, 4, 4);
			TextField txt2pm = new TextField();
			grid.add(txt2pm, 5, 4);

			Label lbl3pm = new Label("3PM");
			grid.add(lbl3pm, 4, 5);
			TextField txt3pm = new TextField();
			grid.add(txt3pm, 5, 5);

			Label lbl4pm = new Label("4PM");
			grid.add(lbl4pm, 4, 6);
			TextField txt4pm = new TextField();
			grid.add(txt4pm, 5, 6);

			Label lbl5pm = new Label("5PM");
			grid.add(lbl5pm, 4, 7);
			TextField txt5pm = new TextField();
			grid.add(txt5pm, 5, 7);

			Label lbl6pm = new Label("6PM");
			grid.add(lbl6pm, 4, 8);
			TextField txt6pm = new TextField();
			grid.add(txt6pm, 5, 8);

			Label lbl7pm = new Label("7PM");
			grid.add(lbl7pm, 4, 9);
			TextField txt7pm = new TextField();
			grid.add(txt7pm, 5, 9);

			Label lbl8pm = new Label("8PM");
			grid.add(lbl8pm, 4, 10);
			TextField txt8pm = new TextField();
			grid.add(txt8pm, 5, 10);

			Label lbl9pm = new Label("9PM");
			grid.add(lbl9pm, 4, 11);
			TextField txt9pm = new TextField();
			grid.add(txt9pm, 5, 11);

			Label lbl10pm = new Label("10PM");
			grid.add(lbl10pm, 4, 12);
			TextField txt10pm = new TextField();
			grid.add(txt10pm, 5, 12);

			Label lbl11pm = new Label("11PM");
			grid.add(lbl11pm, 4, 13);
			TextField txt11pm = new TextField();
			grid.add(txt11pm, 5, 13);
// ************************************************************************

			Button btnSubmit = new Button("Calculate NetPay");
			grid.add(btnSubmit, 3, 19);

			Label lblnet = new Label("NetPay:");
			grid.add(lblnet, 2, 14);
			Label txtresults = new Label();
			grid.add(txtresults, 3, 14);

			Label lblcrew = new Label("Crew Hours");
			grid.add(lblcrew, 2, 15);
			TextField txtCrew = new TextField();
			grid.add(txtCrew, 3, 15);
			//
			ToggleGroup group = new ToggleGroup();
			RadioButton rdoY = new RadioButton("Y");
			rdoY.setToggleGroup(group);
			rdoY.setSelected(true);
			RadioButton rdoN = new RadioButton("N");
			rdoN.setToggleGroup(group);
			rdoN.setSelected(false);

			Label lblSalary = new Label("Salary Managaer Present ");
			grid.add(lblSalary, 2, 16);
			HBox hBox = new HBox();
			hBox.getChildren().add(rdoY);
			hBox.getChildren().add(rdoN);

			grid.add(hBox, 3, 16);

			Label lbllYear = new Label("Last Years NetSale");
			grid.add(lbllYear, 2, 17);
			TextField txtlYear = new TextField();
			grid.add(txtlYear, 3, 17);
			Label lblspm = new Label("");
			grid.add(lblspm, 2, 18);
			Label lblpercent = new Label("");
			grid.add(lblpercent, 2, 19);
			
		    
			btnSubmit.setOnAction(new EventHandler<ActionEvent>() {

				
				@Override
				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub

					double netPay = 0;
					int am12;
					int am1;
					int am2;
					int am3;
					int am4;
					int am5;
					int am6;
					int am7;
					int am8;
					int am9;
					int am10;
					int am11;
					int pm12;
					int pm1;
					int pm2;
					int pm3;
					int pm4;
					int pm5;
					int pm6;
					int pm7;
					int pm8;
					int pm9;
					int pm10;
					int pm11;
					int txtResults;
					float spm = 0;
					float crew;
					float percent = 0;
					float last = 0;
					if (txt1am.getText().equals("")) {
						txt1am.setText("0");
						;
					}
					if (txt2am.getText().equals("")) {
						txt2am.setText("0");
						;
					}
					if (txt3am.getText().equals("")) {
						txt3am.setText("0");
						;
					}
					if (txt4am.getText().equals("")) {
						txt4am.setText("0");
						;
					}
					if (txt5am.getText().equals("")) {
						txt5am.setText("0");
						;
					}
					if (txt6am.getText().equals("")) {
						txt6am.setText("0");
						;
					}
					if (txt7am.getText().equals("")) {
						txt7am.setText("0");
						;
					}
					if (txt8am.getText().equals("")) {
						txt8am.setText("0");
						;
					}
					if (txt9am.getText().equals("")) {
						txt9am.setText("0");
						;
					}
					if (txt10am.getText().equals("")) {
						txt10am.setText("0");
						;
					}
					if (txt111am.getText().equals("")) {
						txt111am.setText("0");
						;
					}
					if (txt12am.getText().equals("")) {
						txt12am.setText("0");
						;
					}
					if (txt1pm.getText().equals("")) {
						txt1pm.setText("0");
						;
					}
					if (txt2pm.getText().equals("")) {
						txt2pm.setText("0");
						;
					}
					if (txt3pm.getText().equals("")) {
						txt3pm.setText("0");
						;
					}
					if (txt4pm.getText().equals("")) {
						txt4pm.setText("0");
						;
					}
					if (txt5pm.getText().equals("")) {
						txt5pm.setText("0");
						;
					}
					if (txt6pm.getText().equals("")) {
						txt6pm.setText("0");
						;
					}
					if (txt7pm.getText().equals("")) {
						txt7pm.setText("0");
						;
					}
					if (txt8pm.getText().equals("")) {
						txt8pm.setText("0");
						;
					}
					if (txt9pm.getText().equals("")) {
						txt9pm.setText("0");
						;
					}
					if (txt10pm.getText().equals("")) {
						txt10pm.setText("0");
						;
					}
					if (txt11pm.getText().equals("")) {
						txt11pm.setText("0");
						;
					}
					if (txt12pm.getText().equals("")) {
						txt12pm.setText("0");
						;
					}

					crew = Integer.parseInt(txtCrew.getText());
					am12 = Integer.parseInt(txt12am.getText());
					am1 = Integer.parseInt(txt1am.getText());
					am2 = Integer.parseInt(txt2am.getText());
					am3 = Integer.parseInt(txt3am.getText());
					am4 = Integer.parseInt(txt4am.getText());
					am5 = Integer.parseInt(txt5am.getText());
					am6 = Integer.parseInt(txt6am.getText());
					am7 = Integer.parseInt(txt7am.getText());
					am8 = Integer.parseInt(txt8am.getText());
					am9 = Integer.parseInt(txt9am.getText());
					am10 = Integer.parseInt(txt10am.getText());
					am11 = Integer.parseInt(txt111am.getText());
					pm12 = Integer.parseInt(txt12pm.getText());
					pm1 = Integer.parseInt(txt1pm.getText());
					pm2 = Integer.parseInt(txt2pm.getText());
					pm3 = Integer.parseInt(txt3pm.getText());
					pm4 = Integer.parseInt(txt4pm.getText());
					pm5 = Integer.parseInt(txt5pm.getText());
					pm6 = Integer.parseInt(txt6pm.getText());
					pm7 = Integer.parseInt(txt7pm.getText());
					pm8 = Integer.parseInt(txt8pm.getText());
					pm9 = Integer.parseInt(txt9pm.getText());
					pm10 = Integer.parseInt(txt10pm.getText());
					pm11 = Integer.parseInt(txt11pm.getText());
					last = Integer.parseInt(txtlYear.getText());

					netPay = (am12 + am1 + am2 + am3 + am4 + am5 + am6 + am7 + am8 + am9 + am10 + am11 + pm12 + pm1
							+ pm2 + pm3 + pm4 + pm5 + pm6 + pm7 + pm8 + pm9 + pm10 + pm11);
				
					if (rdoY.isSelected()) {
						spm = (float) (netPay / (crew + 9));
					} else if (rdoN.isSelected()) {
						spm = (float) (netPay / crew);
					}
					float total;
					total = (float) (netPay + last);
					percent = (float) ((total / -netPay) / 100);

					txtresults.setText("" + netPay);
					lblspm.setText("The Sales Per Man Hour is: " + spm);
					lblpercent.setText("The percentage is" + percent);
					
				}

			});
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
