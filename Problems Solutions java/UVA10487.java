import java.util.Scanner;
public class UVA10487{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int cas=1;
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(n==0)
        break;
      int ar[] = new int[n];
      int sum[]= new int[(n*n-n)/2];
        
      for(int c=0;c<n;c++)
        ar[c]=sc.nextInt();
      int in=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            sum[in]=ar[i]+ar[j];
            in++;
        }
      }
      
      System.out.println("Case "+cas+":");
      int m=sc.nextInt();
      for(int c=0;c<m;c++){
        int q = sc.nextInt();
        int min =2147483647;
        int re=0;
        for(int i=0;i<sum.length;i++){
          if(Math.abs(sum[i]-q)<min){
            min=Math.abs(sum[i]-q);
            re=i;
          }
        }
        System.out.println("Closest sum to "+q+" is "+sum[re]+".");  
      }
      cas++;
    }
  }
}
          
          
        