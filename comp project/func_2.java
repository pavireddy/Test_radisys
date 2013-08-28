import java.util.*;
public class func_2
{
   
   
    
       double fact(int n)
       {
           int f=1;
           for(int i=1;i<=n;i++)
           f=f*i;
           return(f);
        }
         public static void main(String args[])
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter your number"); 
             int a=sc.nextInt();
             func_2 obj=new func_2();
            double sum=0.0;
             for( int j=1;j<=a;j++)
             {
                double k=obj.fact(j);
                 sum=sum+(1/k);
                }
                System.out.println("the sum of series is="+sum);
            
                 
             
             
        
              

    }
}
