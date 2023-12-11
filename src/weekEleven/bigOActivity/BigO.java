package weekEleven.bigOActivity;

public class BigO {
    public static void printOnce(int num){
        System.out.println(num);
    }

    public static void printNTimes(int n, String phrase){
        for(int i = 0; i < n; i++){
            System.out.println(phrase);
        }
    }

    public static void printNSquaredTimes(int n, String phrase2){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(phrase2);
            }
        }
    }
}
