import java.util.Scanner;

public class UVA10684{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n = sc.nextInt();
      if(n==0)
        break;
      int tem=0;
      int max=0;
      int ar[] = new int[n];
      for(int c=0;c<n;c++){
        int v=sc.nextInt();
        if(v>0){
          tem=tem+v;
        }else{
          if(tem>max)
            max=tem;
          tem=tem+v;
          if(tem<0)
            tem=0;
        }
      }
      if(tem>max)
            max=tem;
      if(max>0)
        System.out.println("The maximum winning streak is "+max+".");
      else
        System.out.println("Losing streak.");
    }
  }
}