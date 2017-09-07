import java.util.Scanner;
public class UVA1260{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int n=sc.nextInt();
      int ar[] = new int[n];
      for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
      }
      int b=0;
      for(int i=1;i<n;i++){
        for(int j=i-1;j>=0;j--){
          if(ar[j]<=ar[i])
            b++;
        }
      }
      System.out.println(b);
    }
  }
}