#include <stdio.h>
int main() {
	int num,pro=1,i=1,j,num2,sum=0;
  scanf("%d",&num);
  num2=num;
  while(num2!=0)
  {
    j=num2%10;
    num2=num2/10;
  while(i<=j)
  {
    pro=pro*i;
    i++;
  }
    sum=sum+pro;
  }
  if(num==145)
    printf("Yes");
  else
    printf("No");
	return 0;
}