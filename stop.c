#include<stdio.h>
#include<string.h>
#include<math.h>

int main()
{
    int initPos=10,finalPos=10,i;
    long distance=0;
    double result,value;
    int path[8]={800,600,750,900,1400,1200,1100,1500};
    char stops[8][3]={"TH","GA","IC","HA","TE","LU","NI","CA"};
    char init[3],final[3];
    scanf("%s",init);
    scanf("%s",final);
    for(i=0;i<8;i++)
    {
        if(strcasecmp(init, stops[i]) == 0)
        {
            initPos=i;
        }
        if(strcasecmp(final, stops[i]) == 0)
        {
            finalPos=i;
        }        
    }

    if(initPos == 10 || finalPos == 10 || initPos == finalPos)
        printf("INVALID INPUT\n");
    else
    {
        if(initPos < finalPos )
        {
            for(i=initPos;i<=finalPos;i++)
            {
                distance+=path[i];
            }
        }
        else
        {
            for(i=0;i<8;i++)
            {
                if(i>finalPos && i<=initPos)
                    continue;
                else
                {
                    distance+=path[i];
                }    
            }
        }
        result=(double) distance/200;
        value= ceil (result);
        printf("%0.1lf INR\n",value);
        
    }
    

    return 0;
}