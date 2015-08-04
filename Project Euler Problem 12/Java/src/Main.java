

public class Main {
	public static void main(String[] args) {
		System.out.println("What is the value of the first triangle number to have over five hundred divisors?");
		
		//while loop with recursion
		
		int no_of_divisors = 0, nth_number = 1, triangular_number = 0;
		while (no_of_divisors < 501) {
			no_of_divisors = 0; triangular_number = 0;
			
			triangular_number = get_triangular_number(nth_number,triangular_number);
			for (int i=1;i<triangular_number+1;i++) {
				if (triangular_number % i == 0)
					no_of_divisors++;
			}
			
			System.out.println(nth_number+" "+triangular_number+" "+no_of_divisors);
			nth_number++;
		}
		
		System.out.println("The value of the first triangle number to have over five hundred divisors is "+triangular_number);
		//Answer obtained is 76576500
		
		//Alternative method - for loop and break
		int triangular_number_2 = 0;
		
		for (int i=1;;i++) {
			int divisors_number = 0;
			triangular_number_2 += i;
			for (int j=0;j<triangular_number_2+1;j++) {
				if (triangular_number_2 % j == 0)
					divisors_number++;
			}
			System.out.println(i+" "+triangular_number_2+" "+divisors_number);
			
			if (divisors_number > 500) {
				//System.out.println("First number to have over 500 divisors has "+divisors_number+" divisors.");
				break;
			}
		}
		
		System.out.println("The value of the first triangle number to have over five hundred divisors is "+triangular_number_2);
		
		System.out.println("Thank you for using this program.");
	
	}
	
	public static int get_triangular_number(int ith_number,int accum) {
		if (ith_number > 0)
			return ith_number+get_triangular_number(ith_number-1,accum+ith_number);
		else
			return 0;
	}
}
