import java.util.*;
public class arr_8
{
   
    public void sampleMethod()
    {
        Scanner sc=new Scanner(System.in);
        int len;
        System.out.println("enter your word");
        String s=sc.next();
        len=s.length();
        char c[]=new char[50];
        for(int i=0;i<len;i++)
        c[i]=s.charAt(i);
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<(len-1);j++)
            {
                if(c[j]>c[j+1])
                {
                    char temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
                }
        }
        System.out.println("the alphabets in ascending order are=");
        for(int i=0;i<len;i++)
        {System.out.println(c[i]);
        }
        
        
    }
}
