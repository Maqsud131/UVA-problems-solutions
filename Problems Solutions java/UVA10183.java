import java.util.Scanner;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class UVA10183{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    BigInteger ar[] = new BigInteger[5002];
    ar[0]= BigInteger.ONE;
    ar[1]=new BigInteger("2");
    for(int i=2;i<=5000;i++)
      ar[i]=ar[i-1].add(ar[i-2]);
    
    while(sc.hasNext()){
      String s=sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      BigInteger a=new BigInteger(st.nextToken());
      BigInteger b=new BigInteger(st.nextToken());
      
      BigInteger z = BigInteger.ZERO;
      if(a.equals(z) && b.equals(z))
        break;
      
      int c=0;
      for(int i=0;i<5001;i++){
        if(ar[i].compareTo(a)>=0 && ar[i].compareTo(b)<=0){
          //System.out.println(ar[i]);
          c++;
        }
        if(ar[i].compareTo(b)>0)
          break;
      }
      System.out.println(c);
    }
  }
}