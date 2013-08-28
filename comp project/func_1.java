

public class func_1
{
   int product(int a,int b)
   {
       int c;
       c=a*b;
       return(c);
    }
       
    public void main()
    {
       int i,sum,k;sum=0;
       func_1 obj=new func_1();
       for( i=1;i<=9;i++)
       {
           k=obj.product(i,i+1);
           sum=sum+k;
        }
        System.out.println("the sum of the series is="+sum);
    }
}
