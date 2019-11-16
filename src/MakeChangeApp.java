
public class MakeChangeApp {

	public static void main(String[] args) {
		double cashTendered = 20.54;
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

//		System.out.println(cashTendered);
		int[] cash = new int[6];

		int amountDue = (int) ((cashTendered +0.001) * 100);
		for (int j = 0; j < cash.length; j++) {
			cash[j] = (int) (amountDue % 10);
			amountDue = amountDue / 10;
		}
		String changeConvert = cash[1] + "" + cash[0];
		int change = Integer.parseInt(changeConvert);
//			System.out.println(cash[3]);
		while (cash[5] % 10 != 0) {
			thousands += 1;
			cash[5] -= 1;

		}
		while (cash[4] % 10 != 0) {
			hundreds += 1;
			cash[4] -= 1;

		}
		while (cash[3] % 10 != 0 && cash[3] >= 5) {
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
		while (cash[2] > 0) {
			ones += 1;
			cash[2] -= 1;
		}
		while (true) {
			if (change >= 25) {
				quarters += 1;
				change -= 25;
//				System.out.println(change);
				continue;
			} else if (change >= 10) {
				dimes += 1;
				change -= 10;
				System.out.println(change);
				continue;
			}
			else if(change >= 5) {
				System.out.println(change);
				nickles += 1;
				change -= 5;
				continue;
				
			}
			else if(change > 0) {
				pennies += 1;
				change -= 1;
				continue;
			}
			break;
		}

//		System.out.println("1: " +cash[1]);
//		while (cash[1] > 0 ) {
//			dimes += 1;
//			cash[1] -= 1;
//		}
//		System.out.println("0: " +cash[0]);
//		while (cash[0] >= 5) {
//			nickles += 1;
//			cash[0] -= 1;
//		}
//		while (cash[0] > 0) {
//			pennies += 1;
//			cash[0] -= 1;
//		}

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
}
