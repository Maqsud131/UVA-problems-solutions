import java.util.Scanner;
import java.util.ArrayList;
public class UVA10041{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int c=0;c<t;c++){
      int r=sc.nextInt();
      int ar[] = new int[30001];
      ArrayList<Integer> st = new ArrayList<Integer>();
      for(int i=0;i<r;i++){
        int s=sc.nextInt();
        if(st.contains(s)==false)
          st.add(s);
        ar[s]++;
      }
      int m=150000000;
      int b=0;
      for(int j=1;j<st.size();j++)
          b=b+Math.abs((st.get(0)-st.get(j))*ar[st.get(j)]);
        if(b<m)
          m=b;
      for(int i=1;i<st.size()-1;i++){
        b=0;
        for(int j=i-1;j>=0;j--)
          b=b+Math.abs((st.get(i)-st.get(j))*ar[st.get(j)]);
        for(int j=i+1;j<st.size();j++)
          b=b+Math.abs((st.get(i)-st.get(j))*ar[st.get(j)]);
        if(b<m)
          m=b;
      }
      b=0;
      for(int j=st.size()-2;j>=0;j--)
          b=b+Math.abs((st.get(st.size()-1)-st.get(j))*ar[st.get(j)]);
      if(b<m)
          m=b;
      
      System.out.println(m);
    }
  }
}
        