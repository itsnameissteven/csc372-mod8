package student_roll;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application  { 
  MenuItem save, exit;
  MenuButton menuButton;
  Button submitButton;
  HBox hbox;
  Pane pane;
  GridPane gridPane;
  BorderPane borderPane;
  Label nameLabel, addressLabel, GPALabel, studentsListLabel;
  TextField nameText, addressText, GPAText;
  Scene scene;
  StudentList students;
  TextArea studentsList;

  @Override
  public void start(Stage primaryStage) throws Exception {
    students = new StudentList();
    borderPane = new BorderPane();
    gridPane = new GridPane();
    gridPane.setAlignment(Pos.TOP_CENTER); 
    gridPane.setPadding(new Insets(20));
    gridPane.setStyle("-fx-border-color: black;");
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    // Menu Button
    save = new MenuItem("Save");
    exit = new MenuItem("Exit");
    menuButton = new MenuButton("Menu", null, save, exit);
    hbox = new HBox(menuButton);
    hbox.setPadding(new Insets(10, 12, 10, 12));
    hbox.setSpacing(10);
    hbox.setStyle("-fx-background-color: #336699;");
    borderPane.setTop(hbox);

    // labels
    nameLabel = new Label("Student Name: ");
    nameText = new TextField("");
    gridPane.add(nameLabel, 0, 0);
    gridPane.add(nameText, 1, 0);
    addressLabel = new Label("Student address: ");
    addressText = new TextField("");
    gridPane.add(addressLabel, 0, 1);
    gridPane.add(addressText, 1, 1);
    GPALabel = new Label("Student GPA: ");
    GPAText = new TextField("");
    gridPane.add(GPALabel, 0, 2);
    gridPane.add(GPAText, 1, 2);
    
    // Button 
    submitButton = new Button("Add Student");
    gridPane.add(submitButton, 0, 3, 2, 1);
    GridPane.setHalignment(submitButton, HPos.CENTER);

    // List
    studentsListLabel = new Label("Students");
    gridPane.add(studentsListLabel, 0, 4);
    studentsList = new TextArea();
    studentsList.setEditable(false);
    gridPane.add(studentsList, 0, 5, 2, 1);

    submitButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        try {
          students.add(nameText.getText(), addressText.getText(), Double.parseDouble(GPAText.getText()));
          nameText.setText("");
          addressText.setText("");
          GPAText.setText("");
          studentsList.setText(students.toString());
        } catch (Exception e) {
          Alert alert = new Alert(AlertType.ERROR, e.getMessage());
          alert.showAndWait();
        }
      }
    });

    save.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        try {
          String fileName = "students.txt";
          FileOutputStream fileStream = new FileOutputStream(fileName);
          PrintWriter outFS = new PrintWriter(fileStream);
          outFS.print(students.toString());
          outFS.close();
          Alert alert =  new Alert(AlertType.CONFIRMATION, "File saved");
          alert.show();
        } catch (Exception e) {
          Alert errorAlert = new Alert(AlertType.ERROR, e.getMessage());
          errorAlert.showAndWait();
        }
      }
    });

    exit.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        primaryStage.close();
      }
    });
    
    borderPane.setCenter(gridPane);
    scene = new Scene(borderPane, 500, 400);

    primaryStage.setTitle("User Interface");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}