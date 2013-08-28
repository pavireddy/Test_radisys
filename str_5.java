

public class str_5
{
   
    public void sampleMethod(String s)
    {
        
       
       int len=s.length();
       int ctr=0;
       for(int i=0;i<len;i++)
       {
           char c=s.charAt(i);
           if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
           
               
               ctr++;
               
           
            
       
    }
    System.out.println("the no.of vowels in the sentence is="+ctr);
} 
}