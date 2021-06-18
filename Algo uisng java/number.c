/*#include<stdio.h>
int main()
{
    int num,rev =0,rem;
    scanf("%d",&num);
    while(num>0)
    {
        rem = num%10;
        num /= 10;
        rev = rev*10 + rem;
    }
    num = 0;
    while(rev > 0)
    {
        rem = rev%10;
        rev /= 10;
        if(rem % 2 == 0)
            rem = rem+1;
        else
            rem = rem -1;
        num = num*10 + rem;
    }

    printf("%d",num);
    return 0;
}  */

#include<stdio.h>
int main()
{
    int num , count=0, i;
    int arr[1000000];
    scanf("%d", &num);
    for(int i =0; i<num; i++)
    {
        scanf("%d", &arr[i]);
        if(arr[i]==1 || arr[i]==2 || arr[i]==9 || arr[i]==16 || arr[i]==25 ||
         arr[i]==36 || arr[i]==49 || arr[i]==64 || arr[i]==81 || arr[i]==100)
        {
            count++;
        }
    }
    printf("%d\n",count);
    return 0;
}