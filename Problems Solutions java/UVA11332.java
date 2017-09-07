import java.util.Scanner;
public class UVA11332{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n = sc.nextInt();
      if(n==0)
        break;
      
      int b=0;
      
      while(n>9){
        b=0;
        for(int d=1000000000;d>0;d=d/10){
          b=b+n/d;
          n=n%d;
        }
        //System.out.println(b);
        n=b;
      }
      System.out.println(n);
    }
  }
}
        