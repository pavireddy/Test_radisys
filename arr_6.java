
import java.util.*;
public class arr_6
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        String nm[]=new String[10];
        String temp;
        for(int i=0;i<10;i++)
        {
            System.out.println("enter a name");
            nm[i]=sc.next();
        }
        for(int i=0;i<10;i++)
        {
        for(int j=0;j<(10-1);j++)
        {
        if(nm[j].compareTo(nm[j+1])>0)
        {
            temp=nm[j];
            nm[j]=nm[j+1];
            nm[j+1]=temp;
        }}}
        System.out.println("the names in alphabetical order are=");
        for(int i=0;i<10;i++)
        {
            System.out.println(nm[i]);
        }
            
    }
}
