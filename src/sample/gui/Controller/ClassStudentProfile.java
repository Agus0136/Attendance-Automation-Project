package sample.gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClassStudentProfile implements Initializable {

    public Hyperlink btnLogOut;

    public  ClassStudentProfile(){

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public void Logout(ActionEvent actionEvent) throws IOException {

        Stage currentStage = (Stage) btnLogOut.getScene().getWindow();

        Stage loginStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/Sample/gui/View/MainWindow.fxml"));
        loginStage.setScene(new Scene(root));
        loginStage.show();
        currentStage.close();

    }
}
