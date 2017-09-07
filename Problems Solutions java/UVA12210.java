import java.util.Scanner;
import java.util.Arrays;

public class UVA12210{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int tr=1;
    while(sc.hasNext()){
      int b=sc.nextInt();
      int s=sc.nextInt();
      if(b==0 && s==0)
        break;
      int ba[] = new int[b];
      int sp[] = new int[s];
      boolean st[] = new boolean[s];
      
      for(int c=0;c<b;c++)
        ba[c]=sc.nextInt();
      for(int c=0;c<s;c++)
        sp[c]=sc.nextInt();
     
      Arrays.sort(ba);
      Arrays.sort(sp);
      
      int co=0;
      for(int i=ba.length-1;i>-1;i--){
        int bu=0;
        int p=0;
        boolean t=false;
        for(int j=sp.length-1;j>-1;j--){
          if(t==false){
            if(st[j]==false){
              p=j;
              bu=Math.abs(ba[i]-sp[j]);
              t=true;
            }
          }else{
            if(Math.abs(ba[i]-sp[j])<bu){
              if(st[j]==false){
                p=j;
                bu=Math.abs(ba[i]-sp[j]);
              }
            }else{
              st[p]=true;
              //System.out.println(ba[i]+"+"+sp[p]);
              co++;
              break;
            }
          }
          if(j==0 && st[p]==false){
              st[p]=true;
              //System.out.println(ba[i]+"+"+sp[p]);
              co++;
            }
        }
      }
      if(b-co==0){
        System.out.println("Case "+tr+": "+(b-co));
      }else{
        System.out.println("Case "+tr+": "+(b-co)+" "+ba[0]);
      }
      tr++;
    }
  }
}
                  
      