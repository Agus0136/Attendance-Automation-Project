package sample.gui.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.be.Students;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassAttRegController implements Initializable {

    @FXML
    private TableView<Students> tableView;
    @FXML
    private TableColumn<Students, String> studentNameColumn;
    @FXML
    private javafx.scene.control.ChoiceBox<Integer> ChoiceBox;
    @FXML
    private TableColumn<Students, CheckBox> Mon;
    @FXML
    private TableColumn<Students, CheckBox> Tue;
    @FXML
    private TableColumn<Students, CheckBox> Wed;
    @FXML
    private TableColumn<Students, CheckBox> Thu;
    @FXML
    private TableColumn<Students, CheckBox> Fri;
    @FXML
    private TableColumn<Students, ComboBox> Present;
    @FXML
    private TableColumn<Students, ComboBox> Absent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        studentNameColumn.setCellValueFactory( new PropertyValueFactory<Students, String>( "studentName" ) );

        tableView.setItems( getStudent() );

        ChoiceBox.setItems( numberOfWeekList );

        Mon.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Mon" ) );

        Tue.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Tue" ) );

        Wed.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Wed" ) );

        Thu.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Thu" ) );

        Fri.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Fri" ) );

        Present.setCellValueFactory( new PropertyValueFactory<Students, ComboBox>( "Present" ) );

        Absent.setCellValueFactory( new PropertyValueFactory<Students, ComboBox>( "Absent" ) );
    }

    public ObservableList<Students> getStudent() {
        ObservableList<Students> student = FXCollections.observableArrayList();
        student.add( new Students( "Adam Zapel", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Charity Case", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Don Key", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Earl Bird", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Hazel Nutt", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Jack Pott", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Jo King", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Matt Tress", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Mike Stand", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Mona Lott", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Ray Gunn", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Orson Carte", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Sonny Day", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Warren Peace", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        student.add( new Students( "Mac Laren", "", FXCollections.observableArrayList( "Yes", "No" ) ) );
        return student;
    }

    public ObservableList<Integer> numberOfWeekList = FXCollections.observableArrayList( 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 );
    }

