package Arrays;
import java.util.*;

class longestConsSubsequence{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Count of Longest Consecutive subsequence: "+ subsequencecount(arr,n));
            
        in.close();
    }
    static int subsequencecount(int[] arr, int n)
    {
        HashSet<Integer> h = new HashSet<>();
        int count = 0;
        int maxcount = -1;
        for (int i = 0; i < n; i++) {
            h.add(i);
        }

        for (int i = 0;i<n;i++) {
            
            if(h.contains(i+1))
            {
                count++;
            }
            else{

                maxcount = Math.max(count,maxcount );
                count = 1;
            }
        }
        return maxcount;
    }
}