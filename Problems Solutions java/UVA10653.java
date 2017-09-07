import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class UVA10653{
  public static boolean graph[][];
  public static boolean color[][];
  public static int d[][];
  
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int r=sc.nextInt();
      int c=sc.nextInt();
      if(r==0)
        break;
      
      graph= new boolean[r+2][c+2];
      color= new boolean[r+2][c+2];
      d= new int[r+2][c+2];
      
      for(int i=0;i<r+2;i++){
        graph[i][0]=true;
        graph[i][c+1]=true;
      }
      for(int i=0;i<c+2;i++){
        graph[0][i]=true;
        graph[r+1][i]=true;
      }
      
      int in=sc.nextInt();
      for(int i=0;i<in;i++){
        int r1=sc.nextInt();
        int b=sc.nextInt();
        for(int j=0;j<b;j++){
          int c1=sc.nextInt();
          graph[r1+1][c1+1]=true;
        }
      }
      int sy=sc.nextInt();
      int sx=sc.nextInt();
      int dy=sc.nextInt();
      int dx=sc.nextInt();
      
      int re=bfs(sy+1,sx+1,dy+1,dx+1);
      System.out.println(re);
    }
  }
  public static int bfs(int sy, int sx, int dy, int dx){
    color[sy][sx]=true;
    int ux,uy;
    Queue<Integer> Q = new LinkedList<Integer>();
    Q.add(sy);
    Q.add(sx);
    while(Q.isEmpty()==false){
      uy=Q.remove();
      ux=Q.remove();
      if(uy==dy && ux==dx)
        return d[uy][ux];
      if(graph[uy-1][ux]==false && color[uy-1][ux]==false){
        color[uy-1][ux]=true;
        d[uy-1][ux]=d[uy][ux]+1;
        Q.add(uy-1);
        Q.add(ux);
      }
      if(graph[uy][ux-1]==false && color[uy][ux-1]==false){
        color[uy][ux-1]=true;
        d[uy][ux-1]=d[uy][ux]+1;
        Q.add(uy);
        Q.add(ux-1);
      }
      if(graph[uy+1][ux]==false && color[uy+1][ux]==false){
        color[uy+1][ux]=true;
        d[uy+1][ux]=d[uy][ux]+1;
        Q.add(uy+1);
        Q.add(ux);
      }
      if(graph[uy][ux+1]==false && color[uy][ux+1]==false){
        color[uy][ux+1]=true;
        d[uy][ux+1]=d[uy][ux]+1;
        Q.add(uy);
        Q.add(ux+1);
      }
    }
    return 0;
  }
}
    
    
    
  
  
  

      
      