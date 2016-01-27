import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class HttpApp
{
	public static void main(String[] args) throws Exception
	{
		int targetPort = 80;
		String targetURL = "http://130.63.94.24:" + targetPort + "/~jr/IOT.cgi";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Your name ... ");
		String sender = in.nextLine();
		
		// prompt for and read the number to be rooted (a double)
		System.out.print("Please enter a positive integer to be rooted: ");
		double UserNum = in.nextDouble();
		
		targetURL = targetURL + "?sender=" + sender + "&square=" + UserNum;
		System.out.println(targetURL);
		URL url = new URL(targetURL);
		URLConnection http = url.openConnection();
		Scanner input = new Scanner(	http.getInputStream());

		// Set up a while loop that repeats as long as there are 
		// lines to be read. In it, read a line and display it.
        String inputLine;
		while (input.hasNextLine()) 
        {
            inputLine = input.nextLine();
        	System.out.println(inputLine);
        }
		
		input.close();
		in.close();
	}
}