import java.util.Scanner;	//roll dice w/ ARRAY

public class ch6hmwk {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double evencount = 0.0, oddcount = 0.0, gameswon = 0.0, gameslost = 0.0, winrate = 0.0; // generate variables used to keep track of information
		int dice, count = 0, guess, win, lose, play = 0; // generate game-use variables
		String WoL = "a", OoE = "b"; // WoL is win or lose and OoE is odd or even

		while (play == 0) {
			System.out.print("Lets roll a 6-sided dice:\n");
			System.out.printf("\n%s%d%s", "(Total games played: ", count, ")");
			dice = 1 + (int) (Math.random() * 6);
			System.out.print("\nGuess if the roll is an even or odd number.\n'1' for odd and '2' for even: ");
			guess = input.nextInt();

			if (guess < 1 || guess > 2) { // create error
				System.out.print("Looks like somebody is direction-challenged- no dice rolling for you");
				break;
			}

			if (dice % 2 == 0) {
				win = 1;
				lose = 2;
				evencount++;
				OoE = "(Roll was even)";
			} else {
				win = 2;
				lose = 1;
				oddcount++;
				OoE = "(Roll was odd)";
			}
			if (guess == win) {
				gameswon++;
				WoL = "You won!";
			} else if (guess == lose) {
				gameslost++;
				WoL = "You lost!";
			}
			winrate = 100 * gameswon / (gameswon + gameslost);
			count++;

			System.out.printf("%s%s%s", "\n", WoL, OoE);

			// array holds: 'winrate', 'oddcount', 'evencount'
			double[] mylist = new double[3];
			mylist[0] = oddcount;
			mylist[1] = evencount;
			mylist[2] = winrate;
			// for some reason array is printed 3x for each case**
			for (double d = 0; d < mylist.length; d++)
				System.out.printf("%s%f%s%f%s%f%s", "\nThe amount of odd rolls have been: ", mylist[0],
								    "\nThe amount of even rolls have been: ", mylist[1], 
								    "\nAnd the win rate has been ", mylist[2],"%");

			System.out.print("\n\nPlay again? Press and enter '0' ");
			play = input.nextInt();

		}
	}
}