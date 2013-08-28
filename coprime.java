

public class coprime
{
    
    public int calc_hcf(int a,int b)
    {
       int p,hcf=0;
       if(a<b)
       p=a;
       else p=b;
       for(int i=1;i<=p;i++)
       {
           if(a%i==0&&b%i==0)
           {hcf=i;}
        }
        return hcf;
    }
        public int prime(int c)
        {
            int d=1;int a=1;
            
            for(int i=2;i<c;i++)
            {
                if(c%i==0)
                d=1;
               
            }
            System.out.print("d" + d + " " );
            System.out.println();
            if(d==0)
                a=0;
            else
                a=1;
                
            System.out.print("prime" + a + " " );
            return a;
        }
            public void main()
            {
                 coprime obj=new coprime();
                int h,p,q=0;
                h=obj.calc_hcf(5,6);
                p=obj.prime(5);
                q=obj.prime(6);
                System.out.println(h+"  "+p+" "+q);
            if(p==0&&q==0)
            {
                if(h==1)
                System.out.println("coprime");
            }}}
            

    
    

