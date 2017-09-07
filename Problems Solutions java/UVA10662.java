import java.util.Scanner; 

public class UVA10662{
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext()){
      int t=sc.nextInt();
      int r=sc.nextInt();
      int h=sc.nextInt();
      
      int tr[]=new int[t];
      int re[]=new int[r];
      int ho[]=new int[h];
      
      int tra[][] = new int[t][r];
      int res[][] = new int[r][h];
      int hot[][] = new int[h][t];
      
      
      
      for(int c=0;c<t;c++){
        tr[c]=sc.nextInt();
        for(int c1=0;c1<r;c1++){
          tra[c][c1]=sc.nextInt();
        }
      }
      for(int c=0;c<r;c++){
        re[c]=sc.nextInt();
        for(int c1=0;c1<h;c1++){
          res[c][c1]=sc.nextInt();
        }
      }
      for(int c=0;c<h;c++){
        ho[c]=sc.nextInt();
        for(int c1=0;c1<t;c1++){
          hot[c][c1]=sc.nextInt();
        }
      }
      String s="";
      int min=2147483647;
      for(int c=0;c<t;c++){
        int buc=tr[c];
        for(int c1=0;c1<r;c1++){
          if(tra[c][c1]==0){
            buc=buc+re[c1];
            for(int c2=0;c2<h;c2++){
              if(res[c1][c2]==0){
                buc=buc+ho[c2];
                if(hot[c2][c]==0){
                  if(buc<min){
                    min=buc;
                    s=""+c+" "+c1+" "+c2;
                  }
                }
                buc=buc-ho[c2];
              }
            }
            buc=buc-re[c1];
          }
        }
      }
      
      if(s.length()>1)
        System.out.println(s+":"+min);
      else
        System.out.println("Don't get married!");
    }
  }
}
                
                  
        