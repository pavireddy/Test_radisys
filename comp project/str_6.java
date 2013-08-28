import java.util.*;
public class str_6
{
    public void samplemethod()
    {
        char c=' ';String word=" ";
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you word/sentence");
        String s=sc.next();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            {if(c=='e')
            
                c='*';
            }word=word+c;
        }
            System.out.println(word);
                
            
        

       
    }
}
