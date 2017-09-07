import java.util.Scanner;
import java.util.Stack;
public class UVA116{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    while(sc.hasNext()){
      int r=sc.nextInt();
      int c=sc.nextInt();
      
      long ar[][]=new long[r][c]; //= new int[r][c];
      int di[][]=new int[r][c]; //= new int[r][c];
      //printf("%d %d\n",r,c);
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
          ar[i][j]=sc.nextInt();
          //printf("%d %d\n",r,c);
        }
      }
      if(r==1){
        long m=0;
        for(int i=0;i<c-1;i++){
          m=m+ar[0][i];
          System.out.print("1 ");
        }
        m=m+ar[0][c-1];
        System.out.println("1");
        System.out.println(m);
      }else if(c==1){
        long m=ar[0][0];
        int p=0;
        for(int i=1;i<r;i++){
          if(m>ar[i][0]){
            m=ar[i][0];
            p=i;
          }
        }
        System.out.println(p+1);
        System.out.println(m);
      }else{
        for(int l=c-2;l>=0;l--){
          if(ar[0][l+1]<=ar[1][l+1] && ar[0][l+1]<=ar[r-1][l+1]){//
            ar[0][l]=ar[0][l+1]+ar[0][l];
            di[0][l]=0;
          }else if(ar[0][l+1]>=ar[1][l+1] && ar[r-1][l+1]>=ar[1][l+1]){
            ar[0][l]=ar[1][l+1]+ar[0][l];
            di[0][l]=1;
          }else{
            ar[0][l]=ar[r-1][l+1]+ar[0][l];
            di[0][l]=r-1;
          }
          //System.out.println(ar[0][l]);
          for(int k=1;k<r-1;k++){
            if(ar[k-1][l+1]<=ar[k][l+1] && ar[k-1][l+1]<=ar[k+1][l+1]){
              ar[k][l]=ar[k][l]+ar[k-1][l+1];
              di[k][l]=k-1;
            }else if(ar[k][l+1]<=ar[k-1][l+1] && ar[k][l+1]<=ar[k+1][l+1]){
              ar[k][l]=ar[k][l]+ar[k][l+1];
              di[k][l]=k;
            }else{
              ar[k][l]=ar[k][l]+ar[k+1][l+1];
              di[k][l]=k+1;
            }
            //System.out.println(ar[k][l]);
          }
          
          if(ar[0][l+1]<=ar[r-1][l+1] && ar[0][l+1]<=ar[r-2][l+1]){
            ar[r-1][l]=ar[0][l+1]+ar[r-1][l];
            di[r-1][l]=0;
          }else if(ar[r-1][l+1]>=ar[r-2][l+1] && ar[r-2][l+1]<=ar[0][l+1]){
            ar[r-1][l]=ar[r-2][l+1]+ar[r-1][l];
            di[r-1][l]=r-2;
          }else{
            ar[r-1][l]=ar[r-1][l+1]+ar[r-1][l];
            di[r-1][l]=r-1;
          }
          //System.out.println(ar[r-1][l]);
          //System.out.println("--");
        }
        
        long m=107374182499L;
        int p=0;
        for(int i=0;i<r;i++){
          if(ar[i][0]<m){
            m=ar[i][0];
            p=i;
          }
          //System.out.println(ar[i][c-1]);
        }
        
        //Stack<Integer> mys = new Stack<Integer>();
        //mys.push(p);
        //for(int i=c-1;i>=0;i--){
        /// p=di[p][i];
         // mys.push(p);
       // }
       // mys.pop();
        System.out.print((p+1)+" ");
        for(int i=0;i<c-2;i++){
          p=di[p][i];//mys.pop()+1;
          System.out.print((p+1)+" ");
        }
        System.out.println((di[p][c-2]+1));
        //int w=(mys.pop()+1);
        //System.out.println(w);
        System.out.println(m);
      }
    }
  }
}