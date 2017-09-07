import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class UVA11292{
  public static void main(String[]args) throws IOException  {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    boolean t=false;
    while(t==false){
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s);
      int n=Integer.valueOf(st.nextToken());
      int m=Integer.valueOf(st.nextToken());
      if(n==0 && m==0)
        break;
      
      int d[] = new int[n];
      int h[] = new int[m];
      
      for(int i=0;i<n;i++)
        d[i]=Integer.valueOf(br.readLine());
      for(int i=0;i<m;i++)
        h[i]=Integer.valueOf(br.readLine());
      
      Arrays.sort(h);
      Arrays.sort(d);
      
      int buc=0;
      int j=0;
      boolean tr=false;
      for(int i=0;i<d.length;){
        if(j==h.length){
            tr=true;
            break;
          }
        if(d[i]<=h[j]){
          buc=buc+h[j];
          i++;
          j++;
        }else{
          j++;
        }
      }
      if(tr==false)
        sb.append(String.format("%s\n",buc));
      else
        sb.append(String.format("Loowater is doomed!\n"));
    }
    System.out.print(sb);
  }
}