import java.util.Scanner;
public class UVA10451{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int c=1;
    while(sc.hasNext()){
      double n = sc.nextDouble();
      double a = sc.nextDouble();
      
      double ra = Math.toRadians(360/n);
      
      double rO =Math.sqrt(a*2/(Math.sin(ra)*n));
      
      ra = Math.toRadians(180/n);
      
      double rI =Math.sqrt(a/(n*Math.tan(ra)));
      
      double arO = Math.PI*rO*rO;
      arO=arO-a;
      
      double arI = Math.PI*rI*rI;
      arI = a-arI;
      
      if(n==0)
        System.out.printf("Case "+c+": "+"0.54226 0.25314\n");
      else
        System.out.printf("Case "+c+": "+"%.5f %.5f\n",arO,arI);
      c++;
    }
  }
}

      