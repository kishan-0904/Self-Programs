#include<stdio.h>
int main()
{
    int i,j,num;
    scanf("%d",&num);
    for(i=1;i<=num;i++)
    {
        for(j=1;j<=num*2-1;j++)
        {
            if(j<=num-i)
                printf("*");
            else if(j>=num+i)
                printf("*");
            else
                printf(".");
        }
        printf("\n");
    }
    for(i=1;i<=num-1;i++)
    {
        for(j=1;j<=num*2-1;j++)
        {
            if(j<=i)
                printf("*");
            else if(j<=num*2-1-i)
                printf(".");
            else
                printf("*");        
        }
        printf("\n");
    }
}