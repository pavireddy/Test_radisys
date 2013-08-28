import java.io.*;

public class exam1
{
    
    public void sampleMethod()
    { 
      int ctr=0;
      int i;
      int j;
          

      for(i=2;i<100;i++) 
      { 
            for(j=2;j<=i;j++) 
            { 
              if(i%j==0) 
              ctr=ctr+1; 
            } 
            //System.out.print(ctr + " CTR ");
            if(ctr==1) 
            { 
                System.out.println();
                System.out.print("NO " + i + "  " ); 
                
            } 
            ctr =0 ;
        }
        char z = 'z';
        int d 
        char st=int(z)--;
        system.out.println(st);
    } 
}