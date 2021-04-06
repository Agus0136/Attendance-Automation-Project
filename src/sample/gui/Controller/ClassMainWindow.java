package sample.gui.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.be.Students;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClassMainWindow implements Initializable {


    public TextField emailText;
    public TextField passText;
    public Button btnLogin;

    public ClassMainWindow(){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void Login(ActionEvent actionEvent) throws IOException{

        //if(EmailPassword()){

            Stage currentStage = (Stage) btnLogin.getScene().getWindow();

            Stage studentStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/Sample/gui/View/StudentProfile.fxml"));
            studentStage.setTitle("Attendance Menu");
            studentStage.setScene(new Scene(root));
            studentStage.show();
            currentStage.close();
        //}


    }

    public boolean EmailPassword(){

        Students students = new Students(1,"ivan","ivan@easv.dk","123");


        if (students.getEmail() == emailText.getText() && (students.getPassword() == passText.getText())) {
            return true;
        }

        return false;
    }


}


