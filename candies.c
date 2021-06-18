#include<stdio.h>

int main()
{
    int m,n,k,rem;
    n=10,k=5;
    rem=n;
    scanf("%d",&m);
    if(n<1 || n>rem)
    {
        printf("INVALID INPUT\nNUMBER OF CANDIES AVAILABLE: %d\n",rem);
    }
    else
    {
        rem=rem-n;
        if(rem<=k)
        {
            rem=m;
        }
        printf("NUMBER OF CANDIES SOLD: %d\nNUMBER OF CANDIES AVAILABLE: %d\n",n,rem);
    }
    return 0;
    
}