package sample.be;
import javafx.beans.property.SimpleStringProperty;

public class Students {
    private SimpleStringProperty studentName;

    public Students(String studentName) {
        this.studentName = new SimpleStringProperty(studentName);
    }

    public String getStudentName() {
        return studentName.get();
    }

    public void setStudentName(String studentName) {
        this.studentName.set( studentName );
    }
}