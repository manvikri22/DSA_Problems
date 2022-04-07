%{
#include<stdio.h>
int n=0;
%}
%%
[a] n++;
%%


int yywrap(){}

int main()
{
yylex();
printf("\nNo. of a's=%d", n);
return 0;
}
