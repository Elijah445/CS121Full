package week12;

import java.util.HashSet;
import java.util.Set;

public class SetNotes2 {
    private static Set<String> movies = new HashSet<>();

    public static void main(String[] args) {
        addMovies();
    }

    public static void addMovies() {
        movies.add("Spiderman");
        movies.add("The Batman");
        movies.add("Avengers");
        movies.add("Spiderman");
        System.out.println(movies);
    }
}
