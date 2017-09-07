import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class UVA787{
  public static BigInteger ref;
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    ref = BigInteger.ZERO;
    BigInteger max = BigInteger.ONE;
    BigInteger tem = BigInteger.ONE;
    ArrayList<BigInteger> li = new ArrayList<BigInteger>();
    boolean z = false;
    boolean str = false;
    
    while(sc.hasNext()){
      String s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      int co=st.countTokens();
      
      
      
      for(int c=0;c<co;c++){
        String n=st.nextToken();
        
        if(n.equals("0")){
          z=true;
          if(str==false){
            str=true;
            if(c!=0)
              max = new BigInteger(tem.toString());
            else
              max = BigInteger.ZERO;
            
          }
          if(li.size()>0){
            BigInteger strt = li.get(0);
            BigInteger ed = tem.divide(strt);
            
            if(tem.signum()!=1){
             // System.out.println(max);
              max=max.max(strt);
              if(li.size()>1)
                max=max.max(ed);
             // System.out.println(max);
              for(int c1=1;c1<li.size()-1;c1++){
                BigInteger k = li.get(c1);
                ed = ed.divide(k);
                if(k.signum()!=1){
                  max=max.max(ed);
                  max=max.max(strt);
                }
                strt=strt.multiply(k);
              }
              max=max.max(strt);
              if(li.size()>1)
                max=max.max(ed);
            }else{
              max = max.max(tem);
            }
          }
          li = new ArrayList<BigInteger>();
          tem = BigInteger.ONE;
        }else if(n.equals("-999999")){
          if(str==false){
            str=true;
            max = new BigInteger(tem.toString());
          }
          if(li.size()>0){
            BigInteger strt = li.get(0);
            BigInteger ed = tem.divide(strt);
            if(tem.signum()!=1){
              //System.out.println(max);
              max=max.max(strt);
              if(li.size()>1)
                max=max.max(ed);
              //System.out.println(max);
              for(int c1=1;c1<li.size()-1;c1++){
                BigInteger k = li.get(c1);
                ed = ed.divide(k);
                if(k.signum()!=1){
                  max=max.max(ed);
                  max=max.max(strt);
                }
                strt=strt.multiply(k);
              }
              max=max.max(strt);
              if(li.size()>1)
                max=max.max(ed);
              
            }else{
              max = max.max(tem);
            }
          }
          if(z==true)
            max=max.max(ref);
          System.out.println(max);
          li = new ArrayList<BigInteger>();
          tem = BigInteger.ONE;
          max = BigInteger.ONE;
          z = false;
          str = false;
        }else{
          BigInteger num = new BigInteger(n);
          tem = tem.multiply(num);
          li.add(num);
        }
      }
    }
  }
}
        
  