import java.util.Scanner;
public class UVA10235{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean ar[] = new boolean[1000000];
    
    for(int i=2;i<=1000;i++){
      if(ar[i]==false){
        for(int j=i*i;j<1000000;j=j+i)
          ar[j]=true;
      }
    }
    
    while(sc.hasNext()){
      int n = sc.nextInt();
      String s =""+n;
      String m="";
      for(int i=s.length()-1;i>-1;i--)
        m=m+s.charAt(i);
      
      int x=Integer.parseInt(m);
     
      if(ar[n]==true)
        System.out.println(n+" is not prime.");
      else if(ar[x]==false && x!=n)
        System.out.println(n+" is emirp.");
      else
        System.out.println(n+" is prime.");
    }
  }
}