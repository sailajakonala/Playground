#include<stdio.h>
int func(int n)
{
  int sum=0,i=0;
  while(i<=n)
  {
    sum=sum+i;
    i++;
  }
  return sum;
}
int main() {
    int n,res;
  scanf("%d",&n);
  res=func(n);
  printf("%d",res);
  return 0;
}