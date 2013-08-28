
public class arr_1
{
    public void sampleMethod()
    {
       int i,min,max;min=0;max=0;
       int a[]={15,67,42,56,34,78,47,89,9,54};
       for( i=0;i<10;i++)
       {
           if(max<a[i])
           max=a[i];
           if(min>a[i])
          min=a[i];
        }
        System.out.println("the greatest number is="+max);
        System.out.println("the smallest number is="+min);
        
    }
}
