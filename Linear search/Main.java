#include<stdio.h>
int main()
{
  //Type your code here
  int a[100],k,n,i,r=0;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(k==a[i])
    {
      printf("%d",i+1);
      r=1;
      break;
    }
    /*if(k!=a[i])
    {
      r=0;
      continue;
    }*/
  }
  if(r==0)
  {
    printf("%d isn't present in the array.",k);
  }
  return 0;
}