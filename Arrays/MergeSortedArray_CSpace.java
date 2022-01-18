package Arrays;
import java.util.*;

public class MergeSortedArray_CSpace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt();
        int m =in.nextInt();
        int arr1[] = new int[n];
        int arr2[] =new int[m];
        System.out.print("First Array: ");
        for(int i=0;i<n;i++ )
        {
            arr1[i] = in.nextInt();
        }
        System.out.print ("Second Array: ");
        for(int i=0;i<m;i++ )
        {
            arr2[i] = in.nextInt();
        }

        System.out.println(" The sorted arrays are: ") ;
        sort(arr1,arr2);
        System.out.print("First Array: ");
        for(int i=0;i<n;i++ )
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("Second Array: ");
        for(int i=0;i<m;i++ )
        {
            System.out.print(arr2[i]+" ");
        }
        in.close();
    }
    static void sort(int[]arr1, int[]arr2)
    {
        int a = 0;
        int b = 0;
        int temp =0;
        while(a<arr1.length)
        {
            if(arr1[a]>arr2[b])
            {
                temp = arr1[a];
                arr1[a] = arr2[b];
                arr2[b]=temp;
                Arrays.sort(arr2);
                a++;
                
            }
            else{
                a++;
            }
        }
        
    }
}
