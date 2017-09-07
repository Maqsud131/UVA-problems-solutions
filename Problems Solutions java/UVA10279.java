import java.util.Scanner;
public class UVA10279{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=sc.nextInt();
    for(int p=0;p<t;p++){
      int n=sc.nextInt();
      if(p>0)
        System.out.println();
      
      char graph[][] = new char[n+2][n+2];
      char board[][] = new char[n][n];
      
      sc.nextLine();
      for(int i=1;i<=n;i++){
        String s=sc.nextLine();
        for(int j=1;j<=n;j++){
          graph[i][j]=s.charAt(j-1);
          board[i-1][j-1]='.';
        }
      }
      
      boolean expl = false;

      for(int i=1;i<=n;i++){
        String s=sc.nextLine();
        for(int j=1;j<=n;j++){
          int c=0;
          if(s.charAt(j-1)=='x'){
            if(graph[i][j]=='*'){
              expl=true;
            }else{
              if(graph[i-1][j-1]=='*')
                c=c+1;
              if(graph[i-1][j]=='*')
                c=c+1;
              if(graph[i-1][j+1]=='*')
                c=c+1;
              if(graph[i][j-1]=='*')
                c=c+1;
              if(graph[i][j+1]=='*')
                c=c+1;
              if(graph[i+1][j-1]=='*')
                c=c+1;
              if(graph[i+1][j]=='*')
                c=c+1;
              if(graph[i+1][j+1]=='*')
                c=c+1;
              String o=""+c;
              board[i-1][j-1]=o.charAt(0);
            }
          }
        }
      }
      if(expl==true){
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(graph[i][j]=='*')
              board[i-1][j-1]='*';
          }
        }
      }
      
      for(int i=0;i<n;i++){
        System.out.println(board[i]);
      }
    }
  }
}