public class Increment
{
	// ++a vs ++a
	// x=++a uses the 'a' BEFORE incrementing it;
	// x=a++ uses the 'a' AFTER incrementing it;
	 
	public static void main(String[] main)
	{
		int a=10;
		int x;
		x=++a;
		if (x < a) {x=0;} else x=0;
		System.out.println(a+" "+x);
	}
}
