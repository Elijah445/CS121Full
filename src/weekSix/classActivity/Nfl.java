package weekSix.classActivity;

public class Nfl {

    String name;
    String location;
    String starplayer;

    public Nfl(String name,String location,String starplayer){
        this.name = name;
        this.location = location;
        this.starplayer = starplayer;
    }
    void getNflInfo(){
        System.out.printf("Name: %s%nLocation: %s%nStarPlayer:%s%n", name,location,starplayer);
    }



}
