import java.util.Scanner;

public class YearOfBirth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		System.out.println("Enter month: ");
		int month = sc.nextInt();
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		if(year >= 1990 && year < 1995)
			System.out.println("You are early 90's born");
		else if(year >= 1995 && year < 2000)
			System.out.println("You are late 90's born");
		else if(year >= 2000 && year < 2010)
			System.out.println("You are new decade born");
		else if(year >= 2010 && year < 2021)
			System.out.println("You are recently born");
		else
			System.out.println("Invalid year");

	}

}
