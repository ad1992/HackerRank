package ExceptionHandling;

class myCalculator
{
   public int power(int n,int p)throws Exception
   {
       int ans=1;
       if(n<0||p<0)
           throw new Exception("n and p should be non-negative");
        for(int i=1;i<=p;i++)    
        {
            ans=ans*n;
        }
       return ans;
   }
}