#include <stdio.h>
int main() {
	int i,n;
    scanf("%d",&n);
    i=n%10;
    while(n>10)
    {
      n=n/10;
    }
  printf("%d",n+i);
	return 0;
}