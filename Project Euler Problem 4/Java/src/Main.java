
public class Main {
	public static void main(String[] args) {
		System.out.println("Find the largest palindrome made from the product of two 3-digit numbers.");
		int largest_palindrome = 0;
		
		for (int i=100;i<1000;i++) {
			for (int j=i;j<1000;j++) {
				if (is_palindrome(i*j))
					if (largest_palindrome < i*j)
						largest_palindrome = i*j;
			}
		}
		
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + largest_palindrome);
		
		System.out.println("Thank you for using this program.");
	}
	
	public static boolean is_palindrome(final int integer) {
		String int_string = String.valueOf(integer);
		for (int i=0;i<int_string.length()/2;i++) {
			if (int_string.charAt(i) != int_string.charAt(int_string.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
