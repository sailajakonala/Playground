#include <stdio.h>
int fun(int a,int b)
{
  if (b != 0)
       return fun(b, a%b);
    else 
       return a;
}
int main() {
	int a,b,c;
  int res;
  scanf("%d %d %d",&a,&b,&c);
  res=fun(a,b);
  res=fun(res,c);
  printf("%d",res);
	return 0;
}