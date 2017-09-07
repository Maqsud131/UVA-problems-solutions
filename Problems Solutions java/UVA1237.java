import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA1237{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int d=sc.nextInt();
      String nam[] = new String[d];
      int h[] = new int[d];
      int l[] = new int[d];
      sc.nextLine();
      for(int i=0;i<d;i++){
        String s=sc.nextLine();
        //System.out.println(s);
        StringTokenizer st = new StringTokenizer(s);
        nam[i]=st.nextToken();
        l[i]=Integer.parseInt(st.nextToken());
        h[i]=Integer.parseInt(st.nextToken());
      }
      int q=sc.nextInt();
      for(int i=0;i<q;i++){
        int qe=sc.nextInt();
        boolean tr=false;
        int co=0;
        for(int j=0;j<d;j++){
          if(qe>=l[j] && qe<=h[j]){
            if(tr==true){
              tr=false;
              break;
            }else{
              tr=true;
              co=j;
            }
          }
        }
        if(tr==true)
            System.out.println(nam[co]);
          else
            System.out.println("UNDETERMINED");
      }
      if(c<t-1)
        System.out.println();
    }
  }
}
            
            
            
            