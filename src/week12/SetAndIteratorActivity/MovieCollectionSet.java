package week12.SetAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MovieCollectionSet {
    Set<String> movies = new HashSet<>();

    public void addMovies(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of a movie or enter 0 to quit");

        while(true){
            String movieName = scanner.nextLine();
            if(movieName.equals("0")){
                break;
            }
            movies.add(movieName);
        }
    }

    public void displayMovies(){
        Iterator<String> iter = movies.iterator();

        while(iter.hasNext()){
            String movies = iter.next();
            System.out.println(movies);
        }
    }
}
