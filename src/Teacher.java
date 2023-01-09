public class Teacher extends Person {

    String[] listOfCourses ={"Math", "Info", "Biologi", "some Corse"};
    String obtCours;

    public String[] getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses() {
        this.listOfCourses = listOfCourses;
    }

    public String getObtCours() {
        return obtCours;
    }

    public void setObtCours(String obtCours) {
        this.obtCours = obtCours;
    }
    public String listOfCourses(){
        for(int i=0;i<= listOfCourses.length;){
            return listOfCourses[i];
        }

        return null;
    }
}

