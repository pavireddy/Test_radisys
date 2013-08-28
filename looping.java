

public class looping
{
   

    public void sampleMethod(int n)
    {
       int i;double d;int r;int e=0;int sum=0;int b=4;
       for(i=1;i<=n;i++)
        {do{
            d=Math.pow(b,2);
            b++;
            r=(int)d%10;
            e=e*10+r;
            d=(int)d%10;
            
        }
        while(d!=0);}
        System.out.print(e+",");
        
            
            
            
    }
}
