package week10.Inheritance;

//Subclass
public class SeatCategory extends MoviesDemo {

    private String pricingInfo;

    public SeatCategory(String genre, String title, int runtime, int ticketPrice, String pricingInfo){
        super(genre,title,runtime,ticketPrice);
        this.pricingInfo = pricingInfo;
    }

    public String getPricingInfo(){
        return pricingInfo;
    }

    public void setPricingInfo(String pricingInfo){
        this.pricingInfo = pricingInfo;
    }

    @Override
    public String toString(){
      return String.format("Genre: %sTitle: %sRunTime: %sTicketPirce: %sPricingInfo: %s",getGenre(),getTitle(),getRuntime(),getTicketPrice(),getPricingInfo());

    }

}
