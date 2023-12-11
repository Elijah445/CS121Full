package weekThree;

public class conditionals {
    public static void main(String[] args) {

        /*
        * Conditional Statements:
        *   - if statements
        *   - else-if statements
        *   - else statements
        *   - switch statements
        *  */

        int age;
        double gpa;
        char letterGrade;
        boolean csMajor, isStudent;
        String name;

        age = 25;
        gpa = 1.5;
        letterGrade = 'A';
        isStudent = true;
        csMajor = true;
        name = "Elijah";

        /* if(age <=21){
            System.out.println("You are 21 or younger.\n");
        }else{
            System.out.println("You are older than 21. \n");
        }

        if(gpa >=4.0) {
            System.out.println("You recieve an A");
        }else if(gpa >=3.6) {
            System.out.println("You recieve an A -------");
        }else if(gpa >=2.7){
            System.out.println("You recieve an B");
        }
        else if(gpa >=1.7){
            System.out.println("You recieve a C");
        }else{
            System.out.print("You recieve below a C");
        } */
        //Relational operator
        // <, >, <=, >=, ==, !=
        //.equals() --> for Strings
        if(csMajor == isStudent){
            System.out.println("This person is a student and a cs Major");
        }else{
            System.out.println("One of the vlaues for the student or cs major is false. ");
        }
        String name2 = "elijah";
        if(!name.equals(name2)){
            System.out.printf("The name %s is not equal to name2 %s",name,name2);
        }else{
            System.out.println("The names are equal");
        }





        /* if(conditon) {
            //executes the code if the condition is ture.
        }

        // else statement
        if(condition) {
            //executes the code if the condition is ture.
        }else{
            //executes the code if the condition is false.
        }

        //if-else-if statements
        if(condition1){
            //executes the code if condition 1 is true.
        }else if(condition2){
            //executes the code if condition 2 is true.
        }
        else if(condtion3){
            //executes the code if condition 3 is true.
        }
        else{
            //execute code if the above conditions are not met.
        }
         */
    }
}
