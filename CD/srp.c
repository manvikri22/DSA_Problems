#include<stdio.h>
#include<conio.h>
#include<string.h>

int z = 0, i = 0, j = 0, c = 0;
char a[25], ac[20], stack[15], act[10]; 

void check()
{
    strcpy(ac," REDUCE TO E -> "); 
    for(z = 0; z < c; z++) 
    {

        if(stack[z] == '4') 
        {
            printf("%s4", ac);
            stack[z] = 'E';
            stack[z + 1] = '\0';
            printf("\n$%s\t%s$\t", stack, a); 
        }
    }
    for(z = 0; z < c - 2; z++)
    {
        if(stack[z] == '2' && stack[z + 1] == 'E' && stack[z + 2] == '2') 
        {
            printf("%s2E2", ac);
            stack[z] = 'E';
            stack[z + 1] = '\0';
            stack[z + 2] = '\0';
            printf("\n$%s\t%s$\t", stack, a);
            i = i - 2;
        }
        
        if(stack[z] == '3' && stack[z + 1] == 'E' && stack[z + 2] == '3') 
        {
            printf("%s3E3", ac);
            stack[z]='E';
            stack[z + 1]='\0';
            stack[z + 1]='\0';
            printf("\n$%s\t%s$\t", stack, a);
            i = i - 2;
        }
    }
    return ;
}
 
int main()
{
    printf("GRAMMAR is -\nE->3E3 \nE->2E2 \nE->4\n"); 
    printf("Enter the string:");
    scanf("%s",a);
    c = strlen(a); 
    strcpy(act," SHIFT"); 
    printf("\nStack \t Input \t Action"); 
    printf("\n$\t%s$\t", a); 

    for(i = 0; j < c; i++, j++) 
    {
        printf("%s", act); 
        stack[i] = a[j];     
        stack[i + 1] = '\0';
        a[j]=' ';
        printf("\n$%s\t%s$\t", stack, a); 
        check(); 

    }

    check(); 
    if(stack[0] == 'E' && stack[1] == '\0') 
    {
        printf(" Accept\n");
    }
    else
    {
        printf(" Reject\n");
    }
}