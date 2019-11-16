
public class MakeChangeApp {

	public static void main(String[] args) {
		double cashTendered = 1096.65;
		int thousands = 0;
		int hundreds = 0;
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
//		System.out.println(cashTendered);
		int [] cash = new int[6];
		int amountDue = (int)(cashTendered*100);
			for(int j =0;j<cash.length;j++) {
				cash[j] = (int)(amountDue%10);
				amountDue = amountDue/10;
//				System.out.println(cash[j]);
				
			}
//			System.out.println(cash[3]);
			while(cash[5] %10 !=0){
				thousands += 1;
				cash[5] -= 1;
				
			}
			while( cash[4] %10 !=0) {
				hundreds += 1;
				cash[4] -= 1;
				
			}
			while(cash[3] % 10!=0 && cash[3] >= 5 ) {
				fifties +=1;
				cash[3] -= 5;
				
			}
			while(cash[3] % 10!=0 && cash[3] >= 2 ) {
				twenties +=1;
				cash[3] -= 2;
				
			}
			while(cash[3] % 10 != 0) {
				tens += 1;
				cash[3] -= 1;
			}
			while(cash[2] >= 5 ) {
				fives += 1;
				cash[2] -= 5;
				
			}
			while(cash[2] > 0) {
				ones += 1;
				cash[2] -= 1;
			}
			while(cash[1] >= 2 && cash[0] >=5 ) {
				quarters += 1;
				cash[1] -= 2;
				cash[2] -= 5;
				
			}
			while(cash[1] > 0) {
				dimes += 1;
				cash[1]-=1;
			}
			
			System.out.println(thousands);
			System.out.println(hundreds);
			System.out.println(fifties);
			System.out.println(twenties);
			System.out.println(tens);
			System.out.println(fives);
			System.out.println(ones);
			System.out.println(quarters);
			System.out.println(dimes);
	}

}
