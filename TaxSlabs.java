import java.util.Scanner;

public class TaxSlabs {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter your income: ");
		 int income = sc.nextInt();
		 System.out.println("Enter you gender (M/F): ");
		 char gender = sc.next().charAt(0);
		 
		 int tax = 0;
		 
		 if(gender == 'M' || gender == 'm')
		 {
			 if(income >= 0 && income <= 180000)
				 System.out.println("No tax!!");
			 else if(income >= 180001 && income <= 500000)
			 {
				 tax = (income/100)*10;
				 System.out.println("Your tax = "+tax);
			 }
			 else if(income >= 500001 && income <= 800000)
			 {
				 tax = (income/100)*20;
				 System.out.println("Your tax = "+tax);
			 }
			 else if(income >= 800000)
			 {
				 tax = (income/100)*30;
				 System.out.println("Your tax = "+tax);
			 }
		 }
		 
		 else if(gender == 'F' || gender == 'f')
		 {
			 if(income >= 0 && income <= 190000)
				 System.out.println("No tax!!");
			 else if(income >= 190001 && income <= 500000)
			 {
				 tax = (income/100)*10;
				 System.out.println("Your tax = "+tax);
			 }
			 else if(income <= 500001 && income <= 800000)
			 {
				 tax = (income/100)*20;
				 System.out.println("Your tax = "+tax);
			 }
			 else if(income <= 800000)
			 {
				 tax = (income/100)*30;
				 System.out.println("Your tax = "+tax);
			 }
		 }
		 else
			 System.out.println("Invalid input");
		 
	}
}
