package CD;
import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner;


public class countTokens {

    static int wc =0;
    static int nc =0;
    static int wsc =0;
    static int kc =0;
    static int oc =0;
    static int sc =0;
    static String keywords[] = { "abstract", "assert", "boolean",
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "extends", "false",
        "final", "finally", "float", "for", "goto", "if", "implements",
        "import", "instanceof", "int", "interface", "long", "native",
        "new", "null", "package", "private", "protected", "public",
        "return", "short", "static", "strictfp", "super", "switch",
        "synchronized", "this", "throw", "throws", "transient", "true",
        "try", "void", "volatile", "while" };
    static char seperators[] = { '{', '}', '(',
        ')', '[', ']', ';', ',', '.' };

    static char operators[] = { '+', '-', '/',
    '*', '%', '!', '=', '^','<', '>', '&', '|', '?',  '~',':'};
    public static void main(String[] args) {
        
        try {
            File myObj = new File("C:\\Users\\Manvi Kri\\OneDrive\\Desktop\\CDAssignment1.txt");
            Scanner in = new Scanner(myObj);
            while (in.hasNextLine()) {
              String data = in.nextLine();
              counttokens(data);
              
                
            }
            in.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          System.out.println("Total word count = "+ wc);
          System.out.println("Total number count = "+ nc);
          System.out.println("Total number of whitespaces = "+ wsc);
          System.out.println("Total variable count = "+ (wc-(kc+oc+sc+nc)));
          System.out.println("Total number of Keywords = "+ kc);

    }
    static void counttokens(String data){
        String words[] = data.split("\\s+");
        wc += words.length;
        wsc += wc - 1;
        char[] ch = data.toCharArray();
        for(int i =0;i<data.length();i++)
        {
            if(Character.isDigit(ch[i]))
            {
                
                nc++;
            }
        }
        for(String w:words)
        {
            for(int j =0;j<keywords.length;j++)
            {
                if(keywords[j].equals(w))
                {
                    
                    kc++;
                }
            }
        }
        for(char w:ch)
        {
            for(int j =0;j<operators.length;j++)
            {
                if(operators[j]== w)
                {
                    oc++;
                }
            }
        }
        for(char w:ch)
        {
            for(int j =0;j<seperators.length;j++)
            {
                if(seperators[j]==w)
                {
                    sc++;
                }
            }
        }

                
        
        
    }
    
}
