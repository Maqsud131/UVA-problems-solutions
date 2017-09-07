import java.util.Scanner;
public class UVA10082{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    char[] ar = {'Q','Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']','\\'};
    char ar1[]={'A','A','S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\''};
    char ar2[]={'Z','Z', 'X','C', 'V', 'B', 'N', 'M', ',', '.','/'};
    char ar3[]={'`','`','1','2','3','4','5','6','7','8','9','0','-','='};
    while (sc.hasNextLine()) {
      char []s = sc.nextLine().toCharArray();
      
      for (int i = 0; i <s.length; i++) {
        // System.out.println(newLine[i]);
        if (s[i] != ' ') {
          for (int j = 1; j < ar.length; j++) {
            if(s[i]==ar[j]){
              System.out.print(ar[j-1]);
              break;
            }
          }
          for (int j = 1; j < ar1.length; j++) {
            if(s[i]==ar1[j]){
              System.out.print(ar1[j-1]);
              break;
            }
          }
          for (int j = 1; j < ar2.length; j++) {
            if(s[i]==ar2[j]){
              System.out.print(ar2[j-1]);
              break;
            }
          }
          for (int j = 1; j < ar3.length; j++) {
            if(s[i]==ar3[j]){
              System.out.print(ar3[j-1]);
              break;
            }
          }
        }
        else{
          System.out.print(' ');
        }
      }
      System.out.println();
    }
  }
}
