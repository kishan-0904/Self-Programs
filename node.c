#include<stdio.h>
long int factor(long int num)
{
  long int i; 
  if(num%2==0)
    return(num/2);
  else if(num%3==0)
    return(num/3);
  else if(num%5==0)
    return(num/5);
  else if(num%7==0)
    return(num/7);
  else
  {
	for(i=11;i<=(num/2);i+=2)
    {
		if(num%i==0)
          return(num/i);
    }
  }
	return 1;
}
int main()
{
  long int m,n;
  int node_count=0;
  scanf("%lu%lu",&m,&n);
  if(m>n)
  {
    while(m!=n && m!=1)
  	{
      m=factor(m);
      node_count++;
    }
    if(m==n)
      printf("%d",node_count);
    else
    {
      while(n!=1)
      {
        n=factor(n);
        node_count++;
      }
      printf("%d",node_count);
    }
  }
  else
  {
    while(n!=m && n!=1)
    {
      n=factor(n);
      node_count++;
    }
    if(n==m)
      printf("%d",node_count);
    else
    {
      while(m!=1)
      {
        m=factor(m);
        node_count++;
      }
      printf("%d",node_count);
    }
  }
  return 0;
}
