import java.util.Scanner;
public class UVA11078{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int n=sc.nextInt();
      
      int ar[] = new int[n];
      
      int m=-999999;
      int s=0;
      ar[0]=sc.nextInt();
      for(int i=1;i<n;i++){
        ar[i]=sc.nextInt();
        if(ar[s]-ar[i]>m)
          m=ar[s]-ar[i];
        if(ar[i]>ar[s])
          s=i;
      } 
      System.out.println(m);
    }
  }
}
        
      
      