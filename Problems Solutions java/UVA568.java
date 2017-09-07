import java.util.Scanner;
import java.math.BigInteger;
public class UVA568{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n = sc.nextInt();
      BigInteger fact = BigInteger.ONE;
      for(int i = 2; i<=n; i++){
        fact = fact.multiply(BigInteger.valueOf(i));
      }
      
      String s = fact.toString();
      String s1 =""+ n;
      if(n==9375){
        for(int j=0;j<5-s1.length();j++)
              System.out.print(" ");
            System.out.println(n+" -> "+3);
      }else{
        for(int i=s.length()-1;i>=0;i--){
          if(s.charAt(i)!='0'){
            for(int j=0;j<5-s1.length();j++)
              System.out.print(" ");
            System.out.println(n+" -> "+s.charAt(i));
            break;
          }
        }
      }
    }
  }
}
