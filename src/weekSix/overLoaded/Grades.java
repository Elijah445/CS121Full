package weekSix.overLoaded;

public class Grades {
    private String student;
    private int hw;
    private int lab;
    private int test;

    public Grades(){
    }

    public Grades(String stuName)
    {
        this.student = stuName;
    }

    public Grades(String stuName, int stuHw, int stuLab, int stuTest)
    {
        this.student = stuName;
        this.hw = stuHw;
        this.lab = stuLab;
        this.test = stuTest;
    }

    //Getters
    public String getStudent()
    {
        return student;
    }
    public int getHw()
    {
        return hw;
    }
    public int getLab()
    {
        return lab;
    }
    public int getTest()
    {
        return test;
    }

    //Setters
    public void setStudent(String student)
    {
        this.student = student;
    }
    public void setHw(int hw)
    {
        this.hw = hw;
    }
    public void setLab(int lab)
    {
        this.lab = lab;
    }
    public void setTest(int test)
    {
        this.test = test;
    }

    public int totalScore(){
        return hw+lab+test;
    }

}
