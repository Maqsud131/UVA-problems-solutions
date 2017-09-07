import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class UVA10700{
  
  public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    for(int m=0;m<t;m++){
      ArrayList<Long> ar = new ArrayList<Long>();
      ArrayList<Long> ar2 = new ArrayList<Long>();
      
      String s = br.readLine();
      long x=0;
      long y=0;
      long min=0;
      StringTokenizer st = new StringTokenizer(s,"+");
      while(st.hasMoreTokens()){
        String s1=st.nextToken();
        StringTokenizer sr = new StringTokenizer(s1,"*");
         y=Long.parseLong(sr.nextToken());
         while(sr.hasMoreTokens())
           y=y*Long.parseLong(sr.nextToken());
        ar.add(y);
      }
      for(int c=0;c<ar.size();c++){
        min=min+ar.get(c);
      }
        
      long max=1;
      st = new StringTokenizer(s,"*");
      while(st.hasMoreTokens()){
        String s1=st.nextToken();
        StringTokenizer sr = new StringTokenizer(s1,"+");
         y=Long.parseLong(sr.nextToken());
         while(sr.hasMoreTokens())
           y=y+Long.parseLong(sr.nextToken());
         //System.out.println(y);
        ar2.add(y);
      }
      for(int c=0;c<ar2.size();c++){
        max*=ar2.get(c);
      }
      
      System.out.println("The maximum and minimum are "+max+" and "+min+".");
    }
  }
}
        