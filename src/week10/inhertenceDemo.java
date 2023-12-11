package week10;

public class inhertenceDemo {
    public class MoviesDemo {

        //Instance Variables
        //Attributes
        private String genre;
        private String title;
        private int runtime;
        private int ticketPrice;
        //Keep Track of how many instances of the class there are
        public static int instanceCount = 0;

        //Default Constructor
        public MoviesDemo() {
        }

        //Overload the Constructor
        public MoviesDemo(String genre, String title, int runtime, int ticketPrice) {
            this.genre = genre;
            this.title = title;
            this.runtime = runtime;
            this.ticketPrice = ticketPrice;

            //Increment static variable
            instanceCount++;
        }

        //Setters
        //Genre title runtime ticketprice
        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        //Getters
        public String getGenre() {
            return genre;
        }

        public String getTitle() {
            return title;
        }

        public int getRuntime() {
            return runtime;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }


        @Override
        public String toString(){
            return String.format("Moive Genre: %s Title %s: Runtime %s: ticketPrice %s:", genre, title, runtime, ticketPrice);
        }

    }

}
