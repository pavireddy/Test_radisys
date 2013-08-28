

public class str_8
{
   
    public void sampleMethod(String s)
    {
       int len=s.length();int ctr=0;int ctr2=0;String word="";
       for(int i=0;i<len;i++)
       {
          char c=s.charAt(i);
          if (c==' ')
          ctr++;word=word+" ";
          
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
          ctr2++;
        }
          System.out.println("no.of blank spaces="+ctr);
          System.out.println("no.of words="+(ctr+1));
          System.out.println("no.of vowels="+ctr2);
          System.out.println("no.of characters="+(len-ctr));
          
          
       
    }
}
