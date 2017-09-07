import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVA11094{
  public static char ar[][];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder(); 
    while(sc.hasNext()){
      int y=sc.nextInt();
      int x=sc.nextInt();
      ar= new char[x][y+2];
      int n1=0;
      int n2=0;
      sc.nextLine();
      for(int c=1;c<=y;c++){
        String s = sc.nextLine();
        for(int c1=0;c1<s.length();c1++){
          ar[c1][c]=s.charAt(c1);
        }
      }  
      int y1=sc.nextInt();
      int x1=sc.nextInt();
      int co=0;
      char ch=ar[x1][y1+1];
      //System.out.println(ch);
      bfs(x1,y1+1);
      for(int c=1;c<=y;c++){
        for(int c1=0;c1<x;c1++){
          if(ar[c1][c]==ch){
            //System.out.println(ch);
            int cu=bfs(c1,c);
            if(cu>co)
              co=cu;
          }
        }
      }   
      System.out.println(co);
    }
  }
  
  public static int bfs(int x, int y){
    char ch=ar[x][y];
    char cn=(char)((int)ch+1);
    //System.out.println(ch+" "+cn);
    int c=1;
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(x);
    q.add(y);
    ar[x][y]=cn;
    while(q.isEmpty()==false){
      x=q.remove();
      y=q.remove();
      //System.out.println(x+" "+y+" "+ar[x][y]);
      if(x==0){
        if(ar[ar.length-1][y]==ch){
          q.add(ar.length-1);
          q.add(y);
          ar[ar.length-1][y]=cn;
          c++;
        }
      }else{
        if(ar[x-1][y]==ch){
          q.add(x-1);
          q.add(y);
          ar[x-1][y]=cn;
          c++;
          //System.out.println("le");
        }
      }
      if(ar[x][y-1]==ch){
        q.add(x);
        q.add(y-1);
        ar[x][y-1]=cn;
        c++;
       // System.out.println("to");
      }
      if(x==ar.length-1){
        if(ar[0][y]==ch){
          //System.out.println("re");
          q.add(0);
          q.add(y);
          ar[0][y]=cn;
          c++;
        }
      }else{
        if(ar[x+1][y]==ch){
          //System.out.println("re");
          q.add(x+1);
          q.add(y);
          ar[x+1][y]=cn;
          c++;
        }
      }
      if(ar[x][y+1]==ch){
        q.add(x);
        q.add(y+1);
        ar[x][y+1]=cn;
        c++;
       // System.out.println("bo");
      }
    }
    return c;
  }
}