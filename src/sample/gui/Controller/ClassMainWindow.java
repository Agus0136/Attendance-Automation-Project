package sample.gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import sample.dal.DatabaseConnection;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class ClassMainWindow implements Initializable {

    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void loginButtonOnAction (ActionEvent event) throws SQLException {

        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() == false) {
            validateLogin();
        } else {
            loginMessageLabel.setText("-Please enter Username and Password-");
        }
    }

    private void validateLogin() throws SQLException {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectionDB = connectNow.getConnection();

        String verifyLogin = "SELECT * FROM StudentLogin";

        try {
            Statement statement = connectionDB.createStatement();
            ResultSet queryResult = statement.executeQuery( verifyLogin );

            while (queryResult.next()) {
              if (queryResult.getInt( 2 ) == 2) {
                  loginMessageLabel.setText( "Login Successfully" );
              }else{
                  loginMessageLabel.setText( "Invalid Login.Please try again" );
              }
            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}


        













