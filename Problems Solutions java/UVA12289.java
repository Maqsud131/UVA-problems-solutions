import java.util.Scanner;

public class UVA12289{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int t=sc.nextInt();
    sc.nextLine();
    for(int c=0;c<t;c++){
      String s = sc.nextLine();
      if(s.length()==5){
        System.out.println(3);
      }else if((s.charAt(0)=='o' && (s.charAt(1)=='n'||s.charAt(2)=='e'))||(s.charAt(1)=='n' && (s.charAt(0)=='o'||s.charAt(2)=='e'))){
        System.out.println(1);
      }else{
        System.out.println(2);
      }
    }
  }
}

    
              
               
          