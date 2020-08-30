
public class BoolsLoopsInputs {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyinPocket = true;
		
		double costOfMilk = 2.50;
		double moneyInWallet = 7.50;
		//From 1 to 10
		int thirstLevel = 10;
		
		boolean shouldBuyIceCream = false;
		boolean willGoSwimming = false;
		boolean isAGoodDay = false;
		boolean willBuyMilk = false;
		
		//Determines if it is hot outside and you have money in your pocket for ice cream
		if(isHotOutside && hasMoneyinPocket) {
			shouldBuyIceCream = true;
			System.out.println("Since it's hot and you have money, go buy ice cream!");
		}else {
			System.out.println("Either it's cold or you don't have money, don't buy ice cream.");
		}
		
		//Swimming: determines if it is hot outside and it's a Saturday or Sunday (weekend).
		if(isHotOutside && !isWeekday) {
			willGoSwimming = true;
			System.out.println("Since it's hot and it's a weekend, you can go swimming!");
		}else {
			System.out.println("Since it's either cold or it's a weekday, you cannot go swimming!");
		}
		
		//Is a good day when it is hot outside, have money in my pocket, and it's a weekend
		if(isHotOutside && hasMoneyinPocket && !isWeekday) {
			isAGoodDay = true;
			System.out.println("Today is a good day!");
		}else {
			System.out.println("Today is a bad day!");
		}
		
		//Buying milk if it's hot, thirst level is more than or equal to 3 and money in wallet is more than
		//twice milk's price
		if(isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= (costOfMilk * 2))) {
			willBuyMilk = true;
			System.out.println("Since you're thirsty, you can buy milk.");
		}else {
			System.out.println("You're not thirsty or it's cold or you don't have money!");
		}
		
		
	}

}
