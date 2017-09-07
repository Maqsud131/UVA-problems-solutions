import java.util.Scanner;
import java.math.BigInteger;

public class UVA10579{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    BigInteger ar[] = new BigInteger[5002];
    ar[0]= BigInteger.ZERO;
    ar[1]= BigInteger.ONE;
    for(int i=2;i<=5000;i++)
      ar[i]=ar[i-1].add(ar[i-2]);
    
    while(sc.hasNext()){
      int n = sc.nextInt();
      System.out.println(ar[n]);
    }
  }
}