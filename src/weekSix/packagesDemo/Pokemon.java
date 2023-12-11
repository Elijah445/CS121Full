package weekSix.packagesDemo;

public class Pokemon {

     String name;
     String hp;
    private String type;
    private String move;
    private String damage;

    public Pokemon(String name, String hp, String type, String move, String damage)
    {
        this.name = name;
        this.hp = hp;
        this.type = type;
        this.move = move;
        this.damage = damage;
    }

    //Public Method
    public void useMove()
    {
        System.out.println(name + " used " + move + "\n");
    }

    //Default Method
    void info()
    {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Type: " + type);
        System.out.println("Move: " + move);
        System.out.println("Damage: " + damage);
    }

    //Parent Method
    protected void evolve()
    {
        System.out.println(name + " evolved and is now a " + type + " type\n");
    }

    //Private Method
    private void heal(){
        int currentHp = Integer.parseInt(hp);
        currentHp++;
        hp = Integer.toString(currentHp);
        System.out.println(name + " health went up to " + hp);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public String getMove() {
        return move;
    }

    public String getDamage() {
        return damage;
    }




}
