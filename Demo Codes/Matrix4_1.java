import java.util.Scanner;
public class Matrix4_1{
    public static void main(String[] args) {
        //declare variables and classes to use in the program
        Scanner input = new Scanner(System.in);
        int nr, nc;
        char ans;
        //Input Data
        int[][] num = new int[3][3];
        // Input 9 elements
        System.out.println("Input  elements:");
        for (int r = 0; r < num.length; r++) {
            for (int c = 0; c < num.length; c++) {
                num[r][c] = input.nextInt();
            }
        }
        // Display Inputted Numbers and outputs required
        System.out.println("\nHere are the Numbers and the required outputs:");
        System.out.println("\t\t\t\t\t\tRow Sum\t\t\t Col Sum");
        int diagSum1 =0,diagSum2=0;
        for (int r = 0; r < num.length; r++)
        {
            int rowSum=0, colSum=0;
            for (int c = 0; c < num.length; c++)
            {
                System.out.printf("%5d", num[r][c]);
                rowSum = rowSum + num[r][c];
                colSum = colSum + num[c][r];
            }
            System.out.printf("%15d%15d", rowSum, colSum);
            System.out.println("\n");
            diagSum1 = diagSum1 + num[r][r];
            diagSum2 = diagSum2 + num[r][(2 - r)]; //or num.length
        }
        System.out.println("\n\nDiagonal Sum 1:"+ diagSum1);
        System.out.println("Diagonal Sum 2:"+ diagSum2);
    }
}
