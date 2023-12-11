package week10.abstractClasses;

import week10.interfaces.Interactable;

//Subclass
public class Staff extends User implements Interactable {

    private String hourlyPay;
    private String position;

    public Staff(){}

    public Staff(String email, String password, String firstName, String lastName, String hourlyPay, String position){
        super(email,password,firstName,lastName);
        this.hourlyPay =  hourlyPay;
        this.position = position;
    }
    @Override
    public void displayInfo(){
        System.out.println(String.format("**************Staff Information**************\nHourly Pay:%s%nPosition:%s%n**************User Information**************\nEmail:%s%nPassword:%s%nFirst Name:%s%nLast Name:%s%n",hourlyPay,position,email,password,firstName,lastName));
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
