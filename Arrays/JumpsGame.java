package Arrays;
import java.util.*;
public class JumpsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Minimum number of jump :"+count(arr));    
        in.close();
    }
    static int count(int[]arr)
    {
        int jump =0;
        int reach =0;
        for(int i=0;i<arr.length;i++)
        {
            if(reach<i)
            {
                return -1;
            }
            reach = Math.max(reach,i+arr[i]);
        }


        return reach;
    }
}
