import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.stage.StageStyle;


import java.util.Objects;

public class MyApplication extends Application {
  double x, y = 0;


  @Override
  public void init() throws Exception {

  }

  @Override public void start(Stage stage) throws Exception {

    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("fxml/main.fxml")));
    Scene sc = new Scene(root);
    //stage.initStyle(StageStyle.UNDECORATED);

    root.setOnMousePressed(mouseEvent -> {
      x = mouseEvent.getSceneX();
      y = mouseEvent.getSceneY();
    });
    root.setOnMouseDragEntered(mouseEvent -> {
      stage.setX(mouseEvent.getScreenX() - x);
      stage.setY(mouseEvent.getScreenY() - y);
    });

    stage.setScene(sc);
    stage.show();
  }

}