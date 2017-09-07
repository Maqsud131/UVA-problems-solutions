import java.util.*;
public class UVA11152{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
     
      double s = (a+b+c)/2.00;
      double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      
       double r=(2*ar/(a+b+c));
      
      double d= (a*b*c)/(2*ar);
      
      double c1= Math.PI*r*r;
      
      double c2= (Math.PI*d*d)/4;
      
      
      c2=c2-ar;
      
      ar=ar-c1;
      
      
      System.out.printf("%.4f %.4f %.4f",c2,ar,c1);
      System.out.println();
    }
  }
}