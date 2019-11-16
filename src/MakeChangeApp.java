
import java.util.Scanner;

public class MakeChangeApp {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		getChange();

	}

	public static void getChange() {
		double cashTendered = cashRegister();
		int thousands = 0;
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

		for (int j = 0; j < cash.length; j++) {
			cash[j] = (int) (amountDue % 10);
			amountDue = amountDue / 10;
		}

		String changeConvert = cash[1] + "" + cash[0];
		int change = Integer.parseInt(changeConvert);

		thousands = cash[5];
		hundreds = cash[4];
		while (cash[3] >= 5) {
			fifties += 1;
			cash[3] -= 5;

		}
		while (cash[3] % 10 != 0 && cash[3] >= 2) {
			twenties += 1;
			cash[3] -= 2;

		}
		while (cash[3] % 10 != 0) {
			tens += 1;
			cash[3] -= 1;
		}
		while (cash[2] >= 5) {
			fives += 1;
			cash[2] -= 5;

		}

		ones = cash[2];
		quarters = change / 25;
		change = change % 25;
		dimes = change / 10;
		change %= 10;
		nickles = change / 5;
		change %= 5;
		pennies = change;

		System.out.println("thousand dollar bills: " + thousands);
		System.out.println("hundred dollar bills: " + hundreds);
		System.out.println("fifties: " + fifties);
		System.out.println("twenties: " + twenties);
		System.out.println("tens: " + tens);
		System.out.println("fives: " + fives);
		System.out.println("ones: " + ones);
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickles: " + nickles);
		System.out.println("pennies: " + pennies);

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
			if (tendered > 100000 || amount > 10000) {
				System.out.println("You crazy er sumthin, we can't break that. Try something smaller");
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
