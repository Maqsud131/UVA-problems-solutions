import java.util.Scanner;
public class UVA10137{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int n=sc.nextInt();
      if(n==0)
        break;
      double ar[]= new double[n];
      double b=0;
      for(int c=0;c<n;c++){
        ar[c]=sc.nextDouble();
        b=b+ar[c];
      }
      b=b/n;
      double s=0;
      double s1=0;
      for(int c=0;c<n;c++){
        if(ar[c]<b)
          s=s+(b-ar[c]);
        else if(ar[c]>b)
          s1=s1+ar[c];
      }
      String t="";
      if(s<s1)
        t=""+s;
      else
        t=""+s1;
      String y="";
      //System.out.println(t);
      for(int i=0;i<t.length();i++){
        if(t.charAt(i)=='.'){
          y=y+t.charAt(i);
          y=y+t.charAt(i+1);
          if(i+2==t.length())
            y=y+0;
          else
            y=y+t.charAt(i+2);
          break;
        }else{
          y=y+t.charAt(i);
        }
      }
      System.out.println("$"+y);
    }
  }
}