//frequency of a word in a sentence entered by the user.
import java.util.*;
public class str_13
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        
        String s;int len;char c;String sen="";String word;int ctr=0;
        s=sc.nextLine();
        s=s+" ";
        len=s.length();
        System.out.println("enter a word that has to be searched for in the sentence");
        word=sc.next();
        
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            sen=sen+c;
            else
            {
                if(sen.compareTo(word)==0)
                ctr++;
                sen="";
            }
        }
        if(ctr>0)
        System.out.println("frequency of the word entered is="+" "+ctr);
        else
        System.out.println("your word is not found in the sentence");
            
                
                
                

            
        
        
        
    }
}
