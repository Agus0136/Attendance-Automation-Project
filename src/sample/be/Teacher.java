package sample.be;

public class Teacher {

    private int ID;
    private String Name;
    private String Email;
    private String Password;

    public Teacher(int ID, String Name, String Email, String Password){

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

    public void setName(String name){
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
