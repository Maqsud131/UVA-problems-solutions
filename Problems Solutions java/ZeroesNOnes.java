import java.util.Scanner;
public class ZeroesNOnes{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int ca=1;
    while(sc.hasNextLine()){
      String s=sc.nextLine();
      int cas=sc.nextInt();
      int []n=new int[s.length()];
      int p=0;
      for(int c=1;c<s.length();c++){
        if(s.charAt(c)!=s.charAt(c-1)){
          p++;
        }
        n[c]=p;
      }
      System.out.println("Case "+ca+":");   
      for(int d=0;d<cas;d++){
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(n[x]!=n[y])
          System.out.println("No");
        else
          System.out.println("Yes");
      }
      ca++;
      sc.nextLine();
      sc.nextLine();
    }
  }
}
    