package week16.jsonActivity;

public class Student {
    private String name;
    private int id;
    private String gradeYear;

    public Student(String name, int id, String gradeYear){
        this.name = name;
        this.id = id;
        this.gradeYear = gradeYear;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getGradeYear(){
        return gradeYear;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setGradeYear(String gradeYear){
        this.gradeYear = gradeYear;
    }


}
