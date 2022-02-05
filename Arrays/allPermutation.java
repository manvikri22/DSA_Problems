package Arrays;
import java.util.*;
public class allPermutation {
    static String s ="";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        s = in.nextLine();
        print(s,0,s.length()-1);
        in.close();
    }
    static void print(String s, int l, int r)
    {
        if(l==r)
        {
            System.out.print(s+" ");
            return;
        }
        for(int i=l;i<=r;i++)
        {
            s = swap(s,l,i);
            print(s,l+1,r);
            s = swap(s,l,i);
        }
    }
    static String swap(String s, int l, int r)
    {
        char[] str = s.toCharArray();
        char temp = str[l];
        str[l] = str[r];
        str[r] = temp;
        return String.valueOf(str);

    }
}
