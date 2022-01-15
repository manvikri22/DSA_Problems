package Arrays;

import java.util.*;
class Reverse_Array{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        reverse(arr,0,n-1);
        for(int i=0;i<n;i++ )
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }

    static void reverse(int[]arr, int s, int e)
    {
        int temp;

        if(s>=e)
        {
            return;
        }
        temp= arr[s];
        arr[s] = arr[e];
        arr[e]= temp;
        reverse(arr,s+1,e-1);
    }

}