package week10.abstractClasses;
//Superclass
public abstract class User {

    protected String email;
    protected String password;
    protected String firstName;
    protected String lastName;

    public User(){}

    public User(String email, String password, String firstName, String lastName){
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void displayInfo();


    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }




}
