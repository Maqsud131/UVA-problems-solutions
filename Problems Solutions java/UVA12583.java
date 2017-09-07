import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA12583{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=t;i++){
      String s=sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      int n = Integer.parseInt(st.nextToken());
      int d = Integer.parseInt(st.nextToken());
      
      s=st.nextToken();
      int a[] = new int[91];
      int co=0;
      for(int c=0;c<s.length();c++){
        for(int j=65;j<91;j++){
          if(a[j]>0)
            a[j]--;
        }    
        int x=(int)s.charAt(c);
        if(a[x]>0)
          co++;
        a[x]=d+1;
      }
      System.out.println("Case "+i+": "+co);
    }
  }
}
      