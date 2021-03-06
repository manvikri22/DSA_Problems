package Arrays;
import java.util.*;

public class lcs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string1: ");
        String s1 = in.next();
        System.out.println("Enter string2: ");
        String s2 = in.next();
        System.out.println(longestCommonSubsequence(s1,s2));
            
        in.close();
    }
    static int longestCommonSubsequence(String text1, String text2) {
        
        int [][] dp = new int[text1.length()+1][text2.length()+1];
        
        for(int i =0;i<text1.length()+1;i++)
        {
            for(int j =0;j<text2.length()+1;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
                
            }
        }
        return dp[text1.length()][text2.length()];
        
    }
}
