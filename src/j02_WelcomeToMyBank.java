
public class j02_WelcomeToMyBank {

	public static void main(String[] args) {
		
		//welcome to every customer in my bank.
		//Change my bank name,also new customer has new funds.
		/*
		show, x, 1000
		show, y, 500
		aa, x, 100000
		aa, y, 200000
		*/
		//variables .... holds values for me
		
		String bankName = "ABC";
		String userName = "AA";
		String userBalance = "232";
		
		System.out.println("Welcome to " + bankName);
		
		System.out.println("1. Hi" + userName +"how are you this morning.");
		
		System.out.println("2. What can i do for you.");
		System.out.println("3. Your password is protected.");
		System.out.println("4. Your funds are:" + userBalance);
		System.out.println("5. Thank you"  +  userName  + "have a good day.");

	}

}
