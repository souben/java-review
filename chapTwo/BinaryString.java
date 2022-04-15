public class BinaryString
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		String str = "";
		while(a != 0)
		{
			str = Integer.toString( a%2) + str;
			a/=2;
		}
		System.out.println(str);
	}
}
