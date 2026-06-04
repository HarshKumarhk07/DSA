import java.util.*;
public class basic2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] Array = new int[rows][col];

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                Array[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(Array[i][j]==x){
                    System.out.print(i+" "+j);
                }
            }
        }


        //output
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(Array[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}
