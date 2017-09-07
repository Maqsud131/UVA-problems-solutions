/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Uva10050
{
 public static void main (String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int t=sc.nextInt();
  for(int c=0;c<t;c++){
   int n=sc.nextInt();
   int ar[] = new int[n+1];
   int p = sc.nextInt();
   int h[] = new int[p];
   for(int i=0;i<p;i++)h[i]=sc.nextInt();
   
   for(int i=0;i<p;i++){
     for(int j=h[i];j<=n;j=j+h[i]){
       ar[j]=1;
     }
   }
   for(int i=6;i<=n;i=i+7){
     ar[i]=0;
     if(i<n)
       ar[i+1]=0;
   }
   int s=0;
   for(int i=0;i<=n;i++)s=s+ar[i];
   System.out.println(s);
  }
 }
}