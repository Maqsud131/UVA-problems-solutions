import java.util.Scanner;
public class UVA10189{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=1;
    while(sc.hasNext()){
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(n==0 && m==0)
        break;
      if(t>1)
        System.out.println();
      
      char graph[][] = new char[n+2][m+2];
      char board[][] = new char[n+2][m+2];
      
      sc.nextLine();
      for(int i=1;i<=n;i++){
        String s=sc.nextLine();
        for(int j=1;j<=m;j++){
          graph[i][j]=s.charAt(j-1);
        }
      }
      
      System.out.println("Field #"+t+":");
      for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
          int c=0;
          if(graph[i][j]=='.'){
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
            //board[i][j]==(char)c;
            System.out.print(c);
          }else{
            System.out.print('*');
            //board[i][j]=='*';
          }
        }
        System.out.println();
      }
      t++;
    }
  }
}