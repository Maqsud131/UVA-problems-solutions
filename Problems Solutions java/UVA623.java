import java.util.Scanner;
import java.math.BigInteger;
public class UVA623{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n = sc.nextInt();
      BigInteger fact = BigInteger.ONE;
      for(int i = 2; i<=n; i++){
        fact = fact.multiply(BigInteger.valueOf(i));
      }
      System.out.println(n + "!");
      System.out.println(fact);
    }
  }
}