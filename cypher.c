#include<stdio.h>

int main()
{
    char input[1000], ch;
    int i,n,temp;
    scanf("%[^\n]%*c", input);
    scanf("%d",&n);

    for(i=0;input[i]!='\0'; i++)
    {
        ch=input[i];

        if(ch>=65 && ch<=90)
        {
            temp=n%26;
            //ch=ch+n;
            if(ch+temp>90)
            {
               ch=ch-90+65-1;
               ch+=temp;
            }
            else
            {
                ch=ch+temp;
            }
            input[i]=ch;
        }

        else if(ch>=97 && ch<=122)
        {
            temp=n%26;
           // ch=ch+n;
            if((int)ch+temp>122)
            {
               ch=ch-122+97-1;
               ch+=temp;
            }
            else
            {
                ch+=temp;
            }
            input[i]=ch;
        }

        else if(ch>=48 && ch<=57)
        {
            temp=n%10;
            //ch=ch+n;
            if(ch+temp>57)
            {
               ch=ch-57+48-1;
               ch+=temp;
            }
            else
            {
                ch+=temp;
            }
            
            input[i]=ch;
        }
        else
        {
            continue;
        }
        
    }
    printf("%s\n",input);

    return 0;
}