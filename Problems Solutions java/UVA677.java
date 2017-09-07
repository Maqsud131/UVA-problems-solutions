import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class UVA677{
  public static int graph[][];
  public static int dt[];
  public static boolean color[];
  public static int wa;
  public static ArrayList<Integer> path;
  public static boolean fl;
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean g=false;
    while(sc.hasNext()){
      if(g==true){
        sc.nextInt();
        System.out.println();
      }else{
        g=true;
      }
      int n=sc.nextInt();
      int w=sc.nextInt();
      
      graph = new int[n+1][n+1];
      dt = new int[n+1];
      color = new boolean[n+1];
      wa=w;
      path = new ArrayList<Integer>();
      fl=false;
      
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          graph[i][j]=sc.nextInt();
        } 
      }
      
      color[1]=true;
      dt[1]=0;
      path.add(1);
      if(w==0){
        System.out.println("(1)");
        fl=true;
      }else{  
        for(int i=1;i<=n;i++){
          if(color[i]==false && graph[1][i]==1)
            dfsV(1, i);
        }
      }
      if(fl==false)
        System.out.println("no walk of length "+w);
    }
  }
  
  public static void dfsV(int s,int n){
    dt[n]=dt[s]+1;
    color[s]=true;
    path.add(n);
    if(dt[n]==wa){
      String st="(";
      for(int i=0;i<path.size()-1;i++)
        st=st+path.get(i)+",";
      st=st+path.get(path.size()-1)+")";
      System.out.println(st);
      fl=true;
    }else{
      for(int i=1;i<dt.length;i++){
        if(color[i]==false && graph[n][i]==1)
          dfsV(n, i);
      }
    }
    color[s]=false;
    path.remove(path.size()-1);
    dt[n]=0;
  }
}
    