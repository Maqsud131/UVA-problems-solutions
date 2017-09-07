import java.util.Scanner;

public class UVA294{
  public static boolean []ar;
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    
    int n = sc.nextInt();
    for(int c=0;c<n;c++){
      int l=sc.nextInt();
      int h=sc.nextInt();
      
      int maxN=1;
      int maxD=1;
      
      for(int c1=l;c1<=h;c1++){
        int d = getD(c1);
        if(d>maxD){
          maxD=d;
          maxN=c1;
        }
      }
      System.out.println("Between "+l+" and "+h+", "+maxN+" has a maximum of "+maxD+" divisors.");
    }
  }
  
  public static int getD(int n){
    int d=1;
      for(int c=2;c<=n;c++){
        int v=1;
        while(n%c==0){
          n=n/c;
          v=v+1;
        }
        d=d*v;
      }
      return d;
  }
}
        
        
        
        
        