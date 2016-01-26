
public class PowerCalculator
{
	public static void main(String[] args)
	{
		double base = 2;
		double exp = 3;
		double power = Math.pow(base, exp);
		System.out.printf("The power of %.1f raised to %.1f is %.1f.\n",
				base, exp, power);
	}
}