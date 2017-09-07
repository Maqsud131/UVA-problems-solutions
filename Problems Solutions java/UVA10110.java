import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class UVA10110{
  
  public static void main(String[]args) throws IOException{
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      long n = Long.parseLong(br.readLine());
      if(n==0)
        break;
      long k = (long)Math.sqrt(n);
      
      if(k!=Math.sqrt(n)){
        System.out.println("no");
      }else{
        System.out.println("yes");
      }
    }
  }
}
      
      
    
  