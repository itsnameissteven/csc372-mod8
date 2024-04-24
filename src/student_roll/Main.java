package student_roll;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Main extends Application  { 
  MenuItem save,
  MenuButton menuButton;
  HBox hbox;
  Pane pane;
  BorderPane borderPane;
  Scene scene;

  @Override
  public void start(Stage primaryStage) throws Exception {
    borderPane = new BorderPane();

    // Menu Button
    save = new MenuItem("Save");
    menuButton = new MenuButton("Menu", null, save);
    hbox.setPAdding(new Insets(15, 12, 15, 12));
    hbox.setSpacing(10);
    hbox.setStyle("-fx-background-color: #336699;");
    borderPane.setTop(hbox);

    scene = new Scene(borderPane, 500, 300);

    primaryStage.setTitle("User Interface");
    // primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}