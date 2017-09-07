import java.util.Scanner;
public class UVA10812{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int c=0;c<t;c++){
      int s=sc.nextInt();
      int d=sc.nextInt();
      
      if(d>s){
        System.out.println("impossible");
      }else{
        int a=(s+d)/2;
        if((s+d)%2==0 && (s-d)%2==0)
          System.out.println(a+" "+(s-a));
        else
          System.out.println("impossible");
      }
    }
  }
}