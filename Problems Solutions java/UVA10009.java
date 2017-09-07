import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UVA10009{
  public static ArrayList<String> graph[];
  public static ArrayList<String> city;
  public static boolean color[];
    
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int m=sc.nextInt();
      int n=sc.nextInt();
      
      //String rel[] = new String[m];
     // String qu[] = new String[n];
      city = new ArrayList<String>();
      graph = new ArrayList[26];
      color = new boolean[27];
      for(int i=0;i<26;i++)
        graph[i] = new ArrayList<String>();
       sc.nextLine();
      for(int i=0;i<m;i++){
        //rel[i]=sc.nextLine();
        String s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String u = st.nextToken();
        String v = st.nextToken();
        if(city.contains(u)==false)
          city.add(u);
        if(city.contains(v)==false)
          city.add(v);
        int ui=city.indexOf(u);
        int vi=city.indexOf(v);
        if(graph[ui].contains(v)==false)
          graph[ui].add(v);
        if(graph[vi].contains(u)==false)
          graph[vi].add(u);
      }
      for(int i=0;i<n;i++){
        //qu[i]=sc.nextLine();
        String s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String u = st.nextToken();
        String v = st.nextToken();   
        bfs(u, v);
        System.out.println();
      }
      if(c<t-1)
        System.out.println();
    }
  }
  
  public static void bfs(String so, String d){
    color = new boolean[27];
    int si=city.indexOf(so);
    int p[]=new int[27];
    p[si]=-1;
    int de=0;
    color[si]=true;
    Queue<String> Q = new LinkedList<String>();
    Q.add(so);
    while(Q.isEmpty()==false){
      String s=Q.remove();
      int ui=city.indexOf(s);
      for(int i=0;i<graph[ui].size();i++){
        int vi=city.indexOf(graph[ui].get(i));
        if(color[vi]==false){
          color[vi]=true;
          p[vi]=ui;
          Q.add(graph[ui].get(i));
          if(graph[ui].get(i).equals(d)){
            de=vi;
            i=graph[ui].size();
            Q.clear();
            break;
          }
        }
      }
    }
    String r =""+city.get(de).charAt(0);
    //System.out.println(r);
    while(p[de]>-1){
      //System.out.print(city.get(p[de]).charAt(0));
      r=r+city.get(p[de]).charAt(0);
      de=p[de];
    }
    for(int i=r.length()-1;i>=0;i--)
      System.out.print(r.charAt(i));
  }
}
    
      
      
      