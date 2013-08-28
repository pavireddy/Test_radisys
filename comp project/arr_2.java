import java.util.*;
public class arr_2
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        int i,min,max;
        int a[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("enter a number of your choice");
            a[i]=sc.nextInt();
        }
        max=a[0];min=a[0];
        for(i=0;i<10;i++)
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
