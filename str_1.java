
public class str_1
{   public void sampleMethod()
    {
        int i,j=1;
        int b=0;
        int d=2;
        int n=30;
        int ar[]={2,0,0,0,0,0,0,0,0,0};
        while(d<=n)
        {
            for (i=2;i<d;i++)
            {
                if(d %i == 0)
                {
                    break;
                }
                if(i==d-1)
                {
                ar[j++]=d;
                        
                }
                
            }
            d++;
        }
        for (i=0;i<=9;i++)
        {
        System.out.println(ar[i]);
        }
    }
}
