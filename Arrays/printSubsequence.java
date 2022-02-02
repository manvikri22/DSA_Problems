package Arrays;
import java.util.*;
public class printSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s =in.nextLine();
        print(s,0,"");
            
        in.close();
    }
    static void print(String s, int i , String cur)
    {
        if(i==s.length())
        {
            System.out.print(cur+" ");
            return;
        }
        print(s,i+1,cur+s.charAt(i));
        print(s, i+1, cur);
    }
}
