import java.util.Scanner;
public class UVA10013{               //done in c++ below
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int c=0;c<t;c++){
      int m = sc.nextInt();
      int c1[] = new int[m];
      int c2[] = new int[m];
      
      for(int i=0;i<m;i++){
        c1[m-i-1]=sc.nextInt();
        c2[m-i-1]=sc.nextInt();
      }
      
      int l=0;
      for(int i=0;i<m;i++){
        c1[i]=c1[i]+c2[i]+l;
        if(c1[i]>9){
          l=c1[i]/10;
          c1[i]=c1[i]%10;
        }else{
          l=0;
        }
      }
      
      for(int i=m-1;i>=0;i--)
        System.out.print(c1[i]);    
      System.out.println();
      if(c<t-1)
        System.out.println();
    }
  }
}



/*#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
  int t,m;
  scanf("%d",&t);
    for(int c=0;c<t;c++){
      scanf("%d",&m);
      int c1[m];
      int c2[m];
      
      for(int i=0;i<m;i++){
        scanf("%d %d",&c1[m-i-1],&c2[m-i-1]);
      }
      
      int l=0;
      for(int i=0;i<m;i++){
        c1[i]=c1[i]+c2[i]+l;
        if(c1[i]>9){
          l=c1[i]/10;
          c1[i]=c1[i]%10;
        }else{
          l=0;
        }
      }
      
      for(int i=m-1;i>=0;i--)
        printf("%d",c1[i]);    
      printf("\n");
      if(c<t-1)
        printf("\n");
    }
 return 0;
} */