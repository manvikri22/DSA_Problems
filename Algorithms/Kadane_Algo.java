package Algorithms;
import java.util.*;
public class Kadane_Algo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }  
        System.out.println("Maximum sum of a contiguous subarray is : "+check(arr,n)) ;
        
        in.close();
    }
    static int check(int[]arr, int n)
    {
        int s =0;
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            s=+arr[i];
            ans = Math.max(ans,s);
            if(s<0) s=0;
        }
        return ans;
    }
    
}
