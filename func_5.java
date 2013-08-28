import java.util.*;
public class func_5
{
   
   float temp;
    public void dispaly(int a,int b)
    {
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("the value of a "+" "+a+"and b is="+" "+b);
    }
    public void display(float a,float b)
    {
        temp=a;
        a=b;
        b=temp;
        System.out.println("the value of a  is"+" "+a+"and b is="+" "+b);
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,d;
        float e,f;
        System.out.println("enter the values of c,d(whole no's)and e,f(decimals)");
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextFloat();
        f=sc.nextFloat();
        func_5 obj=new func_5();
        obj.display(c,d);
        obj.display(e,f);
    }
        
        
}
