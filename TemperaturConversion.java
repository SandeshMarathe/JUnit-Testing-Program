//Importing Package of Scanner Class
import java.util.Scanner;

//Class Name
public class TemperaturConversion
{
	//Main Method
	public static void main(String[] args)
	{
		//Variable
		int choice;

		Scanner sc = new Scanner(System.in);

		//SCanner Class to take Input from User
		System.out.println("Please Enter the Your Choice \n1.Celsius  \n2.Fahrenheit");
		choice = sc.nextInt();

		//Switch Statment
		switch(choice)
		{
			case 1:
				System.out.println("Enter the temperature in Fahrenheit:");
				int fahrenheit = sc.nextInt();

				int celsius = (fahrenheit - 32 ) * 5 / 9;
				System.out.println("The temperature in Celsius is :" + celsius);
			break;
			case 2:
				System.out.println("Enter the temperature in Celsius:");
				int cel = sc.nextInt();

				int fah = ( cel * 9 / 5 ) + 32 ;
				System.out.println("The temperature in Fahrenheit is :" + fah);
			break;
		}
	}
}

