import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketApp
{
	public static void main(String[] args) throws Exception
	{
		int targetPort = 55000;
		String targetAddress = "130.63.209.106";
		
		Scanner in = new Scanner(System.in);
		// prompt for and read the sender's name 
		// and the number of flag waves.
		System.out.print("Please enter your name: ");
		String userName = in.nextLine();
		
		System.out.print("Please enter a number between 1-3: ");
		int flagWave = in.nextInt();
		
		Socket client = new Socket(targetAddress, targetPort);
		PrintStream output = new PrintStream(client.getOutputStream(), true);
		Scanner input = new Scanner(client.getInputStream());
		
		output.println("FLAG sender=" + userName + "&waves=" + flagWave);
		System.out.println(output);
		
		// read the one line response from the flag
		// and display it
		String inputLine = input.nextLine();
		System.out.println(inputLine);
		
		input.close();
		client.close();
		in.close();
	}
}
