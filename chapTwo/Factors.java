public class Factors
{
	public static boolean isPrime(int a)
	{
		for(int i=2; i<=a/2;i++){
		       if(a%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int factors = 1;
		for(int i=2;i<=a;i++)
		{
			if(isPrime(i)){
			        while( a%i==0 ){
			        	factors*=i;
					a=a/i;
				}
			}
		}
		System.out.println(factors);
	}
}
			
