#include<stdio.h>
int fun(int n,int e)
{
  int m;
  m=pow(n,e);
  return m;
}
int main(){
    int n,e,n1;
  scanf("%d %d",&n,&e);
  n1=fun(n,e);
  printf("%d",n1);
  	return 0;
}