#include<stdio.h>
int func(int n)
{
  int sq;
  sq=n*n;
  return sq;
}
int main() 
{
int n,res;
 scanf("%d",&n);
  res=func(n);
  printf("%d\n",res);
   return 0;
}