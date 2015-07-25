import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Find the sum of all the multiples of 3 or 5 below 1000.");
		List<Integer> list_multiples = new ArrayList<Integer>();
		int sum_multiples = 0;
		
		for (int i=1;i<1000;i++) {
			if (i%3 == 0 || i%5 == 0) {
				list_multiples.add(i);
				sum_multiples += i;
			}
		}
		
		System.out.println("Multiples of 3 or 5 below 1000 are " + list_multiples);
		System.out.println("Sum of multiples is " + sum_multiples);
		
		System.out.println("Thank you for using this program.");
	}

}
