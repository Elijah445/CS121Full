package week13.linkedListActivity;

import java.util.LinkedList;

public class UserBooking {
    private String userName;
    private String movieTitle;
    private int runTime;
    private String genre;
    private String description;
    private String theaters;
    LinkedList<String> theaterList = new LinkedList<>();

    public UserBooking(String userName, String movieTitle, int runTime, String genre, String description, String theaters){
        this.userName = userName;
        this.movieTitle = movieTitle;
        this.runTime = runTime;
        this.genre = genre;
        this.description = description;
        this.theaters = theaters;
    }

    public void addTheater(String theater){
        theaterList.add(theater);
    }

    public void removeTheater(String theater){
        theaterList.remove(theater);
    }

    public String getUserInfo(){
        return("UserInfo\n" + "Username: " +userName+ "\nMovie Title: " +movieTitle+ "\nRun Time: " +runTime+ "\nGenre: " +genre+ "\nDescription: "+description+ "\nTheaters: " +theaters);
    }

    public void displayUserBooking(){
        for(String theaters: theaterList){
            System.out.println(theaters);
        }
    }

    public void displayUserBooking2() {
        for(String theaters: theaterList){
            System.out.println(theaters);
        }
    }
}
