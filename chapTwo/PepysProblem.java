public class PepysProblem
{
	public static int rolling(){
		double x = Math.random()*6;
		return (int) x;
	}
	public static void main(String[] args)
	{
		for(int i=0; i < 6;i++ ){ System.out.print(rolling()+" ");}
		System.out.println("");
                for(int i=0; i <12;i++ ){ System.out.print(rolling()+" ");}
	}

	// I didn't know how to solev this problem. so I did some research and I found this : 
	// https://www.youtube.com/watch?v=mS5D3gO53Ro
	
	// I need to use binomial distribution here , still need to review probability distributions :)
}
