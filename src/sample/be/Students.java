package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

public class Students {

    private int ID;
    private String Name;
    private String Email;
    private String Password;

    public Students(int ID, String Name, String Email, String Password) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;

    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return ID;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setEmail(String Email){
        this.Email = Email;
    }

    public String getEmail(){
        return Email;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public String getPassword(){
        return Password;
    }
}