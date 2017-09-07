import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class UVA1148{
  public static ArrayList<Integer> graph[];
  public static boolean color[];
  public static int dt[];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int n=sc.nextInt();
      
      graph = new ArrayList[n];
      color = new boolean[n];
      dt = new int[n];
        
      for(int i=0;i<n;i++)
        graph[i] = new ArrayList<Integer>();
      
      for(int i=0;i<n;i++){
        int u=sc.nextInt();
        int e=sc.nextInt();
        for(int j=0;j<e;j++){
          int v=sc.nextInt();
          graph[u].add(v);
        }
      }
      int u=sc.nextInt();
      int v=sc.nextInt();
      bfs(u, v);
      if(c<t-1)
        System.out.println();
    }
  }
  public static void bfs(int s, int d){
    color[s]=true;
    dt[s]=-1;
    Queue<Integer> Q = new LinkedList<Integer>();
    Q.add(s);
    while(Q.isEmpty()==false){
      int u=Q.remove();
      for(int i=0;i<graph[u].size();i++){
        int v=graph[u].get(i);
        if(color[v]==false){
          color[v]=true;
          dt[v]=dt[u]+1;
          Q.add(v);
          if(v==d){
            System.out.println(s+" "+d+" "+dt[v]);
            Q.clear();
            break;
          }
        }
      }
    }
  }
}