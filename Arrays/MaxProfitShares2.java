package Arrays;
import java.util.*;
public class MaxProfitShares2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Max profit" + maxtwobuysell(arr,n));   
        in.close();
    }

    static int maxtwobuysell(int[]arr, int n)
    {
        int first_buy = Integer.MIN_VALUE;
        int first_sell =0;
        int second_buy = Integer.MIN_VALUE;
        int second_sell =0;

        for(int i =0;i<n;i++)
        {
            first_buy = Math.max(first_buy,first_sell-arr[i]);
            first_sell = Math.max(first_sell, first_buy+arr[i] );
            second_buy = Math.max(second_buy,first_sell-arr[i]);
            second_sell = Math.max(second_sell,second_buy+arr[i]);
        }
        return second_sell;
    }
}
