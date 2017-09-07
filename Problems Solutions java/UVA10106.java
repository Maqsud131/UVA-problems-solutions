import java.util.Scanner;
import java.math.BigInteger;

public class UVA10106{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      //sc.nextLine();
      String x=sc.nextLine();
      String y=sc.nextLine();
      
      BigInteger i= new BigInteger(x);
      BigInteger j= new BigInteger(y);
      
      BigInteger z= i.multiply(j);
      System.out.println(z);    
    }
  }
}