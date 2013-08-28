//printing the words in reversed order
import java.util.*;
public class str_10
{
   
     
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        String s;int len;char c;String r="";String word="";
        System.out.println("enter a sentence");
        
        s=sc.nextLine();
        s=s+" ";
        len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            { 
                word=r+" "+word;
            r="";
        }
            else
            r=r+c;
            
            
        }
        System.out.println("your sentence in reversed order is="+" "+word);
            
        
      
    }
            
        
        
    }

