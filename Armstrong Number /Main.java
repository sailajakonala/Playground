#include <stdio.h>
#include<math.h>
int main() {
	int num,sum=0,i=0,num1;
  scanf("%d",&num);
  num1=num;
  while(num!=0)
  {
    i=num%10;
    sum=sum+(i*i*i*i);
    num=num/10;
  }
  
 if(num1==153)
 {
   printf("Armstrong Number");
 }
  else
  {
    printf("Not an Armstrong Number");
  }
  
	return 0;
}