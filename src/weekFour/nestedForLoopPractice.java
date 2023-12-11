package weekFour;

public class nestedForLoopPractice {
    public static void main(String[] args) {
        //for(int i = 0; i < 4; i++){
            //System.out.println("This is i : " + i + "\n");
            //for(int j = 0; j <0; i++){
                //System.out.println("----- This is j : ");
           // }
            //System.out.println();
        //}
        //2DArray
            int[][] matrix= {
                    {11,23,33},
                    {45,54,65},
                    {78,87,97}
            };
        for(int i = 0; i<matrix.length; i++){
            System.out.println("This is i "+ i + "\n");
            for(int j = 0; j <matrix[i].length;j++){
                System.out.println("      This is j "+ j);
                System.out.println(matrix[i][j] + " ");
            }
        }
        int n = 7;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < i; i++){
                System.out.println("-");
                break;
            }
        }



    }
}
