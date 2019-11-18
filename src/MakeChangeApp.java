
import java.util.Scanner;

public class MakeChangeApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		getChange();

	}

	public static void getChange() {
		double cashTendered = cashRegister();
		int hundreds = 0;
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;

		int[] cash = new int[6];

		int amountDue = (int) ((cashTendered + 0.001) * 100);
//		twenties = amountDue / 2000; //If only up to twenties are allowed uncomment these two lines.
//		amountDue %= 2000;
		for (int j = 0; j < cash.length; j++) {
			cash[j] = (int) (amountDue % 10);
			amountDue = amountDue / 10;
		}

		String changeConvert = cash[1] + "" + cash[0];
		int change = Integer.parseInt(changeConvert);

		if (cash[3] >= 5) {    
			fifties += 1;		
			cash[3] -= 5;
		}
		while (cash[3] >= 2) {
			twenties += 1;
			cash[3] -= 2;
		}
		if (cash[2] >= 5) {
			fives += 1;
			cash[2] -= 5;
		}
		
		hundreds = cash[5] * 10;
		hundreds += cash[4];
		tens = cash[3];
		ones = cash[2];
		quarters = change / 25;
		change = change % 25;
		dimes = change / 10;
		change %= 10;
		nickles = change / 5;
		change %= 5;
		pennies = change;

		if (hundreds > 0)
			System.out.println("Hundred dollar bills: " + hundreds);
		if (fifties > 0)
			System.out.println("Fifties: " + fifties);
		if (twenties > 0)
			System.out.println("Twenties: " + twenties);
		if (tens > 0)
			System.out.println("Tens: " + tens);
		if (fives > 0)
			System.out.println("Fives: " + fives);
		if (ones > 0)
			System.out.println("Ones: " + ones);
		if (quarters > 0)
			System.out.println("Quarters: " + quarters);
		if (dimes > 0)
			System.out.println("Dimes: " + dimes);
		if (nickles > 0)
			System.out.println("Nickles: " + nickles);
		if (pennies > 0)
			System.out.println("Pennies: " + pennies);

	}

	public static double cashRegister() {

		while (true) {
			System.out.println("How much was the purchase");
			double amount = input.nextDouble();

			System.out.println("How much was tendered");
			double tendered = input.nextDouble();
			if (amount == tendered) {
				System.out.println("You got exact change partner");
				System.out.println("Till next time");
				System.exit(0);
			}
			if ((tendered - amount) > 9999.99 || amount < 0 || tendered < 0) {
				System.out.println("Amount too high or a negative number was entered. Try again");
				continue;
			} else if (amount > tendered) {
				System.out.println("That ain't enough money for yer purchase, try again");
				continue;
			} else {
				System.out.printf("Change due: %.2f\n", (tendered - amount));
				return tendered - amount;
			}

		}
	}

}
