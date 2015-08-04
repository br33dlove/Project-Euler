import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		System.out.println("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.");
		int sum_of_squares = 0, square_of_sum = 0;
		
		for (int i=0;i<100;i++) {
			sum_of_squares += (int)Math.pow(i+1,2);
			square_of_sum += i+1;
		}
		square_of_sum = (int)Math.pow(square_of_sum,2);
		
		System.out.println("Sum of squares is " + sum_of_squares);
		System.out.println("Square of sum is " + square_of_sum);
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " + String.valueOf(square_of_sum-sum_of_squares));
		
		System.out.println("Thank you for using this program");
	}
}
