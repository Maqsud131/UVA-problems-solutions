import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA11646{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=1;
    while(sc.hasNext()){
      
    StringTokenizer st = new StringTokenizer(sc.nextLine());
    double a = Integer.parseInt(st.nextToken());
    st.nextToken();
    double b = Integer.parseInt(st.nextToken());
    double O=2*Math.atan(b/a);
    double l = 200/((O*Math.sqrt(a*a+b*b)/(2*a))+1);
    double w = l*b/a;
    System.out.println("Case "+t+": "+l+" "+w);
    t++;
    }
  }
}