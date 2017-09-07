import java.util.StringTokenizer;
import java.util.Scanner;

public class UVA10340{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      String s=sc.nextLine();
      
      StringTokenizer st = new StringTokenizer(s);
      
      String s1 = st.nextToken();
      String s2 = st.nextToken();
      
      if(s2.length()<s1.length()){
        System.out.println("No");
      }else{
        int j=0;
        for(int i=0;i<s2.length();i++){
          if(s1.charAt(j)==s2.charAt(i)){
            j++;
            if(j==s1.length()){
              System.out.println("Yes");
              break;
            }
          }
        }
        if(j<s1.length())
          System.out.println("No");
      }
    }
  }
}

