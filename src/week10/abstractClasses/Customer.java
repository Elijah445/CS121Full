package week10.abstractClasses;

import week10.interfaces.Interactable;

//Subclass
public class Customer extends User implements Interactable {

    private int Bookings;
    private int loyaltyPoints;

    public Customer(){}

    public Customer(String email, String password, String firstName, String lastName, int Bookings, int loyaltyPoints){
        super(email,password,firstName,lastName);
        this.Bookings = Bookings;
        this.loyaltyPoints = loyaltyPoints;
    }
    @Override
    public void displayInfo(){
        System.out.println(String.format("**************Customer Information**************\nBookings:%s%nLoyalty Points:%s%n**************User Information**************\nEmail:%s%nPassword:%s%nFirst Name:%s%nLast Name:%s%n",Bookings,loyaltyPoints,email,password,firstName,lastName));
    }

    @Override
    public void createAcc(){
        System.out.println("You have successfully created an account! An email is being sent to you for verification.");
    }
    @Override
    public void login(){
        System.out.println("Login successful!");
    }
    @Override
    public void browseMovies(){
        System.out.println("Take a look at some movies!");
    }
    @Override
    public void bookMovie(){
        System.out.println("You have just booked a movie!");
    }
    @Override
    public void reportIssue(String message){
        System.out.println("Message:"+ message );
    }

}
