import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
		List<Integer> fibonacci_sequence = new ArrayList<Integer>();
		fibonacci_sequence.add(1);
		fibonacci_sequence.add(2);
		int sum_of_even_fib = 0;
		
		while (fibonacci_sequence.get(fibonacci_sequence.size()-1) + fibonacci_sequence.get(fibonacci_sequence.size()-2) < 4000000) {
			fibonacci_sequence.add(fibonacci_sequence.get(fibonacci_sequence.size()-1) + fibonacci_sequence.get(fibonacci_sequence.size()-2));
			if (fibonacci_sequence.get(fibonacci_sequence.size()-1) % 2 == 0)
				sum_of_even_fib += fibonacci_sequence.get(fibonacci_sequence.size()-1);
		}
		
		System.out.println("Fibonacci numbers less than 4 million are " + fibonacci_sequence);
		System.out.println("Sum of even fibonacci numbers below 4 million is " + sum_of_even_fib);
		
		System.out.println("Thank you for using this program.");
	}
	
}
