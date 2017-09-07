import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class UVA10114{
  
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    int m,l,s,s1=0;
    double dp,am,a1,a2,p;
    
    boolean t;
    while(sc.hasNext()){
      
      m=sc.nextInt();
      dp=sc.nextDouble();
      am=sc.nextDouble();
      l=sc.nextInt();
      if(m<0)break;
      Queue<Double> q = new LinkedList<Double>();
      Queue<Integer> q1= new LinkedList<Integer>();
      s=sc.nextInt();
      p=sc.nextDouble();
      q.add(1-p);
      for(int i=1;i<l;i++){
        s1=sc.nextInt();
        p=sc.nextDouble();
        q.add(1-p);
        q1.add(s1-s);
        s=s1;
      }
      q1.add(m-s1);
      a1=am+dp;
      a2=am;
      int co=0;
      t=false;
      dp=am/m;
      for(int z=0;z<m;z++){
        System.out.print(z+" "+co+" ");
        p=q.poll();
        l=q1.poll();
        System.out.println(" "+p+" "+l);
        for(int j=0;j<l;j++){
          if(co>0)a2=a2-dp;
          a1=a1*p;
          //printf("%lf %lf %lf\n",a1,a2,p);
          if(a2<a1){
            //printf("%lf %lf\n",a1,a2);
            t=true;
            break;
          }
          co++;
          if(co==m){
            //printf("%lf %lf\n",a1,a2);
            t=true;
            break;
          }
        }
        if(t==true)break;
      }
      if(co!=1) System.out.println(co+" months");
      else System.out.println(co+" month");
    }
  }
}