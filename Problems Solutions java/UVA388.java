import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
public class UVA388{
  public static boolean graph[][];
  public static boolean color[];
  public static double gp[];
  public static int lv[];
  public static String ad[]={"0","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      int n=sc.nextInt();
      color = new boolean[27];
      graph = new boolean[27][27];
      gp = new double[27];
      lv = new int[27];
      sc.nextLine();
      for(int i=0;i<n;i++){
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String s1=st.nextToken();
        int u = (int)s1.charAt(0)-64;
        gp[u] = Double.parseDouble(st.nextToken());
        String w = st.nextToken();
        for(int j=0;j<w.length();j++){
          if(w.charAt(j)=='*'){
            graph[u][0]=true;
            graph[0][u]=true;
          }else{
            int p=(int)w.charAt(j)-64;
            graph[u][j]=true;
          }
        }
      }
      
      bfs(0);
      double m=0;
      int h=0;
      for(int i=1;i<27;i++){
        for(int j=0;j<lv[i];j++){
          gp[j]=gp[j]-(0.5*gp[j]);
        }
        if(gp[i]>m){
          m=gp[i];
          h=i;
        }
      }
      System.out.println("Import from "+ad[h]);
      }
    }
  
  
  public static void bfs(int s){
    color[s]=true;
    lv[s]=0;
    
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(s);
    while(q.isEmpty()==false){
      int u=q.remove();
      for(int i=1;i<27;i++){
        if(graph[u][i]==true && color[i]==false){
          color[i]=true;
          lv[i]=lv[u]+1;
          q.add(i);
        }
      }
    }
  }
}
            
          
          
    
    
    
    
    
    
      