#include<stdio.h>

int main()
{
    int inter,exter,i;
    double saInt[10000], saExt[10000];
    long double cost=0.0;
    scanf("%d",&inter);
    scanf("%d",&exter);
    for(i=0;i<inter;i++)
    {
        scanf("%lf",&saInt[i]);
        cost+=saInt[i]*18;
    }
    for(i=0;i<exter;i++)
    {
        scanf("%lf",&saExt[i]);
        cost+=saExt[i]*12;
    }

    printf("Total estimated Cost:%0.1Lf INR\n",cost);

    return 0;
}