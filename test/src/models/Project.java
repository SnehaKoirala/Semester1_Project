package models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Project {

  SimpleStringProperty id, title, date, type;

  public Project(String id, String title,
      String date, String type) {
    this.id = new SimpleStringProperty(id);
    this.title = new SimpleStringProperty(title);
    this.date = new SimpleStringProperty(date);
    this.type = new SimpleStringProperty(type);
  }

  public String getId() {
    return id.get();
  }

  public void setId(String id) {
    this.id.set(id);
  }

  public String getTitle() {
    return title.get();
  }

  public void setTitle(String title) {
    this.title.set(title);
  }

  public String getDate() {
    return date.get();
  }

  public void setDate(String date) {
    this.date.set(date);
  }

  public String getType() {
    return type.get();
  }

  public void setType(String type) {
    this.type.set(type);
  }
}
