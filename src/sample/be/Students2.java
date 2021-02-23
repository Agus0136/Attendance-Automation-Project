package sample.be;

import javafx.beans.property.SimpleStringProperty;

public class Students2 {

    private SimpleStringProperty  studentList;
    private SimpleStringProperty  jan;
    private SimpleStringProperty  feb;
    private SimpleStringProperty  mar;
    private SimpleStringProperty  apr;
    private SimpleStringProperty  may;
    private SimpleStringProperty  jun;
    private SimpleStringProperty  jul;
    private SimpleStringProperty  aug;
    private SimpleStringProperty  sep;
    private SimpleStringProperty  oct;
    private SimpleStringProperty  nov;
    private SimpleStringProperty  dec;
    private SimpleStringProperty  totalStudentAssistance;

    public Students2(String studentList, String jan , String feb, String mar, String apr, String may, String jun, String jul, String aug, String sep, String oct, String nov, String dec, String totalStudentAssistance) {
        this.studentList = new SimpleStringProperty( studentList );
        this.jan = new SimpleStringProperty( jan );
        this.feb = new SimpleStringProperty( feb );
        this.mar = new SimpleStringProperty( mar );
        this.apr = new SimpleStringProperty( apr );
        this.may = new SimpleStringProperty( may );
        this.jun = new SimpleStringProperty( jun );
        this.jul = new SimpleStringProperty( jul );
        this.aug = new SimpleStringProperty( aug );
        this.sep = new SimpleStringProperty( sep );
        this.oct = new SimpleStringProperty( oct);
        this.nov = new SimpleStringProperty( nov );
        this.dec = new SimpleStringProperty( dec );
        this.totalStudentAssistance = new SimpleStringProperty( totalStudentAssistance );
    }

    public String getStudentList() { return studentList.get(); }

    public void setStudentList(String studentList) { this.studentList.set( studentList ); }

    public String getJan() {return jan.get();}

    public void setJan(String jan) { this.jan.set( jan ); }

    public String getFeb() {return feb.get();}

    public void setFeb(String feb) { this.feb.set( feb ); }

    public String getMar() {return mar.get();}

    public void setMar(String mar) { this.mar.set( mar ); }

    public String getApr() {return apr.get();}

    public void setApr(String apr) { this.apr.set( apr ); }

    public String getMay() {return may.get(); }

    public void setMay(String may) { this.may.set( may ); }

    public String getJun() {return jun.get(); }

    public void setJun(String may) { this.jun.set( may ); }

    public String getJul() {return jul.get(); }

    public void setJul(String jul) { this.jul.set( jul ); }

    public String getAug() {return aug.get(); }

    public void setAug(String aug) { this.aug.set( aug ); }

    public String getSep() {return sep.get(); }

    public void setSep(String sep) { this.sep.set( sep ); }

    public String getOct() {return oct.get(); }

    public void setOct(String oct) { this.oct.set( oct ); }

    public String getNov() {return nov.get(); }

    public void setNov(String nov) { this.nov.set( nov ); }

    public String getDec() {return dec.get(); }

    public void setDec(String dec) { this.dec.set( dec ); }

    public String getTotalStudentAssistance() { return totalStudentAssistance.get(); }

    public void setTotalStudentAssistance(String totalStudentAssistance) { this.totalStudentAssistance.set ( totalStudentAssistance ); }
}