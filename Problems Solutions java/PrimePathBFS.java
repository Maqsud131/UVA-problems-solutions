import java.util.*;
public class PrimePathBFS{
  public static int d[];
  public static int color[];
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    boolean ar[] =new boolean[9999];
    for(int c=2;c<=Math.sqrt(9999);c++){
      if(ar[c]==false){
        for(int c1=c*c;c1<9999;c1=c1+c)
          ar[c1]=true;
      }
    }
    
    ArrayList<Integer>[] graph = new ArrayList[9999];
    for(int i=1000;i<9999;i++){
      if(graph[i]==null)
      graph[i] = new ArrayList();
      String a=""+i;
      if(ar[i]==false){
        for(int j=i-1;j>1000;j--){
          int c=0;
          if(ar[j]==false){
            String b=""+j;
            for(int s=0;s<4;s++){
              if(a.charAt(s)!=b.charAt(s))
                c++;
            }
            if(c==1){
              if(graph[j]==null)
              graph[j] = new ArrayList();
              graph[i].add(j);
              graph[j].add(i);
            }
          }
        }
      }
    }
    int cas=sc.nextInt();
    for(int p=0;p<cas;p++){
      int str = sc.nextInt();
      int end = sc.nextInt();
      int x = lengths(graph, str, end);
      if(str==end)
        System.out.println(0);
      else if(x==-1)
        System.out.println("Impossible");
      else
        System.out.println(x+1);
      
      
     /* for(int c=1000;c<9999;c++){       //*** for checking whether  correct graph has formed or not :v ***
        if(ar[c]==false){
          System.out.print(c+"--");
          for(int i=0;i<graph[c].size();i++){
              System.out.print(" "+graph[c].get(i));
          }
          System.out.println();
        }
      }*/
         
      
      
      
    }
  }
    
    
  public static int lengths(ArrayList<Integer>[] adjList, int sourceNode, int e)
 {
   int u;
   int v;
   color=new int[adjList.length];
   d=new int[adjList.length];
   Queue<Integer> Q = new LinkedList<Integer>();
   color[sourceNode]=1;
   Q.add(sourceNode);
   d[sourceNode]=0;
   
   while(Q.size()>0){
     u=Q.remove();
     for(int c=0;c<adjList[u].size();c++){
       v= adjList[u].get(c);
       if(color[v]==0){
         if(v==e){
           return d[u];
         }
         color[v]=1;
         d[v]=d[u]+1;
         Q.add(v);
       }
     }
   }
    return -1; 
 }
}