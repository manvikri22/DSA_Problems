package Arrays;
import java.util.*;
public class Histogram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }

        int maxans =0;
        int [] prevsmaller = prevs(arr);
        
        int [] nextsmaller = nexts(arr);
        for (int i = 0; i < arr.length; i++) {
            int cur = (nextsmaller[i] - prevsmaller[i] -1)*arr[i];
            maxans = Math.max(maxans, cur);
        }
        System.out.println("Maximum area: "+maxans);

        in.close();
    }
    static int[] prevs (int [] arr)
    {
        int []arr1 = new int[arr.length];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                arr1[i]=-1;
            }
            else{
                arr1[i]= s.peek();
            }
            
            s.push(i);
        }
       return arr1;
    }
    static int[] nexts(int[] arr)
    {
       Deque<Integer> s = new ArrayDeque<>();
       int[] arr2 = new int[arr.length];
       for (int i = arr.length-1; i >=0; i--) {
           while(!s.isEmpty() && arr[s.peek()]>=arr[i])
           {
               s.pop();
           }
           if(s.isEmpty())
           {
                arr2[i] = arr.length;
           }
           else{
               arr2[i] = s.peek(); 
           }
           
           s.push(i);
       }
       return arr2; 
    }
    
}
