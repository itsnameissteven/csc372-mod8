package student_roll;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.swing.Action;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application  { 
  MenuItem save;
  MenuButton menuButton;
  Button submitButton;
  HBox hbox;
  Pane pane;
  GridPane gridPane;
  BorderPane borderPane;
  Label studentNameLabel, studentAddressLabel, studentGPALabel;
  TextField studentNameText, studentAddressText, studentGPAText;
  Scene scene;

  @Override
  public void start(Stage primaryStage) throws Exception {
    borderPane = new BorderPane();
    gridPane = new GridPane();
    gridPane.setGridLinesVisible(true);
    gridPane.setAlignment(Pos.TOP_CENTER); 
    gridPane.setPadding(new Insets(20));
    gridPane.setStyle("-fx-border-color: black;");
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    // Menu Button
    save = new MenuItem("Save");
    menuButton = new MenuButton("Menu", null, save);
    hbox = new HBox(menuButton);
    hbox.setPadding(new Insets(15, 12, 15, 12));
    hbox.setSpacing(10);
    hbox.setStyle("-fx-background-color: #336699;");
    borderPane.setTop(hbox);

    // labels
    studentNameLabel = new Label("Student Name: ");
    studentNameText = new TextField("");
    gridPane.add(studentNameLabel, 0, 0);
    gridPane.add(studentNameText, 1, 0);
    studentAddressLabel = new Label("Student address: ");
    studentAddressText = new TextField("");
    gridPane.add(studentAddressLabel, 0, 1);
    gridPane.add(studentAddressText, 1, 1);
    studentGPALabel = new Label("Student GPA: ");
    studentGPAText = new TextField("");
    gridPane.add(studentGPALabel, 0, 2);
    gridPane.add(studentGPAText, 1, 2);
    
    // Button 
    submitButton = new Button("Add Student");
    gridPane.add(submitButton, 0, 3, 2, 1);
    GridPane.setHalignment(submitButton, HPos.CENTER);

    submitButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        primaryStage.close();
      }
    });
    
    borderPane.setCenter(gridPane);
    scene = new Scene(borderPane, 500, 300);

    primaryStage.setTitle("User Interface");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}