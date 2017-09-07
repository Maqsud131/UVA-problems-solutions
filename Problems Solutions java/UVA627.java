import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;


public class UVA627{
  public static boolean color[];
  public static boolean graph[][];
  public static int p[];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      graph = new boolean[300][300];
      int n = sc.nextInt();
      sc.nextLine();
      for(int c=0;c<n;c++){
        String s = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(s, "-");
        int u=Integer.parseInt(st.nextToken());
        if(st.hasMoreTokens()){
          s=st.nextToken();
          st = new StringTokenizer(s, ",");
          while(st.hasMoreTokens()){
            int x=Integer.parseInt(st.nextToken());
            graph[u][x]=true;
          }
        }
      }
      System.out.println("-----");
      int m=sc.nextInt();
      for(int c=0;c<m;c++){
        p=new int[300];
        color= new boolean[300];
        int s = sc.nextInt();
        int d = sc.nextInt();
        boolean t = bfs(s, d);
        if(t==false){
          System.out.println("connection impossible");
        }else{
          String s1 = ""+d;
          int l=d;
          while(c>-1){
            if(p[l]==-1)
              break;
            s1=p[l]+" "+s1;
            l=p[l];
          }
          System.out.println(s1);
        }
      }
      
    }
  }
    
    public static boolean bfs(int s, int d){
      color[s]=true;
      p[s]=-1;
      
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(s);
      while(q.isEmpty()==false){
        int u = q.remove();
        for(int i=0;i<color.length;i++){
          if(graph[u][i]==true && color[i]==false){
            color[i]=true;
            p[i]=u;
            if(i==d)
              return true;
            q.add(i);
          }
        }
      }
      return false;
    }
}
          
        
        
        