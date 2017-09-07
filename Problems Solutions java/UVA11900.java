import java.util.Scanner;

public class UVA11900{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    
    for(int c=1;c<=t;c++){
      int n = sc.nextInt();
      int p = sc.nextInt();
      int q = sc.nextInt();
      
      int []ar = new int[n];
      for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
      
      int b=0;
      int i=0;
      for(;i<n;i++){
        if(i==p)
          break;
        if(b+ar[i]>q)
          break;
        b=b+ar[i];
      }
      System.out.println("Case "+c+": "+i);
    }
  }
}
  