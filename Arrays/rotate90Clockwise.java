package Arrays;
import java.util.*;
public class rotate90Clockwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++ )
        {
            for(int j =0;j<n;j++)
            arr[i][j] = in.nextInt();
        }
        rotate(arr,n);
        in.close();
    }
     static void rotate(int[][] arr, int n)
     {
         for(int i =0;i<n;i++)
         {
             for(int j =n-1;j>=0;j--)
             {
                 System.out.print(arr[j][i]+" ");
             }
             System.out.println();
         }
     }
        
}
