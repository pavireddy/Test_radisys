import java.util.*;
public class arr_12
{
   
    public void sampleMethod()
    {
       
    Scanner sc=new Scanner(System.in);
    int n[]=new int[100];
    int m;
    System.out.println("enter the size of the pascal's triangle");
    m=sc.nextInt();
    n[0]=1;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<=i;j++)
        System.out.print(n[j]+" ");
        System.out.println();
        for(int j=i+1;j>0;j--)
        n[j]=n[j]+n[j-1];
    }
        

    
    
}
}
