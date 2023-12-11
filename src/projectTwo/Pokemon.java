package projectTwo;

public class Pokemon {
    private String name;
    private int lvl;

    public Pokemon(String name, int lvl){
        this.name = name;
        this.lvl = lvl;
    }

    public String getName(){
        return name;
    }

    public int getLvl(){
        return lvl;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLvl(int lvl){
        this.lvl = lvl;
    }

    public void lvlUp(){
        lvl++;
    }

    @Override
    public String toString(){
        return "Pokemon:name=" + name + ",level=" + lvl;
    }
}
