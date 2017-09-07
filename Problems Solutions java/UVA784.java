import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVA784{
  public static char ar[][];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    StringBuilder sb = new StringBuilder(); 
    sc.nextLine();
    for(int c=0;c<t;c++){
      int x=0;
      int y=0;
      ar= new char[80][30];
      int l[] = new int[30];
      String b ="";
      int h=0;
      while(sc.hasNext()){
        String s = sc.nextLine();
        l[h]=s.length();
        if(s.charAt(0)=='_'){
          b=s;
          break;
        }
        for(int c1=0;c1<s.length();c1++){
          if(s.charAt(c1)=='*'){
            x=c1;
            y=h;
          }
          ar[c1][h]=s.charAt(c1);
        }
        h++;
      }
      bfs(x,y);
      for(int c1=0;c1<h;c1++){
        String se="";
        for(int c2=0;c2<l[c1];c2++)
          se=se+ar[c2][c1];
        sb.append(se+"\n");
      }
      sb.append(b+"\n");
    }
    System.out.print(sb);
  }
  
  public static void bfs(int x, int y){
    ar[x][y]='#';
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(x);
    q.add(y);
    while(q.isEmpty()==false){
      x=q.remove();
      y=q.remove();
      //System.out.println(x+" "+y+" "+ar[x][y]);
      if(ar[x-1][y]==' '){
        q.add(x-1);
        q.add(y);
        ar[x-1][y]='#';
      }
      if(ar[x][y-1]==' '){
        q.add(x);
        q.add(y-1);
        ar[x][y-1]='#';
      }
      if(ar[x+1][y]==' '){
        q.add(x+1);
        q.add(y);
        ar[x+1][y]='#';
      }
      if(ar[x][y+1]==' '){
        q.add(x);
        q.add(y+1);
        ar[x][y+1]='#';
      }
    }
  }
}
    
           
    
      
      
      
      
      