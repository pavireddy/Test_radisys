
import java.util.*;
public class arr_4
{
   
    public void sampleMethod()
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[10];
       int start,end;start=0;end=9;
       int mid,search;boolean b=false;
       for(int i=0;i<10;i++)
       {
       System.out.println("enter a number");
       a[i]=sc.nextInt();
    }
    System.out.println("enter number to be searched");
    search=sc.nextInt();
    while(start<=end)
    {
        mid=(start+end)/2;
        if(a[mid]==search)
        {b=true;break;}
        if(a[mid]<search)
        start=mid+1;
        if(a[mid]>search)
        end=mid-1;
    }
    if(b==true)
    System.out.println("search successful");
    else
    System.out.println("search not successful");
    
       
    }
}
