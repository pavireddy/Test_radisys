//printing the initials of a name entered by the user
import java.util.*;
public class str_9
{
   
    public void sampleMethod()
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String s;int len;char c;String s1;
        s=sc.nextLine();
        s1=s.trim();
        len=s1.length();
        
        c=s1.charAt(0);
        System.out.print(c+".");
        for(int i=0;i<len;i++)
        {
             c=s1.charAt(i);
            if((c==' ')&&(i!=s1.lastIndexOf(' ')))
            System.out.print(s1.charAt(i+1)+".");
        }
        int x=s1.lastIndexOf(' ');
        System.out.print(s1.substring(x+1));
        
             
            
        
         
        
        
        
        
        
        
        
        
        
        
        
        
        }
    }
                



