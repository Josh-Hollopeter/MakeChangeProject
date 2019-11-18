
import java.util.Scanner;

public class MakeChangeAppAlternate {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		getChange();
		input.close();

	}

	public static void getChange() {
		double cashTendered = cashRegister();
		double twenties = 0;
		double tens = 0;
		double fives = 0;
		double ones = 0;
		double quarters = 0;
		double dimes = 0;
		double nickles = 0;
		double pennies = 0;

		cashTendered += 0.001;

		twenties = cashTendered / 20;
		cashTendered %= 20;
		tens = cashTendered / 10;
		cashTendered %= 10;
		fives = cashTendered / 5;
		cashTendered %= 5;
		ones = cashTendered / 1;
		cashTendered %= 1;

		quarters = cashTendered / .25;
		cashTendered %= .25;
		dimes = cashTendered / .10;
		cashTendered %= .10;
		nickles = cashTendered / .05;
		cashTendered %= .05;
		pennies = cashTendered / .01;

		if ((int) twenties > 0)
			System.out.println("Twenties: " + (int) twenties);
		if ((int) tens > 0)
			System.out.println("Tens: " + (int) tens);
		if ((int) fives > 0)
			System.out.println("Fives: " + (int) fives);
		if ((int) ones > 0)
			System.out.println("Ones: " + (int) ones);
		if ((int) quarters > 0)
			System.out.println("Quarters: " + (int) quarters);
		if ((int) dimes > 0)
			System.out.println("Dimes: " + (int) dimes);
		if ((int) nickles > 0)
			System.out.println("Nickles: " + (int) nickles);
		if ((int) pennies > 0)
			System.out.println("Pennies: " + (int) pennies);

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
			if (amount < 0 || tendered < 0) {
				System.out.println("A negative number was entered. Try again");
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
