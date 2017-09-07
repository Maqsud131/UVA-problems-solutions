import java.util.Scanner;
import java.util.Arrays;

public class UVA11364{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int c = 0; c<t; c++){
      int n = sc.nextInt();
      int ar[] = new int[n];
      ar[0]=sc.nextInt();
      int mi=ar[0];
      int ma=ar[0];
      for(int i=1;i<n;i++){
        ar[i]=sc.nextInt();
        if(ar[i]>ma)
          ma=ar[i];
        if(ar[i]<mi)
          mi=ar[i];
      }
      //Arrays.sort(ar);
      
      int d =2*(ma-mi); //2*(ar[n-1]-ar[0]);
      
      System.out.println(d);
    }
  }
}