package Maths;

import java.util.*;
public class Max_Expression{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int countofnegatives =0;

        int sum = a+b+c;
        int product = a*b*c;

        int max =0;
        int min =0;

        if(a>b && a>c) max =a;
        else if(b>c) max =b;
        else max =c;

        if(a<b && a<c) min =a;
        else if(b<c) min =b;
        else min =c;

        if(a<0) countofnegatives++;
        if(b<0) countofnegatives++;
        if(c<0) countofnegatives++;

        System.out.println("Maximum of the given expression: " );
        System.out.println(max);
        System.out.println(min);
        System.out.println(countofnegatives);
        switch (countofnegatives)
        {
            case 0:
                System.out.println((sum - max)*max);
                break;

            case 1:
                System.out.println((product/min)+min);
                break;

            case 2:
                System.out.println((product/max)+max);
                break;

            case 3:
                System.out.println((sum-min)*min);
                break;
        }

        in.close();
    }
}
