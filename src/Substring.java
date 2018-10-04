import java.util.Scanner;

/**
 * 
 * @author jeremy
 *
 */
public class Substring
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.next();
		in.nextLine();
		
		System.out.print("Enter your number: ");
		String fullPhoneNumber = in.next();
		in.nextLine();
		
		String areaCode = fullPhoneNumber.substring(0, 3);
		String startPhoneNumber = fullPhoneNumber.substring(3, 6);
		String endPhoneNumber = fullPhoneNumber.substring(6);
		
		System.out.printf("%-20s %s\n", "Name: ", name);
		System.out.printf("%-20s (%s) %s-%s", "Phone#: ", areaCode, startPhoneNumber, endPhoneNumber);
		
	}

}
