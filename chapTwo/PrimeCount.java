public class PrimeCount
{

	// all divisors of number that are greater than 2 , are necessiraly less than n/2,
	// so we need to check only this : is there any divisor in the interval [2, n/2] ?
	
	public static boolean isPrime(int n)
	{
		for (int i=2; i<= n/2;i++){ if(n%i==0) return false; }
		return true;
	}

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		for (int i=2;i<a;i++) {	
			if (isPrime(i)){
				System.out.println(i);
			}
		}
	}
}	
