
public class arr
{
   int i;
    int a[]={1,2,3};
        double d[]=new double[3];
       int b[]=new int[3];
    
    public void doing()
    {
       
       for(i=0;i<3;i++)
       {
           d[i]=Math.pow(a[i],2);
        }
    }
    public void sampleMethod()
    {
        for(i=0;i<3;i++)
        {
            b[i]=(int)d[i];
            System.out.println(b[i]);
        }
    }
    public void main()
    {
       
       arr obj=new arr();
       obj.doing();
       obj.sampleMethod();
       
    }
    
           

    }

