#include<stdio.h>
int main()
{
  int n,i,j,count=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=1;i<=n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==arr[j])
      {
        count++;
      }
    }
    if(count==0)
    {
      printf("%d",i);
    }
    count=0;
  }
  return 0;
}