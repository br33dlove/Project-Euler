
public class Main {
	public static void main(String[] args) {
		System.out.println("Which starting number, under one million, produces the longest Collatz sequence?");
		
		int chain_length = 0, starting_number = 0;
		for (int i=1;i<1000000;i++) {
			int temp_length = get_collatz_length(i,0);
			if (temp_length == -1) {
				System.out.println("Error! get_collatz_length() returned -1. Exiting with -1...");
				System.exit(-1);
			}
			if (chain_length < temp_length) {
				chain_length = temp_length;
				starting_number = i;
			}
			System.out.println(i);
		}
		System.out.println("The starting number under one million that produces the longest Collatz sequence is " + starting_number + " with " + chain_length + " elements.");
		
		System.out.println("Thank you for using this program.");
	}
	
	public static int get_collatz_length(final long element, final int chain_length) {
		if (element == 1) 
			return chain_length+1;
		else if (element % 2 == 0)
			return get_collatz_length(element/2,chain_length+1);
		else if (element % 2 == 1)
			return get_collatz_length(3*element+1,chain_length+1);
		else
			return -1; //Can occur when element is larger than 2^64-1
	}
}
