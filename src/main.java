
public class main {

    public static void main(String[] args) {
        Dan();
        Ana();
    }





    static Student student = new Student();
    static Teacher teacher= new Teacher();
    static Books books= new Books();
    static ElectronicBook elB= new ElectronicBook();
    static PaperBooks papB= new PaperBooks();
    private static void Ana(){
        student.setName("Ana");
        student.setId(12);
        student.setYearOfStudy(3);
        student.setPlata("On city buget");
        teacher.setListOfCourses();
        teacher.setObtCours("French");
        books.setAuthorNames();
<<<<<<< HEAD
        elB.setKindle("ASLDA");
        papB.setNrInv(221);

        System.out.println("name: "+ student.name +", ID: "+ student.id + ", Year of study: "+
                student.yearOfStudy + ", Way of payment: "+ student.getPlata() + ", Courses: " + teacher.listOfCourses[1]+
                " Obtional Cours: "+ teacher.obtCours+ " Books: "+ books.authorNames[1]+ ", Kindle: " +elB.kindle
                + ", Paper Inventar: " + papB.nrInv);
=======
        elB.setKindle();
        papB.setNrInv(221);

        System.out.println("name: "+ student.getName() +", ID: "+ student.getId() + ", Year of study: "+
                student.getYearOfStudy() + ", Way of payment: "+ student.getPlata() + ", Courses: " + teacher.getListOfCourses()[1]+
                " Obtional Cours: "+ teacher.getObtCours()+ " Books: "+ books.getAuthorNames()[1]+ ", Kindle: " +elB.getKindle()[1]
                + ", Paper Inventar: " + papB.getNrInv());
>>>>>>> 71c7c42 (Initial commit)
    }

    private static void Dan(){
        student.setName("Dan");
        student.setId(1231);
        student.setYearOfStudy(4);
        student.setPlata("On student buget");
        teacher.setListOfCourses();
        teacher.setObtCours("Fizics");
        books.setAuthorNames();
<<<<<<< HEAD
        elB.setKindle("WWQWW");


        System.out.println("name: "+ student.name +", ID: "+ student.id + ", Year of study: "+
                student.yearOfStudy + ", Way of payment: "+ student.getPlata() + ", Courses: " + teacher.listOfCourses[3]+
                ", Obtional Cours: "+ teacher.obtCours+ ", Books: "+ books.authorNames[0]+ ", Kindle: " +elB.kindle
=======
        elB.setKindle();


        System.out.println("name: "+ student.getName() +", ID: "+ student.getId() + ", Year of study: "+
                student.getYearOfStudy() + ", Way of payment: "+ student.getPlata() + ", Courses: " + teacher.getListOfCourses()[3]+
                ", Obtional Cours: "+ teacher.getObtCours()+ ", Books: "+ books.getAuthorNames()[2]+ ", Kindle: " +elB.getKindle()[2]
>>>>>>> 71c7c42 (Initial commit)
                );


    }


}
