package Stack;
import java.util.*;
public class Next_SmallerElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.err.println("Next smaller elements of the array:");
        int ans [] = new int[n];
        nextless(arr,n,ans);
        
        for (int i =0;i<n;i++) {
            System.out.print(ans[i]+" ");
        }

        in.close();
    }
    static void nextless(int [] arr,int n, int [] ans)
    {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i =n-1;i>=0;i--)
        {
            while(!s.isEmpty()&& s.peek()>=arr[i])
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
