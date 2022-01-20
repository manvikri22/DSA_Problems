package Maths;
import java.util.*;
public class MinimiseHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        System.out.println("Enter k: ");
        int k = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Minimum of maximum difference between height: "+mindiff(arr,n,k));
        in.close();
    }
    static int mindiff(int[]arr, int n , int k)
    {
        Arrays.sort(arr);
        int diff = arr[n-1]- arr[0];
        int largest = arr[n-1]-k;
        int smallest = arr[0]+k;
        int mi , ma;
        for (int i = 0; i < arr.length-1; i++) {
            mi = Math.min(smallest, arr[i+1]-k);
            ma = Math.max(largest, arr[i]+k);
            if(mi<0) continue;
            diff = Math.min(diff,ma-mi);
        }
        return diff;
    }
}
