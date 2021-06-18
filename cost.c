#include<stdio.h>
int main()
{
  int cpsh,cpsc,cpsa;
  int maxareah,maxareac,maxareaa;
  int minnoh,minnoc,minnoa;
  int minareah,minareac,minareaa;
  int areaTotal,remArea;
  long int mincost=0;
  scanf("%d%d%d",&cpsh,&cpsc,&cpsa);
  scanf("%d%d%d",&maxareah,&maxareac,&maxareaa);
  scanf("%d%d",&minnoh,&minareah);
  scanf("%d%d",&minnoc,&minareac);
  scanf("%d%d",&minnoa,&minareaa);
  scanf("%d",&areaTotal);
  remArea=areaTotal;
  if(cpsh<cpsc && cpsh<cpsa)
  {
    mincost+=maxareah*cpsh;
    remArea-=maxareah;
    if(cpsc>cpsa)
    {
      mincost+=(minnoc*minareac)*cpsc;
      remArea-=(minareac*minnoc);
      mincost+=cpsa*remArea;
    }
    else
    {
      mincost+=(minnoa*minareaa)*cpsa;
      remArea-=(minareaa*minnoa);
      mincost+=cpsc*remArea;
    }
  }
  else if(cpsc<cpsh && cpsc<cpsa)
  {
    mincost+=maxareac*cpsc;
    remArea-=maxareac;
    if(cpsh>cpsa)
    {
      mincost+=(minnoh*minareah)*cpsh;
      remArea-=(minareah*minnoh);
      mincost+=cpsa*remArea;
    }
    else
    {
      mincost+=(minnoa*minareaa)*cpsa;
      remArea-=(minareaa*minnoa);
      mincost+=cpsh*remArea;
    }
  }
  else
  {
    mincost+=maxareaa*cpsa;
    remArea-=maxareaa;
    if(cpsc>cpsh)
    {
      mincost+=(minnoc*minareac)*cpsc;
      remArea-=(minnoc*minareac);
      mincost+=cpsh*remArea;
    }
    else
    {
      mincost+=(minnoh*minareah)*cpsh;
      remArea-=(minnoh*minareah);
      mincost+=cpsc*remArea;
    }
  }
  printf("%lu",mincost);
  return 0;
}
