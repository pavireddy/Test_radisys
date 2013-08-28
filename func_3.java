//palindrome
import java.util.*;
public class func_3
{
   
    public int reverse(int n)
    {
        int a,r;r=0;
        do
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        while(n!=0);
        return(r);
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int no;int d;int b;
        func_3 obj=new func_3();
        System.out.println("enter a number");
        no=sc.nextInt();
        d=no;
        b=obj.reverse(no);
        if(b==d)
        System.out.println("the number"+" "+d+" "+"is a palindrome");
        else
         System.out.println("the number"+" "+d+" "+"is not a palindrome");
        
        
        
        
    
    }
}
