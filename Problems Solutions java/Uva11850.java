/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Uva11850
{
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner sc = new Scanner(System.in);
  while(sc.hasNext()){
   int n=sc.nextInt();
   if(n==0)break;
   int ar[] = new int[n];
   for(int c=0;c<n;c++)ar[c]=sc.nextInt();
   Arrays.sort(ar);
   boolean t=false;
   for(int i=0;i<n-1;i++){
    if(ar[i+1]-ar[i]>200){
     t=true;
     break;
    }
   }
   if(2*(1422-ar[n-1])>200)
    t=true;
   if(t==true)System.out.println("IMPOSSIBLE");
   else System.out.println("POSSIBLE");
  }
 }
}