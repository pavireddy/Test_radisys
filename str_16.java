

public class str_16
{
    
    public void sampleMethod(String s)
    {
        int len;char c;int i;
        String a,b;
        len=s.length();
        for( i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            break;
        }
        a=s.substring(i,len);
        b=s.substring(0,i);
        System.out.println("your word in piglatin form is="+a+b+"ay");
        
        
        
    }
}
