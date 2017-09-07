import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVA10976{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(n==0)
        break;
      
      Queue<Integer> q = new LinkedList<Integer>();
   
      int a=n*(n+1);
      for(int i=n+1;i<=n*2;i++){
          double v=1.00*(n*i)/(i-n);
          int j =(n*i)/(i-n);
          int y=(int)v;
          v=v-y;
          if(v==0){
            q.add(j);
            q.add(i);
        }
      }
      int p=q.size()/2;
      System.out.println(p);
      for(int i=0;i<p;i++){
        int u=q.remove();
        int b=q.remove();
        System.out.println("1/"+n+" = 1/"+u+" + 1/"+b);
      }
    }
  }
}