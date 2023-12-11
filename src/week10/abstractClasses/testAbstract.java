package week10.abstractClasses;

public class testAbstract {
    public static void main(String[] args) {
        Customer Rob = new Customer("RobIsCool@gmail.com", "Pa$$w0rd", "Robert", "William", 1, 1000);
        Rob.displayInfo();
        Rob.createAcc();
        Rob.login();
        Rob.browseMovies();
        Rob.bookMovie();

        Staff Brady = new Staff("Brady101@gmail.com", "bchdchd@15161", "Brady", "Young", "$20","Manager");
        Brady.displayInfo();
        Brady.login();
        Brady.reportIssue("There is a mess in Theater 12");
    }
}
