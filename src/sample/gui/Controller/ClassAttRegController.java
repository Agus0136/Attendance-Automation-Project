package sample.gui.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.be.Students;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassAttRegController implements Initializable {

    @FXML
    private TableView<Students> tableView1;
    @FXML
    private TableColumn<Students, String> studentNameColumn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        studentNameColumn.setCellValueFactory( new PropertyValueFactory<Students, String>("studentName"));

        tableView1.setItems( getStudent() );
    }

    public ObservableList<Students> getStudent() {
        ObservableList<Students> student = FXCollections.observableArrayList();
        student.add( new Students("Agustin Graciano"));
        return student;
    }
}



