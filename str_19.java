
public class str_19
{
   
    public void sampleMethod(String s)
    {
        String word="";
        int len; char c;char a;
        s=" "+s;
        len=s.length();
        for(int i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                a=s.charAt(i+1);
                word=word+' '+Character.toUpperCase(a);
                i++;
            }
            else
            word=word+c;
            
        }
            System.out.println("the new sentence is="+word);
        
                
            
        
    }
}
