#include<stdio.h>
void combination(long int *arr, long int N)
{
  int f=0;
  long int n;
  for(n=0;n<N;n++)
  {
    if(((arr[n]+arr[n+1])%3!=0))
      f=1;
    else
      f=0;
  }
  if(f==1)
  {
    printf("\n");
    printf("Yes");
  }
  else
  {
    printf("\n");
    printf("No");
  }
}
int main()
{
int T;
long int N,arr[100000],i,j,k,t;
scanf("%d",&T);
  while(T--)
  {
    scanf("%lu",&N);
    for(j=0;j<N;j++)
    {
      scanf("%lu",arr[i]);
    }
    for(k=1;k<N;k++)
    {
      for(j=0;j<N-1;j++)
      {
        t=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=t;
        combination(arr,N);
      }
    }
  }
  return 0;
}
