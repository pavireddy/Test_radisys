import java.util.*;
public class str_20
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        String s;int len;char c;String word="";
        System.out.println("enter a name");
        s=sc.nextLine();
        len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            word=word+c;
            else
            word=word+" "+"kumar"+" ";
        }
        System.out.println("the corrected name is="+word);
            
            
            
            
        
        
        
        
    }
}
