import java.util.Scanner;

public class EggsCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eggs = sc.nextInt();
		
		int gross = 0, dozens = 0;
		int j = 0;
		for(int i = 1; i < eggs; i++)
		{
			j++;
			if(j == 144)
			{
				gross++;
				j = 0;
			}
		}
		
		eggs -= gross*144;
		j = 0;
		
		for(int i = 1; i <= eggs; i++)
		{
			j++;
			if(j == 12)
			{
				dozens++;
				j = 0;
			}
		}
		
		eggs -= dozens*12;
		
		System.out.println(gross);
		System.out.println(dozens);
		System.out.println(eggs);
	}
}
