import java.util.Scanner;
import java.util.Arrays;

public class UVA11389{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      int d=sc.nextInt();
      int r=sc.nextInt();
      
      if(n==0 && d==0 && r==0)
        break;
      
      int m[] = new int[n];
      int e[] = new int[n];
      for(int c=0;c<n;c++)
        m[c]=sc.nextInt();
      for(int c=0;c<n;c++)
        e[c]=sc.nextInt();
      
      Arrays.sort(m);
      Arrays.sort(e);
      
      int b=0;
      
      for(int c=0;c<n;c++){
        if(m[c]+e[n-c-1]>d)
          b=b+m[c]+e[n-c-1]-d;
      }
      System.out.println(b*r);
    }
  }
}
     
      
      