import java.util.Scanner;
import java.math.BigInteger;

public class UVA424{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    BigInteger sum = BigInteger.ZERO;
    
    while(sc.hasNext()){
      String s = sc.nextLine();
      if(s.length()==1 && s.charAt(0)=='0'){
        System.out.println(sum);
        break;
      }
      
      BigInteger a = new BigInteger(s);
      
      sum = sum.add(a);
      
    }
  }
}
      