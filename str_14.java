//replcing words in a given statement
import java.util.*;
public class str_14
{
   
    public void sampleMethod()
    {
       String s;
       s="January 26 is celebrated as the republic day of india";
       int len;char c;
       s=s+" ";String word="";String r="";
       len=s.length();
       for(int i=0;i<len;i++)
       {
           c=s.charAt(i);
           if(c!=' ')
           word=word+c;
           else
           {
               if(word.compareTo("26")==0)
               r=r+" "+"15";
               else if(word.compareTo("January")==0)
               r=r+" "+"August";
               else if(word.compareTo("republic")==0)
               r=r+" "+"independence";
               else
               r=r+" "+word;
               word="";
            }
        }
        System.out.println("the moidfied sentence is=");
        System.out.println(r);
               
               
               
           
        }
    }

