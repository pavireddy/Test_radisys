//electricity bill using functions
import java.util.*;
public class func_4
{
   
    public void charge(int u)
    {
       double amt=0.0;double n=0.0;
       
       if(u<=100)
       amt=u*0.8;
       n=(amt+50);
       if(u>100&&u<=200)
       amt=((100*0.8)+(u-100)*1);
       n=(amt+50);
       if(u>200)
       amt=((100*0.8)+(100*1)+(u-200)*1.25);
       n=(amt+50);
       System.out.println("the units consumed are="+u);
       System.out.println("the charge=Rs."+amt);
       System.out.println("the additional charge=Rs."+50);
       System.out.println("the amount to be paid=Rs."+n);
       
       
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units consumed");
        int unit;
        func_4 obj=new func_4();
        unit=sc.nextInt();
        obj.charge(unit);
        
    
    }
}
