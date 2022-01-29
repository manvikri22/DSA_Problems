package Arrays;
import java.util.*;
public class maxsubstr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = in.nextLine();
        System.out.println("Max: "+max(str));  
        in.close();
    }
    static int max (String str)
    {
        int c0 =0; 
        int c1 =0;
        int count =0;
        for(int i =0;i<str.length();i++)
        {
            if (str.charAt(i)=='0')
            {
                c0++;
            }
            else{
                c1++;
            }
            if(c0==c1)
            {
                count++;
            }
        }
        if(c0 != c1)
        {
            return -1;
        }
        return count;

    }
}
