#include<stdio.h>
int fun(int n)
{ 
  int i=2,j,count=0;
 while(i<=n)
 {
   for(j=1;j<=i;j++)
   {
     if(i%j==0)
     {
       count++;
     }
   }
   if(count==2)
   {
     printf("%d\n",i);
   }
   count=0;
   i++;
}
}
int main()
{
    int n;
  scanf("%d",&n);
  fun(n);
 return 0;
}