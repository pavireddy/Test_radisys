

public class str_7
{
   
    public void sampleMethod(String s)
    {
        int len=0;
        len=s.length();String word="";
        for(int i=0;i<len;i++)
        {
           char c=s.charAt(i);
            if (c>='A'&&c<='Z')
            {
                char c1=Character.toLowerCase(c);
                word=word+c1;
            }
            else if(c>='a'&&c<='z')
            {
               char c1=Character.toUpperCase(c);
               word=word+c1;
            }
            else if(c==' ')
           word=word+" ";
            }
            System.out.println("The new string is="+word);
            
                
    }
}
