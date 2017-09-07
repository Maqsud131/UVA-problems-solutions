import java.util.Scanner;

public class UVA11764{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=1;c<=t;c++){
      int n =sc.nextInt();
      int l=0;
      int h=0;
      int p=sc.nextInt();
      for(int i=1;i<n;i++){
        int k=sc.nextInt();
        if(p>k)
          l++;
        else if(p<k)
          h++;
        p=k;
      }
      System.out.println("Case "+c+": "+h+" "+l);
    }
  }
}
