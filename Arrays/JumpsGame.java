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
        int newjump =0;
        int i=0;
        int count =0;
        
        for(i=0;i<arr.length-1;i++)
        {
            if(i+arr[i]>jump)
            {
                jump= i+arr[i];
            }
            if(i==newjump)
            {
                count++;
                newjump = jump;
            }
            if(arr[i]==0 && i==jump) return -1;
        }
        
        return count;
    }
}

