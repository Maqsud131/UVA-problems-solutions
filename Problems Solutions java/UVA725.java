import java.util.Scanner;
public class UVA725{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    boolean w=false;
    while(sc.hasNext()){
      int r=sc.nextInt();
      if(r==0){
        break;
      }
      if(w==false)
        w=true;
      else
        System.out.println();
      
      boolean ar[] = new boolean[10];
      boolean ar2[] = new boolean[10];
      boolean k=false;
      String s="";
      for(int a=1;a<10;a++){
        ar = new boolean[10];
        ar2=new boolean[10];
        ar[a]=true;
        s="";
        s=s+a+"    ";
        for(int b=0;b<10;b++){
          if(ar[b]==false){
          ar[b]=true;
          s=s.substring(0,1)+b;
          for(int c=0;c<10;c++){
            if(ar[c]==false){
            ar[c]=true;
            s=s.substring(0,2)+c;
            for(int d=0;d<10;d++){
              if(ar[d]==false){
              ar[d]=true;
              s=s.substring(0,3)+d;
              for(int e=0;e<10;e++){
                if(ar[e]==false){
                ar[e]=true;
                s=s.substring(0,4)+e;
                int x=Integer.parseInt(s);
                double m=1.00*x/r;
                int y=x/r;
                m=m-y;
                if(y>1233 && m==0 ){
                String p=""+y;
                if(p.length()<5)
                  p="0"+p;
                boolean l=true;
                //System.out.println(s);
                for(int j=0;j<5;j++){
                  String v=""+p.charAt(j);
                  int z=Integer.parseInt(v);
                  //System.out.println(v);
                  if(ar[z]==true || ar2[z]==true){
                    l=false;
                    break;
                  }
                  ar2[z]=true;
                }
                
                ar2 = new boolean[10];
                
                if(l==true){
                  k=true;
                  System.out.println(s+" / "+p+" = "+r);
                }
                }
                ar[e]=false;
              }
              }
              ar[d]=false;
            }
            }
            ar[c]=false;
          }
          }
          ar[b]=false;
        }
        }
        ar[a]=false;
      }
      if(k==false)
        System.out.println("There are no solutions for "+r+".");
    }
  }
}
                