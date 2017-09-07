import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVA260{
  public static char graph[][];
  public static boolean color[][];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int co=1;
    while(sc.hasNext()){
      int n = sc.nextInt();
      if(n==0)
        break;
      graph = new char[n+2][n+2];
      color = new boolean[n+2][n+2];
      for(int c=0;c<n+2;c++){
        graph[0][c]='p';
        graph[c][0]='p';
        graph[n+1][c]='p';
        graph[c][n+1]='k';
      }
      sc.nextLine();
      for(int i=1;i<=n;i++){
        String s = sc.nextLine();
        for(int j=0;j<n;j++){
          graph[i][j+1]=s.charAt(j);
        }
      }
       boolean wb=false; 
      for(int w=1;w<=n;w++){
        wb = bfsW(w);
        if(wb==true)
          break;
      }
      if(wb==true)
        System.out.println(co+" W");
      else
        System.out.println(co+" B");
      co++;
    }
  }
  
  public static boolean bfsW(int s){
    color[s][1]=true;
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(s);
    q.add(1);
    while(q.isEmpty()==false){
      int y=q.remove();
      int x=q.remove();
      
      //System.out.println(y+" "+x);
      
      if(graph[y-1][x-1]=='k')
        return true;
      if(graph[y-1][x-1]=='w' && color[y-1][x-1]==false){
        color[y-1][x-1]=true;
        q.add(y-1);
        q.add(x-1);
      }
      
      if(graph[y][x-1]=='k')
        return true;
      if(graph[y][x-1]=='w' && color[y][x-1]==false){
        color[y][x-1]=true;
        q.add(y);
        q.add(x-1);
      }
      
      if(graph[y-1][x]=='k')
        return true;
      if(graph[y-1][x]=='w' && color[y-1][x]==false){
        color[y-1][x]=true;
        q.add(y-1);
        q.add(x);
      }
      
      if(graph[y][x+1]=='k')
        return true;
      if(graph[y][x+1]=='w' && color[y][x+1]==false){
        color[y][x+1]=true;
        q.add(y);
        q.add(x+1);
      }
      
      if(graph[y+1][x]=='k')
        return true;
      if(graph[y+1][x]=='w' && color[y+1][x]==false){
        color[y+1][x]=true;
        q.add(y+1);
        q.add(x);
      }
      
      if(graph[y+1][x+1]=='k')
        return true;
      if(graph[y+1][x+1]=='w' && color[y+1][x+1]==false){
        color[y+1][x+1]=true;
        q.add(y+1);
        q.add(x+1);
      }
    }
    return false;
  }
}
    
    

          
        
        
        
        
      
      