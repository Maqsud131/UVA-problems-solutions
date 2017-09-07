import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class UVA469{
  public static boolean graph[][];
  public static boolean color[][];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=sc.nextInt();
    sc.nextLine();
    sc.nextLine();
    for(int c=0;c<t;c++){
      StringTokenizer st;
      ArrayList<Integer> n = new ArrayList<Integer>();
      ArrayList<Integer> m = new ArrayList<Integer>();
      graph = new boolean[101][101];
      
      int x=0;
      int y=0;
      int h=1;
      while(sc.hasNext()){
        String s = sc.nextLine();
        if(s.length()<1)
          break;
        if(s.charAt(0)<75){
          st = new StringTokenizer(s);
          y=Integer.parseInt(st.nextToken());
          x=Integer.parseInt(st.nextToken());
          n.add(y);
          m.add(x);
        }else{
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W')
              graph[h][i+1]=true;
          }
          h++;
        }
      }
      for(int k=0;k<n.size();k++){
        color = new boolean[101][101];
        y=n.get(k);
        x=m.get(k);
        int area = bfs(x,y);
        System.out.println(area);
      }
    }
  }
  
  public static int bfs(int x, int y){
    color[y][x]=true;
    int co=1;
    Queue<Integer> q = new LinkedList();
    q.add(y);
    q.add(x);
    while(q.isEmpty()==false){
      int uy=q.remove();
      int ux=q.remove();
      if(graph[uy-1][ux-1]==true && color[uy-1][ux-1]==false){
        color[uy-1][ux-1]=true;
        co++;
        q.add(uy-1);
        q.add(ux-1);
      }
      if(graph[uy-1][ux]==true && color[uy-1][ux]==false){
        color[uy-1][ux]=true;
        co++;
        q.add(uy-1);
        q.add(ux);
      }
      if(graph[uy-1][ux+1]==true && color[uy-1][ux+1]==false){
        color[uy-1][ux+1]=true;
        co++;
        q.add(uy-1);
        q.add(ux+1);
      }
      if(graph[uy][ux-1]==true && color[uy][ux-1]==false){
        color[uy][ux-1]=true;
        co++;
        q.add(uy);
        q.add(ux-1);
      }
      if(graph[uy][ux+1]==true && color[uy][ux+1]==false){
        color[uy][ux+1]=true;
        co++;
        q.add(uy);
        q.add(ux+1);
      }
      if(graph[uy+1][ux-1]==true && color[uy+1][ux-1]==false){
        color[uy+1][ux-1]=true;
        co++;
        q.add(uy+1);
        q.add(ux-1);
      }
      if(graph[uy+1][ux]==true && color[uy+1][ux]==false){
        color[uy+1][ux]=true;
        co++;
        q.add(uy+1);
        q.add(ux);
      }    
      if(graph[uy+1][ux+1]==true && color[uy+1][ux+1]==false){
        color[uy+1][ux+1]=true;
        co++;
        q.add(uy+1);
        q.add(ux+1);
      }
    }
    return co;
  }
}
  