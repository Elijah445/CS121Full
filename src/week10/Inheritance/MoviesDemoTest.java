package week10.Inheritance;

public class MoviesDemoTest {
    public static void main(String[] args) {
        MoviesDemo Movie1 = new MoviesDemo("Horror","Scream",140,25);
        TheaterMovie Movie2 = new  TheaterMovie("Horror","Scream",140,25,"A scary slasher that came out in the 90s");
        SeatCategory Movie3 = new SeatCategory("Horror","Scream",140,25,"Your total will be: $25");

        System.out.println(Movie1.getGenre());
        System.out.println(Movie1.getTitle());
        System.out.println("Runtime:"+ Movie1.getRuntime());
        System.out.println("Cost:$"+ Movie1.getTicketPrice());
        System.out.println(Movie2.getDescription());
        System.out.println(Movie3.getPricingInfo());

    }
}
