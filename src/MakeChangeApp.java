
public class MakeChangeApp {

	public static void main(String[] args) {
		System.out.println("Hello u");
		double cashTendered = 15.65;
//		System.out.println(cashTendered);
		int [] cash = new int[4];
		int amountDue = (int)(cashTendered*100);
			for(int j =0;j<cash.length;j++) {
				cash[j] = (int)(amountDue%10);
				amountDue = amountDue/10;
				System.out.println(cash[j]);
				
			}
//			System.out.println("cash"+ cashTendered);
		
//		System.out.println(cashTendered);
//		System.out.println(cash[1]);

	}

}
