package Arrays;
import java.util.*;
public class ComElements2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        int r = in.nextInt();
        int c = in.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++ )
        {
            for(int j =0;j<c;j++)
            {
                arr[i][j] = in.nextInt();
            }
            
        }
        print(arr,r,c);   
        in.close();
        
    }
    static void print(int[][]arr , int r , int c)
    {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int j=0;j<c;j++)
        {
            mp.put(arr[0][j], 1);

        }
        for(int i =1;i<r;i++)
        {
            for(int j =0;i<c;j++)
            {
                if (mp.get(arr[i][j]) != null && mp.get(arr[i][j]) == i)
                {
                    mp.put(arr[i][j], i+1);
                    
                    if(i == r-1)
                    {
                        System.out.print(arr[i][j]+ " ");
                    }
                }

            }
        }

    }
}
