import java.util.Scanner;
import java.util.ArrayList;
public class UVA12488{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      ArrayList<Integer> st= new ArrayList<Integer>(n);
      int ed[] = new int[n];
      
      for(int i=0;i<n;i++){
        st.add(sc.nextInt());
      }
      for(int i=0;i<n;i++){
        ed[i]=sc.nextInt();
      }
      
      int co=0;
      for(int i=0;i<n;i++){
        if(st.get(i)!=ed[i]){
          int v = st.indexOf(ed[i]);
          while(v!=i){
            int temp = st.get(v);
            st.set(v,st.get(v-1));
            st.set(v-1, temp);
            co++;
            v--;
          }
        }
      }
      System.out.println(co);
    }
  }
}
