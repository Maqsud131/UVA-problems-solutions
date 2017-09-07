import java.util.Scanner;
public class UVA12895{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    for(int p=0;p<t;p++){
      int n = sc.nextInt();
      
      String s = ""+n;
      int c=1;
      int x=0;
      while(c>0){
        int m=0;
        if(m>n)
          break;
        for(int i=0;i<s.length();i++)
          m=m+(int)Math.pow((int)s.charAt(i)-48,c);
        //System.out.println(m);
        if(x==m){
          System.out.println("Not Armstrong");
          break;
        }
        if(m==n){
          System.out.println("Armstrong");
          break;
        }else if(m>n){
          System.out.println("Not Armstrong");
          break;
        }
        x=m;
        c++;
      }
    }
  }
}