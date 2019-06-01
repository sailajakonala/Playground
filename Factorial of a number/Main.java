#include <stdio.h>
int main() {
	int num,pro=1,i=1;
  scanf("%d",&num);
  while(i<=num)
  {
    pro=pro*i;
    i++;
  }
  printf("%d",pro);
	return 0;
}