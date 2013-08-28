
import java.util.*;

public class arr_9
{
    
    public void sampleMethod()
    {
       
       Scanner sc=new Scanner(System.in);
       String in[]=new String[20];
       String out[]=new String[20];
       int j=0;String word="";int k=0;
       System.out.println("enter your sentence");
       String a=sc.nextLine();
       for(int i=0;i<=a.length()-1;i++)
     {
         System.out.print(a.charAt(i));
     }
      System.out.println();
     for(int i = a.length() - 1; i >= 0; --i)
     {
        
         System.out.print(a.charAt(i)); 
     }

        
    }
}
