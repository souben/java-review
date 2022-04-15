public class GCD
{
	public static long FindGCD(long x, long y)
	{
           if( x >= y ){
	     if( x%y == 0) {return y;} else {return FindGCD(x%y, y);}
	   }else{
	     if( y%x == 0) {return x;} else {return FindGCD(x, y%x);}  
	   }
	}

	public static void main(String[] args)
	{
		long x = Long.parseLong(args[0]);
		long y = Long.parseLong(args[1]);
		long gcd;
		//find GCD using Euclid's algorithm
		gcd = FindGCD(x, y);
		System.out.println(gcd);
	}
}
