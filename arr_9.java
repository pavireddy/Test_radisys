
import java.util.*;

public class arr_9
{
    
    public void sampleMethod()
    {
       
       Scanner sc=new Scanner(System.in);
      String n[]=new String[10];
       int j=0;String word="";
       System.out.println("enter your sentence");
       String s=sc.nextLine();
       int len=s.length();
       for(int i=0;i<len;i++)
       {
           char c=s.charAt(i);
           if(c!=' ')
           word =word+c;
           else
           {
               n[j]=word;
               j++;
               word=" ";
            }
        }
            n[j]=word;
            System.out.println("the sentence in reversed order is=");
            for( int i=j;j>=0;j--)
            System.out.print(n[j]+" ");
        
            
           
    

        
    }
}
