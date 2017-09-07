import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA11628{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    while(sc.hasNext()){
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(n==0 && m==0)
        break;
      int ar[][]=new int[n][m];
      int amt[]=new int[m];
      sc.nextLine();
      for(int c=0;c<n;c++){
        String s = sc.nextLine();
        //System.out.println(s);
        StringTokenizer st = new StringTokenizer(s);
        for(int c1=0;c1<m;c1++){
          String w=st.nextToken();
          int x=Integer.parseInt(w);
          ar[c][c1]=x;
          amt[c1]=amt[c1]+x;
        }
      }
      for(int c=m-1;c>=0;c++){
        if(amt[c]>0){
          for(int c1=0;c1<n;c1++){
            if(ar[c1][c]>0){
              int d=gcd(ar[c1][c],amt[c]);
              sb.append((ar[c1][c]/d)+"/"+(amt[c]/d)+"\n");
            }else{
             sb.append("0/1\n"); 
            }
          }
          break;
        }else{
        }
      }
    }
    System.out.print(sb);
  }
  
  public static int gcd(int a, int b){
    if(b==0)
      return a;
    return gcd(b,a%b);
  }
}
        
      
      
      