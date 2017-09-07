import java.util.Scanner;
public class UVA10377{
  public static boolean graph[][];
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int te=sc.nextInt();
    for(int c=1;c<=te;c++){
      int r=sc.nextInt();
      int co=sc.nextInt();
      char d = 'N';
      graph = new boolean[r+2][co+2];
      
      sc.nextLine();
      for(int i=1;i<=r;i++){
        String s=sc.nextLine();
        //System.out.println(s);
        for(int j=0;j<s.length();j++){
          if(s.charAt(j)==' ')
            graph[i][j+1]=true;
        }
      }
      
      int y=sc.nextInt();
      int x=sc.nextInt();
      
      boolean t=false;
      while(r>0){
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='Q'){
            t = true;
            break;
          }else if(s.charAt(i)=='R'){
            if(d=='N')
              d='E';
            else if(d=='E')
              d='S';
            else if(d=='S')
              d='W';
            else if(d=='W')
              d='N';
          }else if(s.charAt(i)=='L'){
            if(d=='N')
              d='W';
            else if(d=='E')
              d='N';
            else if(d=='S')
              d='E';
            else if(d=='W')
              d='S';
          }else if(s.charAt(i)=='F'){
            if(d=='N'){
              if(graph[y-1][x]==true)
                y--;
            }else if(d=='E'){
              if(graph[y][x+1]==true)
                x++;
            }else if(d=='S'){
              if(graph[y+1][x]==true)
                y++;
            }else if(d=='W'){
              if(graph[y][x-1]==true)
                x--;
            }
          }
        }
        if(t==true)
          break;
      }
      
      System.out.println(y+" "+x+" "+d);
      if(c<te)
        System.out.println();
    }
  }
}
        
        