package Arrays;

import java.util.*;

public class FindDuplicates1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println("The Duplicate no. is: "+check(arr,n)) ;
        
        in.close();
    }

    static int check(int[] arr, int n)
    {
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++)
        {
            if((arr[i]^arr[i+1])==0) 
            return arr[i];
        }
        return -1;
    }


    
}
