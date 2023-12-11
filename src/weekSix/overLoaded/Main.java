package weekSix.overLoaded;

public class Main {
    public static void main(String[] args) {

        Grades student1 = new Grades();
        Grades student2 = new Grades("Rob");
        Grades student3 = new Grades("Elijah", 88, 83, 97);

        System.out.printf("grade total: %d\n", student1.totalScore());
        System.out.printf(student2.getStudent() +" grade total: %d\n", student2.totalScore());
        System.out.printf(student3.getStudent()+ " grade total: %d\n", student3.totalScore());

    }
}
