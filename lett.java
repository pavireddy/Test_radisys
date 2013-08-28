
/**
 * Write a description of class lett here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lett
{
    
    public void sampleMethod(String s)
    {s=s+" ";
       
        int len;len=s.length();char c;char c1;int ctr=0;int m;int n;
        for(int i=0;i<len-1;i++)
        {
            c=s.charAt(i);
            if(c==s.charAt(i+1))
            ctr++;
        }
        System.out.println("the counter is="+ctr);
            
    }
}
