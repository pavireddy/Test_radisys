
import java.util.*;
public class arr_7
{
   
    public void sampleMethod()
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       int temp;
       for(int i=0;i<10;i++)
       {
           System.out.println("enter a number");
           a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<(10-1);j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
           System.out.println("the numbers in ascending order are=");
           for(int i=0;i<10;i++)
           System.out.println(a[i]);
        
           
    }
}
