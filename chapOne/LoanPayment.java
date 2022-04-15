public class LoanPayment
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double P = Double.parseDouble(args[2]);
		double annualInterest = P*Math.exp(r*t);
		System.out.println(annualInterest);
	}
}
