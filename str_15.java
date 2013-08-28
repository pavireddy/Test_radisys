import java.io.*;
public class str_15
{
   
    public void sampleMethod()throws IOException
    {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(read);
       char c;
       System.out.println("enter a character(special/digit/alphabet)");
       c=(char)(br.read());
       
       if(Character.isLetter(c))
       {
           if(Character.isUpperCase(c))
           System.out.println(c+" is an upper case alphabet");
           if(Character.isLowerCase(c))
           System.out.println(c+" is an lower case alphabet");
        }
        else
        {
            if(Character.isDigit(c))
             System.out.println(c+" is a digit");
             else
              System.out.println(c+" is a special case character");
            }
        
            
       
    }
}
