//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class MonthlyPayment
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		double amount,rate,year,monthPayment=0;

		//Scanner Class to take input from User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Principal Amount :");
		amount = sc.nextDouble();

		System.out.println("Enter the Rate :");
		rate = sc.nextDouble();

		System.out.println("Enter the Year :");
		year = sc.nextDouble();

		//Formula
		double n = 12 * year;
		double r = rate / ( 12 * 100 );

		monthPayment = (amount * r )/ (1 - (Math.pow((1+r), (-n)) ));
		System.out.println(" The Payment Per Month is : " + monthPayment);
	}
}
