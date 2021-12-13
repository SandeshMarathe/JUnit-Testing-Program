//Importing Scanner Class
import java.util.Scanner;

//Class Name
public class NumberToBinary
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int no;

		//To Take Input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number :");
		no = sc.nextInt();

		//Integer To Binary
		System.out.println("Converted Integer to Binary :"+Integer.toBinaryString(no));
	}
}
