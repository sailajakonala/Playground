// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
// Main function
int main()
{
  char string[100];
   int c = 0, count[26] = {0}, x;
 
 
   gets(string);
 
   while (string[c] != '\0') {
   /** Considering characters from 'a' to 'z' only and ignoring others. */
 
      if (string[c] >= 'a' && string[c] <= 'z') {
         x = string[c] - 'a';
         count[x]++;
      }
 
      c++;
   }
 
   for (c = 0; c < 26; c++)
   {
     if(count[c]==0) 
         printf("%c ", c + 'a');
   }
  
   return 0;
}