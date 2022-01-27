package CD;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.*;
public class lab3 {
    static String keywords[] = { "abstract", "assert", "boolean",
    "break", "byte", "case", "catch", "char", "class", "const",
    "continue", "default", "do", "double", "else", "extends", "false",
    "final", "finally", "float", "for", "goto", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "native",
    "new", "null", "package", "private", "protected", "public",
    "return", "short", "static", "strictfp", "super", "switch",
    "synchronized", "this", "throw", "throws", "transient", "true",
    "try", "void", "volatile", "while" };

static String delimiter[] = {" ","{", "}", "(",
    ")", "[", "]", ";", ",", ".","+","-","*","/",">","<","="};

static String operators[] = { "+", "-", "/",
"*", "%", "!", "=", "^",">", "<", "&", "|", "?", "~",":"};

static char identifiers[] = {'0','1','2','3','4','5','6','7','8','9'};

    public static void main(String[] args) throws Exception
    {
    try {
        File myObj = new File("C:\\Users\\Manvi Kri\\OneDrive\\Desktop\\CDAssignment1.txt");
        Scanner in = new Scanner(myObj);
        System.out.println("Code without whitespaces: ");
        while (in.hasNextLine()) {
          String data = in.nextLine();
          print(data);
        }
        System.out.println("\n");
        Scanner sc = new Scanner(myObj);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            
            parse(data);
        }
        //printcount();
        in.close();
        sc.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

    }
    static void parse(String data)
    {
        String words[] = data.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if(iskeyword(words[i]) == true)
            {
                System.out.println(words[i]+" is a keyword");
            }
            else if(isoperator(words[i])== true)
            {
                System.out.println(words[i]+" is an operator");
            }
            else if(isdelimiter(words[i])==true)
            {
                System.out.println(words[i]+" is a delimiter");
            }
            else if(isInteger(words[i])==true)
            {
                System.out.println(words[i]+" is an integer");
            }
            else if(isidentifier(words[i])==true && isdelimiter(words[i])== false )
            {
                System.out.println(words[i]+" is a valid identifier");
            }
        }

    }
    public static void print(String x)
    {
        System.out.println();
        char[] ch = x.toCharArray();
        for(int i = 0; i < x.length(); i++)
        {
            if(!Character.isWhitespace(ch[i]))
            {
                System.out.print(ch[i]);
            }
        }
    }

    static boolean iskeyword(String x)
    {
        for(int j =0;j<keywords.length;j++)
            {
                if(keywords[j].equals(x))
                {
                    return true;
                }
            }
        return false;
    }
    static boolean isoperator(String x)
    {
        for(int j =0;j<operators.length;j++)
        {
            if(operators[j].equals(x))
            {
                return true;
            }
        }
        return false;
    }
    static boolean isdelimiter(String x)
    {
        for(int j =0;j<delimiter.length;j++)
            {
                if(delimiter[j].equals(x))
                {
                    return true;
                }
            }
        return false;
    }
    static boolean isInteger(String str)
    {
        int i, len = str.length();
        char[] ch = str.toCharArray();
        if (len == 0)
            return (false);
        for (i = 0; i < ch.length; i++) {
            for(int j = 0; j<identifiers.length;j++)
            {
                if(ch[i]==(identifiers[i])){
                    return true;
                }

            }
            
        }
        return false;
    }
    static boolean isidentifier(String str)
    {
        int i, len = str.length();
        char[] ch = str.toCharArray();
        if (len == 0)
            return (false);
        for (i = 0; i < len; i++) {
            for(int j = 0; j<identifiers.length;j++)
            {
                if(ch[i]==(identifiers[i]) || isdelimiter(str)==true){
                    return false;
                }

            }
            
        }
        return true;
    }

}