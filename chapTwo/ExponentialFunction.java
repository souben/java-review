// first solution was to try to x^i and i! 
// but I got an overflow

public class ExponentialFunction
{
	/*
	public static long Factoriel(long i)
	{
		long result = 1;
		while( i > 0){ 
			result*=i;
		       	i--;
		}
		return result;
	}
	*/

	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double e = 0;
		double term = 1;
		for(int i=0; e != e+term ; i++)
		{
			term = 1;
			int k = i;
			while( k > 0 ) { term *= x/k; k--; }
			e += term;			
		}
		System.out.println(e + " " + Math.exp(x));
	}	
}
