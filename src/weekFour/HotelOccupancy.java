package weekFour;

import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int floors;
        int totalRooms = 0;
        int totalOcc= 0;
        int totalVac;
        double occupancyRate;

        System.out.println("How many floors does the hotel have");
        floors = Integer.parseInt(keyboard.nextLine());

        for(int i = 1 ; i <=floors ; i++){
            System.out.printf("Enter the number of rooms on floor %d%n", i);
            int rooms = Integer.parseInt(keyboard.nextLine());
            System.out.println("How many rooms are occupied?");
            int occupiedRooms = Integer.parseInt(keyboard.nextLine());

            totalRooms = totalRooms + rooms;
            totalOcc = totalOcc + occupiedRooms;
        }
        totalVac = totalRooms - totalOcc;
        occupancyRate = (double)totalOcc/totalRooms;
        System.out.printf("Floors: %d%nRooms: %d%nOccupied Rooms: %d%nVacant Rooms: %d%nOccupancy Rate: %.2f(%d%%)",floors,totalRooms,totalOcc,totalVac,occupancyRate, (int)(occupancyRate * 100));



    }
}
