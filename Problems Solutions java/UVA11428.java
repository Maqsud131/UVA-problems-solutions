import java.util.Scanner;
import java.util.Arrays;
public class UVA11428{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int ar[] = new int[61];
    for(int c=0;c<61;c++)
      ar[c]=c*c*c;
    
    while(sc.hasNext()){
      int n = sc.nextInt();
      if(n==0)
        break;
      boolean t=false;
      for(int i=1;i<61;i++){
        int y=n+ar[i];
        int x=Arrays.binarySearch(ar, y);
        if(x>0){
          System.out.println(x+" "+i);
          t=true;
          break;
        }
      }
      
      if(t==false)
        System.out.println("No solution");
     // System.out.println(Arrays.binarySearch(ar, 27));
    }
  }
}
       