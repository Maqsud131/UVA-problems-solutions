import java.util.Scanner;

public class UVA11466{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean []ar = new boolean[9999999];
    for(int c=2;c<=Math.sqrt(9999998);c++){
      if(ar[c]==false){
        for(int c1=c*c;c1<=9999998;c1=c1+c)
          ar[c1]=true;
      }
    }
    
    while(sc.hasNext()){
      long n=Math.abs(sc.nextLong());
      //n=Math.abs(n);
      if(n==0)
        break;
      int d=-1;
      boolean f=false;
      boolean f1=false;
      long m=n;
      int x = (int)Math.sqrt(n);
      for(int c=x;c>1;c--){
        if(ar[c]==false && n%c==0){
          while(n%c==0)
            n=n/c;
          if(f==false){
            d=c;
            f=true;
          }else{
            f1=true;
          }
        }
      }
      if(f1==true || (n!=1 && n!=m)){
        if(n!=1)
          System.out.println(n);
        else
          System.out.println(d);
      }else{
        System.out.println("-1");
      }
    }
  }
}