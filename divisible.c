#include<stdio.h>
int main()
{
	int t;
	long int n,i,a[100000],count,buck0,buck1,buck2;
	scanf("%d",&t);
	while(t--)
	{
		count=0,buck0=0,buck1=0,buck2=0;
		scanf("%lu",&n);
		for(i=0;i<n;i++)
		{
		scanf("%lu",&a[i]);
		if(a[i]%3==0)
			{
			count++;
			buck0++;
			}
		else if(a[i]%3==1)
			{
			buck1++;
			}
		else
			{
			buck2++;
			}
		}
		if(count>(n/2) || buck0==0)
			printf("No\n");
		else
			printf("Yes\n");
	}
	return 0;
}
