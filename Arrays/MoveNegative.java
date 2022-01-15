package Arrays;

import java.util.*;

class MoveNegative{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        move(arr,0,n-1);
        for(int i=0;i<n;i++ )
        {
            System.out.print(arr[i]+" ");
        }
        in.close();
    }

    static void move(int[]arr, int l, int r)
    {

        while(l<=r)
        {
            if(arr[l]<0 && arr[r]<0)
            {
                l++;
            }
            else if(arr[l]>0 && arr[r]<0)
            {
                int temp = arr[l];
                arr[l]=arr[r];
                arr[r] =temp;
                l++;
                r--;
            }
            else if(arr[l]>0 && arr[r]>0)
            {
                r--;
            }
            else{

                l++;
                r--;
            }
        }
    }

}