package Arrays;
import java.util.*;
public class printdups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = in.next();
        
        print(s);
        in.close();
    }
    static void print(String s)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            if(!count.containsKey(s.charAt(i)))
            {
                count.put(s.charAt(i),1);
            }
            else{
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
            }
        }

        for(Map.Entry mapElement : count.entrySet())
        {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());

            if(value>1)
            System.out.println(key +", count = "+value);
        }
    }
}
