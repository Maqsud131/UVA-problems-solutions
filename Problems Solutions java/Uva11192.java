import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Uva11192
{
 public static void main (String[] args) throws java.lang.Exception
 {
  Scanner sc = new Scanner(System.in);
  while(sc.hasNext()){
   String x=sc.nextLine();
   StringTokenizer st = new StringTokenizer(x);
   int g = Integer.parseInt(st.nextToken());
   if(g==0)
     break;
   String s = st.nextToken();
   int l=s.length()/g;
   for(int i=l-1;i<s.length();i=i+l){
     for(int j=0;j<l;j++){
       System.out.print(s.charAt(i-j));
     }
   }
   System.out.println();
  }
 }
}