public class Student extends Person{

    int yearOfStudy;

    public String getPlata() {
        return plata;
    }

    public void setPlata(String plata) {
        this.plata = plata;
    }

    public String getBuget() {
        return buget;
    }

    public void setBuget(String buget) {
        this.buget = buget;
    }

    String plata="on buget money";
    String buget="on student money";

    public Student() {
        this.plata = plata;
        this.buget = buget;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}
