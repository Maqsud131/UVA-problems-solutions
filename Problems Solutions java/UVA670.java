import java.util.Scanner;
import java.util.ArrayList;

public class UVA670{
  public static boolean flag[];
  public static ArrayList<Integer> gr[];
  public static  int nL[];
  public  static int mR[];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int n=sc.nextInt();
      int m=sc.nextInt();
      
      int ni[][] = new int[n][2];
      int mi[][] = new int[m][2];
      
      gr = new ArrayList[n];
      
      for(int i=0;i<n;i++){
        ni[i][0]=sc.nextInt();
        ni[i][1]=sc.nextInt();
      }
      for(int i=0;i<m;i++){
        mi[i][0]=sc.nextInt();
        mi[i][1]=sc.nextInt();
      }
      
      for(int i=n-1;i>0;i--){
        gr[i] = new ArrayList<Integer>();
        for(int j=0;j<m;j++){
          double d1 = Math.sqrt(Math.pow((ni[i][0]-mi[j][0]),2)+Math.pow((ni[i][1]-mi[j][1]),2)); 
          double d2 = Math.sqrt(Math.pow((ni[i-1][0]-mi[j][0]),2)+Math.pow((ni[i-1][1]-mi[j][1]),2));
          double d = Math.sqrt(Math.pow((ni[i-1][0]-ni[i][0]),2)+Math.pow((ni[i-1][1]-ni[i][1]),2));
          if(d1+d2<=2*d){
            //System.out.println(j);
            gr[i].add(j);
          }
        }
      }
      
      nL = new int[n];
      mR = new int[m];
      
      for(int i=0;i<n;i++)
        nL[i]=-1;
      for(int i=0;i<m;i++)
        mR[i]=-1;
      int count=0;
      for(int i=n-1;i>0;i--){
        flag = new boolean[m];
        if(matching(i)==true)
          count++;
      }
      
      System.out.println(count+n);
      System.out.print(ni[0][0]+" "+ni[0][1]+" ");
      for(int i=1;i<n;i++){
        if(nL[i]!=-1)
          System.out.print(mi[nL[i]][0]+" "+mi[nL[i]][1]+" ");
        if(i<n-1)
          System.out.print(ni[i][0]+" "+ni[i][1]+" ");
        //if(nL[i]!=-1)
          //System.out.print(mi[nL[i]][0]+" "+mi[nL[i]][1]+" ");
      }
      System.out.println(ni[n-1][0]+" "+ni[n-1][1]);
      if(c<t-1)
        System.out.println();
    }
  }
  
   public static boolean matching(int u){
     //System.out.println(u);
    for(int i=0;i<gr[u].size();i++){
     int v = gr[u].get(i);
     if(flag[v]==false){
       //System.out.println("k");
       flag[v]=true;
       if(mR[v]==-1 || matching(mR[v])){
         mR[v]=u;
         nL[u]=v;
         return true;
       }
     } 
    }
    return false;
  }
}
        
        
        