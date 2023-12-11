package weekSix.classActivity;

public class Nba {

    String name;
    String location;
    String starplayer;

    public Nba(String name,String location,String starplayer) {
        this.name = name;
        this.location = location;
        this.starplayer = starplayer;
    }
    void getNbaInfo(){
        System.out.printf("Name: %s%nLocation: %s%nStarPlayer:%s%n", name,location,starplayer);
    }






}
