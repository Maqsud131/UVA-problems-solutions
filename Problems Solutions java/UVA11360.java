import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA11360{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=Integer.parseInt(sc.nextLine());
    for(int c=1;c<=t;c++){
      int n=Integer.parseInt(sc.nextLine());
      int ar[][] = new int[n][n];
      for(int i=0;i<n;i++){
        String s =sc.nextLine();
        int l=0;
        for(int j=n-s.length();j<n;j++){
          ar[i][j]=s.charAt(l)-48;
          l++;
        }
      }
      int m=Integer.parseInt(sc.nextLine());
      for(int i=0;i<m;i++){
        String op = sc.nextLine();
        if(op.charAt(0)=='r'){
          StringTokenizer st = new StringTokenizer(op);
          st.nextToken();
          int a=Integer.parseInt(st.nextToken())-1;
          int b=Integer.parseInt(st.nextToken())-1;
          for(int j=0;j<n;j++){
            int te=ar[a][j];
            ar[a][j]=ar[b][j];
            ar[b][j]=te;
          }
        }else if(op.charAt(0)=='c'){
          StringTokenizer st = new StringTokenizer(op);
          st.nextToken();
          int a=Integer.parseInt(st.nextToken())-1;
          int b=Integer.parseInt(st.nextToken())-1;
          for(int j=0;j<n;j++){
            int te=ar[j][a];
            ar[j][a]=ar[j][b];
            ar[j][b]=te;
          }
        }else if(op.charAt(0)=='i'){
          for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
              ar[x][y]=(ar[x][y]+1)%10;
            }
          }
        }else if(op.charAt(0)=='d'){
          for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
              if(ar[x][y]-1<0)
                ar[x][y]=9;
              else
                ar[x][y]=ar[x][y]-1;
            }
          }
        }else if(op.charAt(0)=='t'){
          int as[][] = new int[n][n];
          for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
              as[y][x]=ar[x][y];
            }
          }
          ar=as;
        }    
      }
      System.out.println("Case #"+c);
      for(int x=0;x<n;x++){
        for(int y=0;y<n;y++){
          System.out.print(ar[x][y]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}



