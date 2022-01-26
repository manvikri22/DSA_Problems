package Arrays;
import java.util.*;
public class FindElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        System.out.println("Enter k: ");
        int k = in.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++ )
        {
            arr[i] = in.nextInt();
        }
            find(arr,n,k);
        in.close();
    }
    public static void find(int a[], int n, int k)
    {
        int x = n / k;

        HashMap<Integer, Integer> y = new HashMap<>();
      
        for (int i = 0; i < n; i++)
        {
           
            if (!y.containsKey(a[i]))
                y.put(a[i], 1);
           
           
            else
            {
                int count = y.get(a[i]);
                y.put(a[i], count + 1);
            }
        }
 
        for (Map.Entry m : y.entrySet())
        {
            Integer temp = (Integer)m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }
    
    
}
