import java.util.Scanner;

public class UVA11498{
  
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    while(sc.hasNext()){
      int n= sc.nextInt();
      if(n==0)
        break;
      int x=sc.nextInt();
      int y=sc.nextInt();
      for(int c=0;c<n;c++){
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        
        if(x==x1 || y==y1)
          System.out.println("divisa");
        else if(x<x1 && y<y1)
          System.out.println("NE");
        else if(x<x1 && y>y1)
          System.out.println("SE");
        else if(x>x1 && y<y1)
          System.out.println("NO");
        else if(x>x1 && y>y1)
          System.out.println("SO");
      }
    }
  }
}
        