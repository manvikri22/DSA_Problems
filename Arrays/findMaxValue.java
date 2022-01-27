package Arrays;
import java.util.*;
public class findMaxValue {
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
        System.out.println("Max value: " +max(arr,n));   
        in.close();
    }
    static int max(int[][]arr, int n)
    {
        int maxvalue = Integer.MIN_VALUE;
        int maxarr[][] = new int[n][n];

        maxarr[n-1][n-1] = arr[n-1][n-1];

        int maxv = arr[n-1][n-1];
        for (int i = n-2; i >=0; i--) {
            if(arr[n-1][i] > maxv)
            {
                maxv = arr[n-1][i];
            }
            maxarr[n-1][i] = maxv;
        }

        maxv = arr[n-1][n-1];
        for(int j =n-2;j>=0;j--)
        {
            if(arr[j][n-1]>maxv)
            {
                maxv = arr[j][n-1];
            }
            maxarr[j][n-1] = maxv;
        }

        for(int i =n-2;i>=0;i--)
        {
            for(int j =n-2;j>=0;j--)
            {
                if(maxarr[i+1][j+1]- arr[i][j] >maxvalue)
                {
                    maxvalue = maxarr[i+1][j+1]- arr[i][j];
                }
                maxarr[i][j] = Math.max(arr[i][j],Math.max(maxarr[i][j+1],maxarr[i+1][j]));
            }
        }
        return maxvalue;

    }
}
