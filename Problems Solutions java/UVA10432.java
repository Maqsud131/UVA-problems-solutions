import java.util.Scanner;
public class UVA10432{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      double r=sc.nextDouble();
      double n=sc.nextDouble();
      
      double rad = Math.toRadians(360/n);
      double a=(r*r*n*Math.sin(rad))/2;
      System.out.printf("%.3f\n",a);
    }
  }
}