#include <stdio.h>
int fun(int a,int b,int c)
{
  if(a>b && a>c)
    printf("%d",a);
  else if(b>c)
    printf("%d",b);
  else
    printf("%d",c);
}
int main(){
	int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
    fun(a,b,c);
  	return 0;
}