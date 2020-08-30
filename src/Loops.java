
public class Loops {

	public static void main(String[] args) {
		
		//While loop printing every even number from 0 to 100
		int x = 0;
		while(x <= 100) {
			if(x % 2 == 0) {
				System.out.println(x);
			}
			x++;
		}
		System.out.println("============================");
		
		
		//A while loop that prints every 3rd number going backwards from 100 until we reach 0
		int y = 100;
		while(y > 0) {
			System.out.println(y);
			y -= 3;
		}
		System.out.println("============================");
		
		//For loop prints every other number from 1 to 100
		for(int i=1; i <= 100; i+=2) {
			System.out.println(i);
		}
		System.out.println("============================");

		//A for loop that prints every number from 0 to 100, 
		//but if the number is divisible by 3, it prints “Hello” instead of the number, 
		//and if the number is divisible by 5, it prints “World” instead of the number, 
		//and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		for(int i=0; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
			}else if(i % 3 == 0) {
				System.out.println("Hello");
			}else if(i % 5 == 0){
				System.out.println("World");
			}else {
				System.out.println(i);
			}
			
		}
		
		
	}

}
