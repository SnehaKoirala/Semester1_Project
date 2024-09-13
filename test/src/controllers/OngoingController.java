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
import javafx.stage.Stage;
import models.Project;
import controllers.MainController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OngoingController implements Initializable {

  @FXML private TableView<Project> tbProjects;
  @FXML private TableColumn<Project, String> tcId;
  @FXML private TableColumn<Project, String> tcTitle;
  @FXML private TableColumn<Project, String> tcDate;
  @FXML private TableColumn<Project, String> tcType;

  @FXML private ComboBox<String> comboBox;
  private ObservableList<String> options;


  @FXML private Button btnAddNew;
  private ObservableList<Project> dataOngoing;

  @Override public void initialize(URL url, ResourceBundle resourceBundle) {

    tcId.setCellValueFactory(new PropertyValueFactory<>("Id"));
    tcTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
    tcDate.setCellValueFactory(new PropertyValueFactory<>("Date"));
    tcType.setCellValueFactory(new PropertyValueFactory<>("Type"));
    dataOngoing = FXCollections.observableArrayList(
        new Project("1", "Havn", "1-1-2020", "industrial"),
        new Project("2", "FactoryX", "3-12-2021", "industrial"),
        new Project("3", "TechPark", "5-8-2019", "commercial"),
        new Project("4", "GreenHomes", "7-3-2022", "residential"),
        new Project("5", "CityExpressway", "9-20-2023", "road"),
        new Project("6", "SteelWorks", "4-18-2020", "industrial"),
        new Project("7", "RetailHub", "6-25-2021", "commercial"),
        new Project("8", "CozyHaven", "8-14-2018", "residential"),
        new Project("9", "HighwayXpress", "10-1-2022", "road"),
        new Project("10", "AutoTechPark", "12-5-2019", "industrial"),
        new Project("11", "MegaMall", "2-22-2023", "commercial"),
        new Project("12", "EcoLiving", "4-7-2021", "residential"),
        new Project("13", "UrbanExpress", "6-30-2022", "road"),
        new Project("14", "TechAssembly", "8-19-2020", "industrial"),
        new Project("15", "CityMall", "10-12-2021", "commercial"),
        new Project("16", "SkyViewResidences", "12-28-2019", "residential"),
        new Project("17", "RuralRoadways", "2-15-2023", "road"),
        new Project("18", "AutoForge", "4-2-2018", "industrial"),
        new Project("19", "MegaTechPlaza", "6-9-2020", "commercial"),
        new Project("20", "GreenVistaHomes", "8-26-2022", "residential")
    );

    tbProjects.setItems(dataOngoing);

    options = FXCollections.observableArrayList("Residential", "Commercial", "Industrial", "Road");
    comboBox.setItems(options);

  }

  @FXML
  public void addNewPressed(ActionEvent actionEvent) {
    try {
      Parent parent = FXMLLoader.load(getClass().getResource("/fxml/residential.fxml"));
      Stage stage = new Stage();
      Scene scene = new Scene(parent);
      stage.setScene(scene);
      stage.show();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
