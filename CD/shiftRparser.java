package CD;

import java.util.*;

public class shiftRparser {

    int i = 0, j = 0,c = 0, z=0;
    
    char ac[] = new char[255];
    char action[] = new char[255];
    char stack[] = new char[255];
    char a[] = new char[255];

    void check()
    {

        for(z = 0; z < c; z++) 
        {
            if(stack[z] == '4') 
            {
                System.out.println(ac);
                stack[z] = 'E';
                stack[z + 1] = '\0';
                //printing action
                System.out.println("\n"+stack+"\t"+a+"$\t"); 

            }
        }

    }
        
    public static void main(String args[])
    {

    }

    
}
