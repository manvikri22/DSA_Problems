package Stack;
import java.util.*;
public class Next_GreaterElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = sc.nextInt();
        }
        System.err.println("Next greater elements of the array:");
        int ans[] = new int[n];
        nextmore(arr, n, ans);

        for(int i = 0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }

        sc.close();
    }
    static void nextmore(int [] arr, int n, int[] ans )
    {
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = n-1; i >= 0; i--) {
            while(!s.isEmpty() && s.peek()<=arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                ans[i]=-1;
            }
            else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
        }

    }


    
}
