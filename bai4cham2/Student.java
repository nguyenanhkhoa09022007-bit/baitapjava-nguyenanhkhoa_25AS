package bai4cham2;

public class Student extends Person {
    private String programe;
    private int year;
    private double fee;
    

public Student(String name, String address, String programe, int year, double fee){
        super(name,address);
        this.programe = programe;
        this.year = year;
        this.fee = fee;
    }
    public String getPrograme(){
        return programe;
    }
    public void setPrograme(String programe){
        this.programe = programe;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public String toString(){
        return "Student["+super.toString()+",programe="+programe+",year="+year+",fee="+fee+"]";
    }
}
