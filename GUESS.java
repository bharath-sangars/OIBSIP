
import java.util.Scanner;

public class GUESS {

      public static void
	guessingNumberGame()
	{
		
		Scanner s = new Scanner(System.in);

		
		int number = 1 + (int)(100 * Math.random());

		
		int K = 3;

		int i, guess;

		System.out.println(
			"A number is chosen from 1 to 100 "
			
			+ "Guess the number"
			+ " within 3 trials.");


		for (i = 0; i < K; i++) {

			System.out.println( "Guess the number:");

			
			guess = s.nextInt();

			
			if (number == guess) {
				System.out.println( "Congratulations...!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println( "The number is greater than "
					 + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println( "The number is less than"
					 + guess);
			}
		}

		if (i == K) {
			System.out.println( "You have no chances left"
				+" thank you..! ");

			System.out.println( "The number is "
                                              + number);
		}
	}

	
	public static void main(String arg[])
	{

		
		guessingNumberGame();
	}
}
