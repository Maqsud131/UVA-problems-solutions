import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class UVA924{
  public static ArrayList<Integer> graph[];
  public static boolean color[];
  public static int dt[];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
      int e=sc.nextInt();
      
      graph = new ArrayList[e];
      color = new boolean[e];
      dt = new int[e];
        
      for(int i=0;i<e;i++)
        graph[i] = new ArrayList<Integer>();
      
      for(int i=0;i<e;i++){
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
          int v=sc.nextInt();
          graph[i].add(v);
        }
      }
      int t=sc.nextInt();
      for(int i=0;i<t;i++){
        color=new boolean[e];
        dt=new int[e];
        int r=sc.nextInt();
        bfs(r);
      }
  }
  public static void bfs(int s){
    color[s]=true;
    dt[s]=1;
    int mbo=graph[s].size();;
    int tp=0;
    int lv=1;
    int l=1;
    Queue<Integer> Q = new LinkedList<Integer>();
    Q.add(s);
    while(Q.isEmpty()==false){
      int u=Q.remove();
      if(lv!=dt[u]){
        if(tp>mbo){
          mbo=tp;
          l=lv;
        }
        lv=dt[u];
        tp=0;
      }
      for(int i=0;i<graph[u].size();i++){
        int v=graph[u].get(i);
        if(color[v]==false){
          tp=tp+1;
          color[v]=true;
          dt[v]=dt[u]+1;
          Q.add(v);
        }
      }
    }
    if(mbo==0)
      System.out.println(0);
    else
      System.out.println(mbo+" "+l);
  }
}