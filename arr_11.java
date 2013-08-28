//Enter 10 names and display all those names which begin with an alphabet entered by the user.
import java.io.*;
public class arr_11
{
    public void sampleMethod()throws IOException
    {
       
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader br=new BufferedReader(read);
       String s[]=new String[5];
        String name;char c;boolean b=false;
        for(int i=0;i<5;i++)
        {
            System.out.println("enter a name");
            s[i]=br.readLine();
        }
        System.out.println(" enter a letter");
        c=(char)(br.read());
        
        for(int i=0;i<5;i++)
        {
            name=s[i];
            if(name.charAt(0)==c)
            
               { System.out.println(s[i]);
                b=true;
            }
        }
            if(b==false)
                      
             System.out.println("no name in the list begins with"+" "+c);
               
            }
            
        
        
        

    }

