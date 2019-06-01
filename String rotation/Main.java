#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
  int size1   = strlen(str1); 
  int size2   = strlen(str2); 
  void *ptr; 
  
  /* Check if sizes of two strings are same */
  if (size1 != size2) 
     return 0; 
  
  /* Create a temp string with value str1.str1 */
  char temp[1000];
  temp[0] = ' '; 
  strcat(temp, str1); 
  strcat(temp, str1); 
  
  /* Now check if str2 is a substring of temp */
  ptr = strstr(temp, str2); 
  
  
  
  /* strstr returns NULL if the second string is NOT a 
    substring of first string */
  if (ptr != NULL) 
    return 1; 
  else
    return 0; 
}
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);
  
    if (Rotation_check(st1, st2)) 
       printf("Yes"); 
    else
       printf("No"); 
  
    getchar(); 
    return 0; 
  return 0;
}