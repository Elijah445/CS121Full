package week13.linkedListActivity;

public class UserBookMain {
    public static void main(String[] args) {
        UserBooking userBooking1 = new UserBooking("GameDawg","Scream",111,"Horror","GhostFace Strikes","5");

        UserBooking userBooking2 = new UserBooking("User7625","Spider-man 2",127,"Action","Spiderman is back at it!","3");

        userBooking1.addTheater("Theater 10");
        userBooking1.addTheater("Theater 12");
        userBooking1.addTheater("Theater 8");
        userBooking1.addTheater("Theater 5");
        userBooking1.addTheater("Theater 1\n");

        System.out.println(userBooking1.getUserInfo());

        userBooking1.displayUserBooking();

        userBooking1.removeTheater("Theater 8");
        System.out.println("\nUpdated List");
        userBooking1.displayUserBooking();

        userBooking2.addTheater("Theater 15");
        userBooking2.addTheater("Theater 16");
        userBooking2.addTheater("Theater 17");

        System.out.println(userBooking2.getUserInfo());

        userBooking2.displayUserBooking();

        userBooking2.removeTheater("Theater 17");
        System.out.println("\nUpdated List");
        userBooking2.displayUserBooking2();
    }
}
