import java.util.Scanner;
public class UVA10347{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      double x=sc.nextDouble();
      double y=sc.nextDouble();
      double z=sc.nextDouble();
      
      double r = 2*(x*x*y*y+x*x*z*z+z*z*y*y)-(x*x*x*x+y*y*y*y+z*z*z*z);
      
      if(r<=0){
        r=-1.000;
        System.out.printf("%.3f\n",r);
      }else{
        r=(1/3.00)*Math.sqrt(r);
        System.out.printf("%.3f\n",r);
      }
    }
  }
}
      
      