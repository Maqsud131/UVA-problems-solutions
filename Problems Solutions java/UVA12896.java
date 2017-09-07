import java.util.Scanner;

public class UVA12896{
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
    ar[3][1]='d';
    ar[3][2]='e';
    ar[3][3]='f';
    ar[4][1]='g';
    ar[4][2]='h';
    ar[4][3]='i';
    ar[5][1]='j';
    ar[5][2]='k';
    ar[5][3]='l';
    ar[6][1]='m';
    ar[6][2]='n';
    ar[6][3]='o';
    ar[7][1]='p';
    ar[7][2]='q';
    ar[7][3]='r';
    ar[7][4]='s';
    ar[8][1]='t';
    ar[8][2]='u';
    ar[8][3]='v';
    ar[9][1]='w';
    ar[9][2]='x';
    ar[9][3]='y';
    ar[9][4]='z';
    ar[0][1]=' ';
    
    int t = sc.nextInt();
    for(int c=0;c<t;c++){
      int l = sc.nextInt();
      int m1[] = new int[l];
      int m2[] = new int[l];
      
      for(int i=0;i<l;i++)
        m1[i]=sc.nextInt();
      for(int i=0;i<l;i++)
        m2[i]=sc.nextInt();
      
      String s="";
      for(int i=0;i<l;i++)
        s=s+ar[m1[i]][m2[i]];
      System.out.println(s);
    }
  }
}