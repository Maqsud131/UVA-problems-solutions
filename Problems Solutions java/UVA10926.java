import java.util.Scanner;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class UVA10926{
  public static ArrayList<Integer> ar[];
  public static boolean tr[];
  public static int co;
  public static int m;
  public static int max;
  public static int p;
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(n==0)
        break;
      max=0;
      ar = new ArrayList[n+1];
      for(int c=0;c<=n;c++)
        ar[c] = new ArrayList<Integer>();
      for(int c=1;c<=n;c++){
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
          ar[c].add(sc.nextInt());
        }
      }
      for(int c=1;c<=n;c++){
        co=0;
        tr= new boolean[n+1];
        bfs(c);
        if(co>max){
          max=co;
          p=c;
        }
      }
      System.out.println(p);
    }
  }
  
  public static void bfs(int s){
    tr[s]=true;
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(s);
    while(q.isEmpty()==false){
     int u=q.remove();
     for(int c=0;c<ar[u].size();c++){
       if(tr[ar[u].get(c)]==false){
         tr[ar[u].get(c)]=true;
         q.add(ar[u].get(c));
         co++;
       }
     }
    }
  }
  //public static void dfs(int s){
 //   tr[s]=true;
//    co++;
//    if(ar[s].size()==0){
//      if(co>m)
 //       m=co;
//    }else{
///      for(int c=0;c<ar[s].size();c++){
//        if(tr[ar[s].get(c)]==false)
//          dfs(ar[s].get(c));
//      }
//    }
 //   co--;
//    tr[s]=false;
//  }
}
            