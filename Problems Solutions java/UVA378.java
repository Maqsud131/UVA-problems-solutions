import java.util.Scanner;

public class UVA378{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    System.out.println("INTERSECTING LINES OUTPUT");
    for(int c=1;c<=t;c++){
      double x1=sc.nextInt();
      double y1=sc.nextInt();
      double x2=sc.nextInt();
      double y2=sc.nextInt();
      double x3=sc.nextInt();
      double y3=sc.nextInt();
      double x4=sc.nextInt();
      double y4=sc.nextInt();
      
      double a1 = -(y1-y2)/(x1-x2);
      double b1 = 1.0;
      double c1 = -(a1*x1)-y1;
      
      double a2 = -(y3-y4)/(x3-x4);;
      double b2 = 1.0;
      double c2 = -(a2*x3)-y3;
      if(x1==x2 && x3==x4){
        if(x1!=x3)
          System.out.println("NONE");
        else
          System.out.println("LINE");
      }else if(y1==y2 && y3==y4){
        if(y1!=y3)
          System.out.println("NONE");
        else
          System.out.println("LINE");
      }else if(a1==a2 && b1==b2){
        if(c1==c2)
          System.out.println("LINE");
        else
          System.out.println("NONE");
      }else{
        double z=(a2*b1-a1*b2);
        double x=(b2*c1-b1*c2)/z;
        double y=0;
        if(x1==x2) x=x1; 
        if(x3==x4) x=x3;
        
        if(b1>0) y = -(a1*x+c1);
        else y=-(a2*x+c2);
        if(y1==y2) y=y1; 
        if(y3==y4) y=y3;
        x=Math.round(x*100.0)/100.0;
        y=Math.round(y*100.0)/100.0;
        String xs=""+x;
        String ys=""+y;
        if(xs.charAt(xs.length()-3)!='.')
          xs=xs+"0";
        if(ys.charAt(ys.length()-3)!='.')
          ys=ys+"0";
        System.out.println("POINT "+xs+" "+ys);
      }
    }
    System.out.println("END OF OUTPUT");
  }
}