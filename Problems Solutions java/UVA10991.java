import java.util.Scanner;
public class UVA10991{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
      double r1 = sc.nextDouble();
      double r2 = sc.nextDouble();
      double r3 = sc.nextDouble();
      
      double a=r1+r2;
      double b=r1+r3;
      double c=r2+r3;
      
      double s=(a+b+c)/2;
      
      double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      
      double a1=Math.acos((b*b+a*a-c*c)/(2*b*a));
      double a2=Math.acos((c*c+a*a-b*b)/(2*a*c));
      double a3=Math.acos((c*c+b*b-a*a)/(2*c*b));
      
      double s1=r1*r1*(a1/2);
      double s2=r2*r2*(a2/2);
      double s3=r3*r3*(a3/2);
      
      A=A-s1-s2-s3;
      A=Math.round(A*1000000.0)/1000000.0;
      System.out.println(A);
    }
  }
}