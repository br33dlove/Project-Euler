using System;

namespace Project_Euler_Problem_12
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.WriteLine ("What is the value of the first triangle number to have over five hundred divisors?");

			int no_of_divisors = 0, triangular_no = 0, itr = 1;
			while (no_of_divisors < 501) {
				if (no_of_divisors != 0)
					no_of_divisors = 0;
				if (triangular_no != 0)
					triangular_no = 0;
				
				triangular_no = get_triangular_number (itr, 0);
				for (int i = 1; i < triangular_no + 1; i++) {
					if (triangular_no % i == 0)
						no_of_divisors++;
				}
				Console.WriteLine (itr + " " + triangular_no + " " + no_of_divisors);

				itr++;
			}

			Console.WriteLine ("The value of the first triangle number to have over five hundred divisors is" + triangular_no);

			Console.WriteLine ("Thank you for using this program.");
		}

		public static int get_triangular_number(int ith_no, int tri_accum) {
			if (ith_no > 0)
				return get_triangular_number (ith_no - 1, tri_accum + ith_no);
			else
				return tri_accum;
		}
	}
}
