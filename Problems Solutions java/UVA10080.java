import java.util.Scanner;
import java.util.ArrayList;

public class UVA10080{
  public static boolean flag[];
  public static ArrayList<Integer> gr[];
  public static  int gL[];
  public  static int hR[];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int g = sc.nextInt();
      int h = sc.nextInt();
      double s = sc.nextDouble();
      double v = sc.nextDouble();
      
      double gi[][] = new double[g][2];
      double hi[][] = new double[h][2];
      gr = new ArrayList[g];
      
      for(int i=0;i<g;i++){
        gi[i][0]=sc.nextDouble();
        gi[i][1]=sc.nextDouble();
      }
      for(int i=0;i<h;i++){
        hi[i][0]=sc.nextDouble();
        hi[i][1]=sc.nextDouble();
      }
      
      for(int i=0;i<g;i++){
        gr[i] = new ArrayList<Integer>();
        for(int j=0;j<h;j++){
          
          double d = Math.sqrt(Math.pow((gi[i][0]-hi[j][0]),2)+Math.pow((gi[i][1]-hi[j][1]),2));
          double o = d/v;
          if(o<=s){
            gr[i].add(j);
          }
        }
      }
        //System.out.println(  
      gL = new int[g];
      hR = new int[h];
      for(int i=0;i<g;i++)
        gL[i]=-1;
      for(int i=0;i<h;i++)
        hR[i]=-1;
      int count=0;
      for(int i=0;i<g;i++){
        flag = new boolean[h];
        if(matching(i)==true)
          count++;
      }
      System.out.println(g-count);
    }
  }
  
  
  public static boolean matching(int u){
    for(int i=0;i<gr[u].size();i++){
     int v = gr[u].get(i);
     if(flag[v]==false){
       //System.out.println("k");
       flag[v]=true;
       if(hR[v]==-1 || matching(hR[v])){
         hR[v]=u;
         gL[u]=v;
         return true;
       }
     } 
    }
    return false;
  }
}