import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.");
		int product = 0;
		
		for (int i=1;i<1000/3;i++) {
			for (int j=i;j<1000-i-j;j++) {
				int k = 1000 - i - j;
				if ((int)Math.pow(i,2) + (int)Math.pow(j,2) == (int)Math.pow(k,2)) {
					product = i*j*k;
					System.out.println("a is "+i+", b is "+j+", c is "+k);
					break;
				}
			}
		}
		
		System.out.println("The product abc is " + product);
		
		System.out.println("Thank you for using this program.");
	}
	
	
}
