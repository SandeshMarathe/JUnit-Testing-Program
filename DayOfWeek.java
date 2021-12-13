
//Importing Package of SCanner Class
import java.util.Scanner;

//Class Name
public class DayOfWeek
{
	//Main Method
	public static void main(String[] args)
	{
		//Variables
		int Day,Month,Year ;

		//Scanner Class to take Input form User
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Date :");
		Day = sc.nextInt();

		System.out.println("Enter The Month :");
		Month =sc.nextInt();

		System.out.println("Enter The Year :");
		Year = sc.nextInt();

		int y = Year - (14 - Month ) / 12 ;
		int x = y + (y/4) - (y/100) + (y/400);
		int m = Month + 12 * ((14 - Month)/12) - 2;
		int d = (Day + x + (31* m )/12 ) % 7;

		String DaysArray [] =  {"Sunday " ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
		System.out.println(DaysArray[d]);

	}
}
