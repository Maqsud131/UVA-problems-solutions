import java.util.Scanner;

public class UVA621{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=sc.nextInt();
    sc.nextLine();
    for(int c=0;c<t;c++){
      String s = sc.nextLine();
      if(s.equals("1") || s.equals("4") || s.equals("78")){
        System.out.println("+");
      }else if(s.charAt(s.length()-1)=='5' && s.charAt(s.length()-2)=='3'){
        System.out.println("-");
      }else if(s.charAt(s.length()-1)=='4' && s.charAt(0)=='9'){
        System.out.println("*");
      }else if(s.charAt(0)=='1' && s.charAt(1)=='9' && s.charAt(2)=='0'){
        System.out.println("?");
      }
    }
  }
}
