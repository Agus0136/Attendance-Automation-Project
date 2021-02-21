package sample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;

public class Students {

    private SimpleStringProperty studentName;
    private CheckBox Mon;
    private CheckBox Tue;
    private CheckBox Wed;
    private CheckBox Thu;
    private CheckBox Fri;
    private ComboBox Present;
    private ComboBox Absent;

    public Students(String studentName, String values, ObservableList data) {
        this.studentName = new SimpleStringProperty( studentName );
        this.Mon = new CheckBox();
        this.Tue = new CheckBox();
        this.Wed = new CheckBox();
        this.Thu = new CheckBox();
        this.Fri = new CheckBox();
        this.Present = new ComboBox( data );
        this.Absent = new ComboBox( data );
    }

    public Students(String studentName) {
        this.studentName = new SimpleStringProperty( studentName );
    }

    public String getStudentName() {
        return studentName.get();
    }

    public void setStudentName(String studentName) {
        this.studentName.set( studentName );
    }

    public CheckBox getMon() {
        return Mon;
    }

    public void setMon(CheckBox mon) {
        this.Mon = mon;
    }

    public CheckBox getTue() {
        return Tue;
    }

    public void setTue(CheckBox tue) {
        this.Tue = tue;
    }

    public CheckBox getWed() {
        return Wed;
    }

    public void setWed(CheckBox wed) {
        this.Wed = wed;
    }

    public CheckBox getThu() {
        return Thu;
    }

    public void setThu(CheckBox thu) {
        this.Thu = thu;
    }

    public CheckBox getFri() {
        return Fri;
    }

    public void setFri(CheckBox fri) {
        this.Fri = fri;
    }

    public ComboBox getPresent() {
        return Present;
    }

    public void setPresent(ComboBox present) {
        this.Present = present;
    }

    public ComboBox getAbsent() {
        return Absent;
    }

    public void setAbsent(ComboBox absent) {
        this.Absent = absent;
    }
}