package week16.jsonActivity;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try{
            Student student = new Student("Elijah Webb", 76528719,"Sophomore");

            Gson gson = new Gson();
            String jsonString = gson.toJson(student);

            FileWriter filewriter = new FileWriter("students.Json");
            filewriter.write(jsonString);
            filewriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
