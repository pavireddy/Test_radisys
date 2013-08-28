

public class str_18
{
   
    public void sampleMethod(String s)
    {
       
        int len;char c=' '; char c1=' ';int d=0;
        s=" "+s+" ";int ctr=0;
        char a=' ';
        char b=' ';
        
        len=s.length();
        System.out.println("the letters of your word in arranged order are=");
        for(int i=65;i<=90;i++)
        {
            for(int j=1;j<len;j++)
            {
                
            c=s.charAt(j);
            c1=s.charAt(j-1);
            
            d=((int)c-(int)c1);
            if(d==1)
            {
                ctr=1;
                a=c;
                b=c1;
            }
           
                        
            }   
           
        }
         if(ctr==1)
            {
                System.out.print(b + a);
            } 
    }
    
            
        
    }
