
import java.util.*;
public class arr_3
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        boolean b=false;
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("enter a no");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number to be searched");
        int n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(a[i]==n)
            b=true;
        }
        if(b==true)
        
            System.out.println("the number entered is found");
            else
            System.out.println("the number entered is not found");
        
            
            
        
    }
}
