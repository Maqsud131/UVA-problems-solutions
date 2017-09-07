import java.util.Scanner;

public class UVA11945{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=sc.nextInt();
    for(int c=1;c<=t;c++){
      double ar=0;
      
      for(int i=0;i<12;i++)
        ar=ar+ sc.nextDouble();
      
      ar = ar/12;
      ar = Math.round(ar*100.0)/100.0;
      
      
      String s=""+ar;
      //String e= s.substring(s.length()-6);
      //String f="";
      if(s.charAt(s.length()-2)=='.')
        s=s+"0";
      if(s.length()>6){
        String e= s.substring(s.length()-6);
        String f="";
        for(int i=0;i<s.length()-6;i++)
          f=f+s.charAt(i);
        System.out.println(c+" $"+f+","+e);
      }
      else
        System.out.println(c+" $"+s);
    }
  }
}
    
      
      