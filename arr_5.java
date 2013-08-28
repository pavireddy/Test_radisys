
import java.util.*;
public class arr_5
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
        int min;
        for(int i=0;i<10-1;i++)
        {min=i;
            for(int j=i+1;j<10;j++)
            {
                if(a[j]<a[min])
                min=j;
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("the numbers in acsending order are=");
       for(int i=0;i<10;i++)
       {
          System.out.println(a[i]);
        }
        
       

                
           
       
    }
}
