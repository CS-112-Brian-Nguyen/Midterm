import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner guesses = new Scanner(System.in);
		int dice = 1 + (int)(Math.random() *6);
		int i =0;
		double odd = 0;
		double b =0;
		double j = 0;
		double k = 0;
		double even = 0;
		double evenguess = 0;
		double winning = 0;
		double oddgen = 0;
		String guess;
		
		
		do{
			System.out.println("You have thrown the dice! Type 'odd' if you think it will be odd"
					+ " or type 'even' if you think it will be even?");
			guess = guesses.nextLine();
			dice = 1 + (int)(Math.random() * 6);
		if ((dice % 2) == 0)
		{
			if ("even".equals(guess))
			{
				System.out.println("You have guessed correctly!");
				j++;
				even++;
			}
			else 
			{
				System.out.println("You have guessed incorrectly.");
				k++;
			}
			System.out.printf("Your dice number is %d it is even!\n", dice);
		}
		else
		{
			if ("odd".equals(guess))
			{
				System.out.println("You have guessed correctly!");
				j++;
			}
			else 
			{
				System.out.println("You have guessed incorrectly.");
				k++;
				even++;
			}
			System.out.printf("Your dice number is %d it is odd!\n", dice);
			odd++;
			i++;
		}
		
		System.out.println("Would you like to play again? Type '0' for yes or '1' for no.");
		i = input.nextInt();
		b++;
		} while(i == 0);
		
		winning = j/b;
		evenguess = even/b;
		oddgen = odd/b;
		System.out.printf("You have played %.0f amount of times.\n", b);
		System.out.printf("Your winning percentage is %10.2f%%\n", winning);
		System.out.printf("You have guess even %10.2f%% \n", evenguess);
		System.out.printf("The dice game has generated an odd number %10.2f%% \n", oddgen);
	}
}
