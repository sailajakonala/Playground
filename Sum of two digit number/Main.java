#include<stdio.h>
int main()
{
  int i,n;
  scanf("%d",&n);
  i=n%10;
  n=n/10;
  printf("%d",i+n);
  return 0;
}