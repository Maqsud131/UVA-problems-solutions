import java.util.Scanner;

public class UVA11059{
  
  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    
    int t=1;
    while(sc.hasNext()){
      int n=sc.nextInt();
      
      int ar[] = new int[n];
      for(int c=0;c<n;c++){
        ar[c]=sc.nextInt();
      }
      
      long max=-9223372036854775807L;
      long buc=1;
      for(int i=0;i<n;i++){
        buc=1;
        for(int j=i;j<n;j++){
          buc=buc*ar[j];
          if(buc>max)
            max=buc;
        }
      }
      
      if(max<0)
        System.out.println("Case #"+t+": The maximum product is 0.");
      else
        System.out.println("Case #"+t+": The maximum product is "+max+".");
      System.out.println();
      t++;
    }
  }
}

      