package week10.Inheritance;

//Subclass
public class TheaterMovie extends MoviesDemo{

    private String description;

    public TheaterMovie(String genre, String title, int runtime, int ticketPrice, String description){
        super(genre,title,runtime,ticketPrice);
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return String.format("Genre: %sTitle: %sRunTime: %sTicketPirce: %sDescription: %s",getGenre(),getTitle(),getRuntime(),getTicketPrice(),getDescription());

    }

}
