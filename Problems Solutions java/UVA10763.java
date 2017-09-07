import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Hashtable;

public class UVA10763{
  public static void main(String[]args) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int t=1;
    while(t>0){
      int n = Integer.valueOf(br.readLine());
      if(n==0)
        break;
      
      Hashtable<String, Integer> h=new Hashtable<String, Integer>();
      int buc=0;
           
      for(int c=0;c<n;c++){
        String sr=br.readLine();
        StringTokenizer st = new StringTokenizer(sr);
        int x=Integer.valueOf(st.nextToken());
        int y=Integer.valueOf(st.nextToken());
        
        String s=""+x+" "+y;
        String d=""+y+" "+x;
        
        if(h.containsKey(d)){
          if(h.get(d)>0){
            h.put(d, h.get(d)-1);
            buc--;
          }else{
            if(h.containsKey(s))
              h.put(s, h.get(s)+1);
            else
              h.put(s, 1);
            buc++;
          }
        }else{
          if(h.containsKey(s))
            h.put(s, h.get(s)+1);
          else
            h.put(s, 1);
          buc++;
        }
       // System.out.println(buc);
      }
      if(buc==0)
        sb.append(String.format("YES\n"));
      else
        sb.append(String.format("NO\n"));
    }
    System.out.print(sb);
  }
}
              
              
              