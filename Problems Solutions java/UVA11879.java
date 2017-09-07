import java.util.Scanner;
import java.math.BigInteger;

public class UVA11879{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      String s = sc.nextLine();
      if(s.charAt(0)=='0')
        break;
      
      int d;
      //s=s.substring(0,s.length()-1);
      
      String b;
      
      BigInteger a = new BigInteger(s);
      BigInteger l ;
      BigInteger c = new BigInteger("100");
      BigInteger h = new BigInteger("17");
      BigInteger z = BigInteger.ZERO;
      
      while(a.compareTo(c)>0){
        s=a.toString();
        d= 5*Character.getNumericValue(s.charAt(s.length()-1));
        s=s.substring(0,s.length()-1);
        b=""+d;
        //System.out.println(s);
        a = new BigInteger(s);
        l = new BigInteger(b);
        a=a.subtract(l);
      }
      //System.out.println(a);
      
      if((a.mod(h)).equals(z))
        System.out.println(1);
      else
        System.out.println(0);
        
      
    }
  }
}