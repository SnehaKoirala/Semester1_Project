package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import models.Project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

  @FXML public BorderPane borderPane;
  @FXML public Button btnOngoing;
  @FXML public Button btnFinished;
  @FXML public Button btnReport;


  @Override public void initialize(URL url, ResourceBundle resourceBundle) {
    try {

      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ongoingPane.fxml"));
      Parent newContent = loader.load();
      borderPane.setCenter(newContent);

    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }


  @FXML
  public void finishedPressed(ActionEvent actionEvent) {
    try {

      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/finishedPane.fxml"));
      Parent newContent = loader.load();

      borderPane.setCenter(newContent);
      //FinishedController controller = loader.getController();

    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void ongoingPressed(ActionEvent actionEvent) {

    try {

      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ongoingPane.fxml"));
      Parent newContent = loader.load();

      OngoingController controller = loader.getController();

      borderPane.setCenter(newContent);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void reportPressed(ActionEvent actionEvent) {
    try {

      FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/reportPane.fxml"));
      Parent newContent = loader.load();

      ReportController controller = loader.getController();

      borderPane.setCenter(newContent);
    }
    catch (IOException e) {
      e.printStackTrace();
    }

  }

}
