%{
int aa=0;
int ab=0;
int a=0;
int flag=0;
%}

%%
aa+ {aa++; a++;}
a+b+ {ab++; a++;}
. ;
%%

int yywrap(){}
int main(){
printf("Enter string: ");
yylex();
printf("\naa=%d\nab=%d\na=%d",aa,ab,a);
return 0;
}
