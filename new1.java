
public class new1
{
    
    public void sampleMethod(String s)
    {
        int len=s.length();int ctr=0; int count=0;char d=' ';char a=' '; 
         
            for(int j=65;j<=90;j++)
            {
                for(int i=0;i<len;i++)
                {
                 char c=s.charAt(i);
                
                  if((int)c==j)
                   {
                    ctr=ctr+1;
                    } 
                    
                }
               a=(char) j;
               System.out.println(ctr+" "+j);
            }

}
}
