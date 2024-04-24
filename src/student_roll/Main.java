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
  @Override
  public void start(Stage primaryStage) throws Exception {

    primaryStage.setTitle("User Interface");
    // primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}