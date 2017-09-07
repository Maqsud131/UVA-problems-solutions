import java.util.Scanner;
public class UVA10924{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean ar[] = new boolean[1041];
    
    for(int i=2;i<=32;i++){
      if(ar[i]==false){
        for(int j=i*i;j<1041;j=j+i)
          ar[j]=true;
      }
    }
    
    while(sc.hasNext()){
      String s = sc.nextLine();
      int n=0;
      for(int i=0;i<s.length();i++){
        if((int)s.charAt(i)>96)
          n =n+(int)s.charAt(i)-96;
        else
          n=n+(int)s.charAt(i)-38;
      }
      if(ar[n]==false)
        System.out.println("It is a prime word.");
      else
        System.out.println("It is not a prime word.");
    }
  }
}