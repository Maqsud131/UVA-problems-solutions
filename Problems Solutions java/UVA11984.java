import java.util.Scanner;
public class UVA11984{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    for(int i=1; i<=size; i++) {
      double co=sc.nextDouble();
      double f=sc.nextDouble();
      double ne= ((9*co)/5)+32;
      ne=ne+f;
      double nc=(((ne-32)*5)/9);
      System.out.print("Case "+i+": "); 
      System.out.printf ("%.2f", nc);
      System.out.println();
    }
  }
}