import java.util.Scanner;

public class ThreeDim {
    public static void main(String[] args) {
        int threeDim[][][] ={
                            {{10,20},
                             {30,40}},
                            {{50,60}, {70,80}}
                            };
//        for(int l= 0; l<threeDim.length;l++)
//        {
//            System.out.println("Layers..." + l);
//            for(int r=0;r<threeDim[l].length; r++)
//            {
//                for(int c=0; c<threeDim[r].length; c++)
//                {
//                    System.out.println("threeDim["+l+"]["+r+"]["+c+"]:" + threeDim[l][r][c]);
//                    System.out.printf("");
//                }
//            }
//        }
        int layer = 0;
        Scanner in = new Scanner(System.in);
        for(int l1= 0; l1<threeDim.length;l1++)
        {
            System.out.println("Layers["+l1+"]");
            layer =  in.nextInt();
            for(int r1=0;r1<threeDim[l1].length; r1++)
            {
                for(int c1=0; c1<threeDim[r1].length; c1++)
                {
                    System.out.print("Elements["+r1+"]["+c1+"]:");
                    threeDim[l1][r1][c1]=in.nextInt();
//                    System.out.println("threeDim["+l1+"]["+r+"]["+c+"]:" + threeDim[l][r][c]);
//                    System.out.printf("");
                }
            }
        }



    }
}
