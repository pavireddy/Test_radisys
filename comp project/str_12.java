

public class str_12
{
   
    public void sampleMethod(String s)
    {
      
        
       int len=0;int i=0;char c=' ';int ctr1=0;int ctr2=0;int ctr3=0;int ctr4=0;
       len=s.length();
       for(i=0;i<len;i++)
       
       {
           c=s.charAt(i);
           if(c>='A'&&c<='Z')
           ctr1++;
           else if(c>='a'&&c<='z')
           ctr2++;
           else if(c>='0'&&c<='9')
           ctr3++;
           else 
           ctr4++;
        }
        System.out.println("number of upper case characters is="+ctr1);
        
        System.out.println("number of lower case characters is="+ctr2);
        
        System.out.println("number of digits is="+ctr3);
        System.out.println("number of special characters is="+ctr4);
           
           
    }
}
