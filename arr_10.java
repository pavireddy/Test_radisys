//Enter the name of a state to display it's capital.
import java.util.*;
public class arr_10
{
    
    public void sampleMethod()
    {
       Scanner sc=new Scanner(System.in);
       String s;boolean b=false;int a=0;
       String m[]=new String[5];
       String n[]=new String[5];
       for(int i=0;i<5;i++)
       {
           System.out.println("enter the name of a state");
           m[i]=sc.nextLine();
           System.out.println("enter the capital of the state above");
           n[i]=sc.nextLine();
        }
        System.out.println("enter the state whose capital is to be found");
        s=sc.nextLine();
        for(int i=0;i<5;i++)
        {
            if(m[i].equals(s))
            {
                b=true;
                a=i;
            }
        }
            if(b==true)
            System.out.println("the capital is"+" "+n[a]);
            else
            System.out.println("the capital of"+" "+s+" "+"is not found");
        
        
                
                
        
           
    }
}
