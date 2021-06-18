#include<stdio.h>
#include<stdlib.h>
int main()
{
    int input,i;
    int c1=0,c2=0,c3=0,c4=0,c5=0;

    for(i=1;i<=25;i++)
    {
        scanf("%d",&input);
        if(input<1 || input>5)
        {
            printf("INVALID INPUT\n");
            exit(0);
        }
        if( input ==1 && i%5==1 )
            c1++;
        if( input==1 && i%5==2 )
            c2++;
        if( input==1 && i%5==3)
            c3++;
        if( input==1 && i%5==4)
            c4++;
        if( input==1 && i%5==0)
            c5++;
    }
    if(c1>=c2 && c1>=c3 && c1>=c4 && c1>=c5)
    {
        //max=c1;
        printf("Malaysia\n");
    }
    if(c2>=c1 && c2>=c3 && c2>=c4 && c2>=c5)
    {
        printf("Australia\n");
    }
    if(c3>=c1 && c3>=c2 && c3>=c4 && c3>=c5)
    {
        printf("Germany\n");
    }
    if(c4>=c1 && c4>=c2 && c4>=c3 && c4>=c5)
    {
        printf("Dubai\n");
    }
    if(c5>=c2 && c5>=c3 && c5>=c4 && c5>=c1)
    {
        printf("France\n");
    }
    return 0;
}