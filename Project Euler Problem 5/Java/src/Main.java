
public class Main {
	public static void main(String[] args) {
		
		System.out.println("What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");
		int number = 20;
		
		int multiple = 1;
		for (int i=1;i<number+1;i++) {
			if (multiple % i != 0) {
				if (is_prime(i))
					multiple *= i;
				else {
					multiple *= get_uncommon_factors(multiple,i);
				}
			}
		}
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + multiple);
		
		System.out.println("Thank you for using this program.");
		
		//Numbers 1-20 as products of prime numbers
		//1
		//2
		//3
		//2*2
		//5
		//2*3
		//7
		//8
		//3*3
		//2*5
		//11
		//2*2*3
		//13
		//2*7
		//3*5
		//2*2*2*2
		//17
		//2*3*3
		//2*2*5
		//Calculated lowest common multiple as 232792560
	}
	
	public static boolean is_prime(final int integer) {
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
	
	public static int get_smallest_prime_factor(final int integer) {
		if (integer < 2) {
			System.out.println("Error! There are no prime factors of numbers less than 2. Returning 0.");
			return 0;
		}
		for (int i=2;i<integer;i++) {
			if (is_prime(i) && integer % i == 0) {
				return i;
			}
		}
		return integer;
	}
	
	public static int get_uncommon_factors(final int number_1, final int number_2) {
		if (number_2 > 1) {
			if (number_1 % get_smallest_prime_factor(number_2) != 0)
				return get_smallest_prime_factor(number_2) * get_uncommon_factors(number_1/get_smallest_prime_factor(number_2),number_2/get_smallest_prime_factor(number_2));
			else
				return get_uncommon_factors(number_1/get_smallest_prime_factor(number_2), number_2/get_smallest_prime_factor(number_2));
		}
		else if (number_2 == 1)
			return 1;
		else {
			System.out.println("Error! get_uncommon_factor() has second argument less then 1, which is not permitted. Returning -1, please exit.");
			return -1;
		}
	}
}
