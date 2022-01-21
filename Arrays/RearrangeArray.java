package Arrays;
import java.util.*;
public class RearrangeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        rearrange(arr,n);
        for(int i=0;i<n;i++ )
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    static void rearrange(int[]arr,int n)
    {
        int i=0, j=n-1;
        while(i<j){     //shift all negative values to the end
            while(i <= n-1 && arr[i]>0)
            {
                i++;
            }
            while(j>=0 && arr[j]<0)
            {
                j--;
            }
            if(i<j)
            {
                swap(arr,i,j);
            }
        }
        if(i==0||i==n) return; //i has index of leftmost negative element
        int k =0;
        while(k<n && i<n) // rearrange in alternative position
        {
            swap(arr,k,i);
            i=i+1;
            k=k+2;
        }
    }
    static void swap(int[] arr, int a, int b)
    {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
