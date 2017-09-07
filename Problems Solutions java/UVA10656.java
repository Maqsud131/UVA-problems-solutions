import java.util.Scanner;
public class UVA10656{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(n==0)
        break;
      int arr[] = new int[n];
      int p=0;
      for(int c=0;c<arr.length;c++){
        int x=sc.nextInt();
        if(x!=0){
          //System.out.println(p+" "+c);
          arr[p]=x;
          p++;
        }
      }
      System.out.print(arr[0]);
      for(int c=1;c<p;c++)
        System.out.print(" "+arr[c]);
      System.out.println();
    }
  }
}
        
    