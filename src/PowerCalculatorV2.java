import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class PowerCalculatorV2
{
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter base: ");
		double base = input.nextDouble();
		System.out.print("Enter exponent: ");
		double exp = input.nextDouble();
		input.close();
		
		double power = Math.pow(base, exp);
		String result = String.format(
			"The power of %.1f raised to %.1f is %.1f.\n", base, exp, power);
			
		PrintStream output = new PrintStream(new File("PowerOutput.txt"));
		output.println(result);
		output.close();
		System.out.println(result);
	}
}