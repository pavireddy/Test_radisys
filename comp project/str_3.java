
import java.util.*;
public class str_3
{
   
    public void sampleMethod()
    {
        char c=' ';int len=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you word/sentence");
        String s=sc.next();
        
        System.out.println("the original string is"+" "+s);
        len=s.length();
        for(int i=0;i<len;i++)
        {
        c=s.charAt(i);
        System.out.println(s.substring(0,i));
    }}
}
