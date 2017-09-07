import java.util.Scanner;
public class UVA11942{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int ar[] = new int[10];
    int n=sc.nextInt();
    System.out.println("Lumberjacks:");
    for(int c=0;c<n;c++){
      for(int i=0;i<10;i++){
        ar[i]=sc.nextInt();
      }
      
      boolean t = false;
      boolean e = false;
      
      if(ar[0]>ar[1])
        t=true;
      for(int i=0;i<9;i++){
        if(ar[i]>ar[i+1] && t==false){
          System.out.println("Unordered");
          e=true;
          break;
        }else if(ar[i]<ar[i+1] && t==true){
          System.out.println("Unordered");
          e=true;
          break;
        }
      }
      if(e==false)
        System.out.println("Ordered");
    }
  }
}
          
          
          
          
          
          
      