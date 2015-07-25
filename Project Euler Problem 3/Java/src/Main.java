
public class Main {

	public static void main(String[] args) {
		
		System.out.println("What is the largest prime factor of the number 600851475143?");
		
		long number = 600851475143L;
		long largest_prime_factor = 0;
		
		if (number > 1) {
			for (long itr=2;itr<number/2+1;itr++) {
				if (number % itr == 0) {
					if (is_prime(itr))
						largest_prime_factor = itr;
				}
			}
		}
		
		if (largest_prime_factor > 1)
			System.out.println("The largest prime factor of the number 600851475143 is " + largest_prime_factor);
		else if (number > 1)
			System.out.println(number + " is a prime number!");
		else
			System.out.println(number + " is not prime and has no prime factors (is 1, 0, or negative)");
		
		System.out.println("Thank you for using this program.");
		
	}
	
	public static boolean is_prime(final long integer) {
		if (integer > 2) {
			for (int i=2;i<integer/2+1;i++) {
				if (integer % i == 0)
					return false;
			}
			return true;
		}
		else if (integer == 2) 
			return true;
		else
			return false;
	}

}
