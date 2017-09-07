import java.util.Scanner;
public class UVA11530{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    char ar[][] = new char[10][5];
    ar[1][1]='.';
    ar[1][2]=',';
    ar[1][3]='?';
    ar[1][4]='"';
    ar[2][1]='a';
    ar[2][2]='b';
    ar[2][3]='c';
    ar[2][4]='D';
    ar[3][1]='d';
    ar[3][2]='e';
    ar[3][3]='f';
    ar[3][4]='D';
    ar[4][1]='g';
    ar[4][2]='h';
    ar[4][3]='i';
    ar[4][4]='V';
    ar[5][1]='j';
    ar[5][2]='k';
    ar[5][3]='l';
    ar[5][4]='P';
    ar[6][1]='m';
    ar[6][2]='n';
    ar[6][3]='o';
    ar[6][4]='A';
    ar[7][1]='p';
    ar[7][2]='q';
    ar[7][3]='r';
    ar[7][4]='s';
    ar[8][1]='t';
    ar[8][2]='u';
    ar[8][3]='v';
    ar[8][4]='A';
    ar[9][1]='w';
    ar[9][2]='x';
    ar[9][3]='y';
    ar[9][4]='z';
    ar[0][1]=' ';
    ar[0][2]='S';
    ar[0][3]='D';
    ar[0][4]='B';
    int t = sc.nextInt();
    sc.nextLine();
    for(int c=1;c<=t;c++){
      String s = sc.nextLine();
      //System.out.println(s);
      int co=0;
      
      for(int z=0;z<s.length();z++){ 
        for(int i=0;i<10;i++){
          for(int j=1;j<5;j++){
            //System.out.println(ar[i][j]);
            if(s.charAt(z)==ar[i][j]){
              co=co+j;
              break;
            }
          }
        }
      }
      
      System.out.println("Case #"+c+": "+co);
    }
  }
}