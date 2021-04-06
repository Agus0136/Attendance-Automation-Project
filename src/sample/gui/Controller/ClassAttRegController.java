package sample.gui.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import sample.be.Students;
import sample.be.Students2;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassAttRegController implements Initializable {

    @FXML
    private TableView<Students> tableView;
    @FXML
    private TableView<Students2> tableView2;
    @FXML
    private TableColumn<Students, String> studentNameColumn;
    @FXML
    private TableColumn<Students2, String> studentListColumn;
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
    @FXML
    private TableColumn<Students2, String> jan;
    @FXML
    private TableColumn<Students2, String> feb;
    @FXML
    private TableColumn<Students2, String> mar;
    @FXML
    private TableColumn<Students2, String> apr;
    @FXML
    private TableColumn<Students2, String> may;
    @FXML
    private TableColumn<Students2, String> jun;
    @FXML
    private TableColumn<Students2, String> jul;
    @FXML
    private TableColumn<Students2, String> aug;
    @FXML
    private TableColumn<Students2, String> sep;
    @FXML
    private TableColumn<Students2, String> oct;
    @FXML
    private TableColumn<Students2, String> nov;
    @FXML
    private TableColumn<Students2, String> dec;
    @FXML
    private TableColumn<Students2, String> totalStudentAssistance;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        studentNameColumn.setCellValueFactory( new PropertyValueFactory<Students, String>( "studentName" ) );

        studentListColumn.setCellValueFactory( new PropertyValueFactory<Students2, String>("studentList"  ) );

        tableView.setItems( getStudent() );

        tableView2.setItems( getStudent2() );

        ChoiceBox.setItems( numberOfWeekList );

        Mon.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Mon" ) );

        Tue.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Tue" ) );

        Wed.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Wed" ) );

        Thu.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Thu" ) );

        Fri.setCellValueFactory( new PropertyValueFactory<Students, CheckBox>( "Fri" ) );

        Present.setCellValueFactory( new PropertyValueFactory<Students, ComboBox>( "Present" ) );

        Absent.setCellValueFactory( new PropertyValueFactory<Students, ComboBox>( "Absent" ) );

        jan.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Jan" ) );

        feb.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Feb" ) );

        mar.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Mar" ) );

        apr.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Apr" ) );

        may.setCellValueFactory( new PropertyValueFactory<Students2, String>( "May" ) );

        jun.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Jun" ) );

        jul.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Jul" ) );

        aug.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Aug" ) );

        sep.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Sep" ) );

        oct.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Oct" ) );

        nov.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Nov" ) );

        dec.setCellValueFactory( new PropertyValueFactory<Students2, String>( "Dec" ) );

        totalStudentAssistance.setCellValueFactory( new PropertyValueFactory<Students2, String>( "TotalStudentAssistance" ) );

    }

    public ObservableList<Students> getStudent() {
        ObservableList<Students> student = FXCollections.observableArrayList();
        student.add( new Students( 1, "Ivan", "ivan@easv.dk", "123")  );

        return student;
    }

    public ObservableList<Integer> numberOfWeekList = FXCollections.observableArrayList( 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52 );

    public ObservableList<Students2> getStudent2() {
        ObservableList<Students2> student2 = FXCollections.observableArrayList();
        student2.add( new Students2( "Adam Zapel", "10%","-","-","-","-", "-", "-", "-", "-", "-", "-", "-", "0.10%"));
        student2.add( new Students2( "Charity Case","20%","-","-","-","-", "-", "-", "-", "-", "-", "-", "-","0.20%"));
        student2.add( new Students2( "Don Key","30%","-","-","-","-","-", "-", "-", "-", "-", "-", "-", "0.30%"));
        student2.add( new Students2( "Earl Bird","40%","-","-","-","-", "-", "-", "-", "-", "-", "-", "-","0.40%"));
        student2.add( new Students2( "Hazel Nutt","50%","-","-","-","-","-", "-", "-", "-", "-", "-", "-", "0.50%"));
        student2.add( new Students2( "Jack Pott","60%", "-","-","-","-","-","-", "-", "-", "-", "-", "-", "0.60%"));
        student2.add( new Students2( "Jo King","70%","-","-","-","-", "-", "-", "-", "-", "-","-", "-", "0.70%"));
        student2.add( new Students2( "Matt Tress","80%","-", "-","-", "-", "-", "-", "-", "-", "-","-", "-", "0.80%"));
        student2.add( new Students2( "Mike Stand","90%","-","-","-","-", "-", "-", "-", "-", "-","-", "-", "0.90%"));
        student2.add( new Students2( "Mona Lott","100%","-","-","-","-", "-", "-", "-", "-", "-", "-", "-", "0.100%"));
        student2.add( new Students2( "Ray Gunn","100%","-","-","-","-", "-", "-", "-", "-", "-","-", "-", "0.100%"));
        student2.add( new Students2( "Orson Carte","100%","-","-","-","-", "-", "-", "-", "-", "-","-", "-", "0.100%"));
        student2.add( new Students2( "Sonny Day","100%","-","-","-","", "-", "-", "-", "-", "-","-", "-", "0.100%"));
        student2.add( new Students2( "Warren Peace","100%","-","-","-","-", "-", "-", "-", "-", "-","-", "-", "0.100%"));
        student2.add( new Students2( "Mac Laren","100%","-","-","-", "-", "-","-","-","-","-","-", "-","0.100%"));
        return student2;
    }
}



