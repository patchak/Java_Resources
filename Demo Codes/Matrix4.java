import java.util.Scanner;
public class Matrix4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ans;
        //1. Declare and Create a 2d array
        int[][] num = new int[3][3];
        //2. Input 9 elements in the array using Scanner class
        System.out.println("Input  elements:");
        for (int r = 0; r < num.length; r++) {
            for (int c = 0; c < num[r].length; c++) {
                num[r][c] = input.nextInt();
            }
        }
            // Step 3 Display Inputted Numbers and outputs required
            System.out.println("\nHere are the Numbers and the required outputs:");
            System.out.println("\t\t\t\t\t\tRow Sum");
//            int diagSum1 =0,diagSum2=0;
        for (int r = 0; r < num.length; r++)
        {
            int rowSum=0;
            for (int c = 0; c < num[r].length; c++)
            {
                System.out.printf("%5d", num[r][c]);
                rowSum = rowSum + num[r][c];
            }
                System.out.printf("%10d", rowSum);
                System.out.println("\n");
        }
        // Step 4 Column Sum
        System.out.println("Column Sum..");
        for (int r = 0; r < num.length; r++)
        {   int colSum=0;
            for (int c = 0; c < num[r].length; c++)
            {
                colSum = colSum + num[c][r];
            }
            System.out.printf("%5d", colSum);
        }

        // Step 5 Diagonal Sum 1
        int diagSum1=0;
        for (int r = 0; r < num.length; r++)
        {
                diagSum1 = diagSum1 + num[r][r];
        }
        System.out.printf("%nDiagonal sum 1 is:%5d", diagSum1);


        // Step 5 Diagonal Sum 2
        int diagSum2=0;
        for (int r = 0; r < num.length; r++)
        {
                diagSum2 = diagSum2 + num[r][2-r];
        }
        System.out.printf("%nDiagonal Sum 2:%5d", diagSum2);
    }
}