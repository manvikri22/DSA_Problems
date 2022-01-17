package Stack;
import java.util.*;
public class Prev_SmallerElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
        System.err.println("Previous smaller elements of the array:");
        prevless(arr,n);
        
        in.close();
    }
    static void prevless(int []arr, int n)
    {
        Deque<Integer> s = new ArrayDeque<Integer>();
        for(int i =0; i<n;i++)
        {
            while(!s.isEmpty() && s.peek() >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                System.out.print(-1+" ");
            }
            else{
                System.out.print(s.peek()+" ");
            }
            s.push(arr[i]);
        }
    }
    
}
