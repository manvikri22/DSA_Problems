%{
#include<stdio.h>
int wc=0, vc=0, ch=0; 
%}
 
%%
[aeiouAEIOU][a-zA-Z0-9]+ {vc++;} //vowel counter
[a-zA-Z0-9]* {wc++;}  //word counter
[a-zA-Z] {ch++;} //characters counter
%%

int yywrap(){}
int main()
{
// The function that starts the analysis
yylex();

printf("\nNo. of words=%d\n", wc);
printf("\nNo. of vowels=%d\n", vc);
printf("\nNo. of characters=%d\n", ch);

return 0;
}






