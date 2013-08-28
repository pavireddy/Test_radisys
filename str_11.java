import java.util.*;
public class str_11
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s;int len;char c;
        String r="";String word="";
        s=sc.nextLine();
        s=s+" ";
        len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                 word=word+" "+r;
            r="";
        }
                
            
            else
            r=c+r;
            
               
        }
        System.out.println("the words of your sentence in reversed order are");
        System.out.println(word);

        
    }
}
