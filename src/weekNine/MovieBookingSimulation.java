package weekNine;

public class MovieBookingSimulation {
    public static void main(String[] args) {


        int [][] theater = new int [5][10];
        theater[1][3] = 1;
        theater[1][4]= 1;
        theater[4][3]= 1;
        theater[3][6]=1;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(theater[i][j]+ " ");
            }
            System.out.println();
        }
        String [][] movie = {
                {"Scream", "2D", "30", "$15"},
                {"Batman", "3D", "50", "$25"},
                {"Avengers", "2D", "45", "$20"}
        };
        System.out.println();
        System.out.println("Available Movies");
        String [] formats = {"%-20s", "%-10s","%-10s","%-10s"};
        System.out.printf("%-18s %-8s %-11s %-20s\n","Movie","Type","Seats","Price");

        for(String[] movies: movie){
            int index = 0;
            for(String details: movies){
                System.out.printf(formats[index],details);
                index++;
            }
            System.out.println();

        }


    }
}
