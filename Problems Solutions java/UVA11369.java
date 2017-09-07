import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class UVA11369{
  public static void main(String[]args) throws IOException  {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    int t=Integer.valueOf(br.readLine());
    for(int c=0;c<t;c++){
      int n=Integer.valueOf(br.readLine());
      
      int ar[] = new int[n];
      
      String s = br.readLine();
      StringTokenizer st = new StringTokenizer(s);
      
      for(int i=0;i<n;i++)
        ar[i]=Integer.valueOf(st.nextToken());
      
      Arrays.sort(ar);
      
      int buc=0;
      for(int i=ar.length-3;i>=0;i=i-3)
        buc=buc+ar[i];
      
      sb.append(String.format("%s\n",buc));
    }
    System.out.print(sb);
  }
}