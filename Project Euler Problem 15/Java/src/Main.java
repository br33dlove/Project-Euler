
public class Main {
	
	static long no_of_routes=0;
	
	public static void main(String[] args) {
		System.out.println("Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?");
		
		int total_x_dimensions = 20, total_y_dimensions = 20;
		get_number_of_routes(0,0,total_x_dimensions,total_y_dimensions);
		
		System.out.println("There are " + no_of_routes + " such routes in a 20x20 grid.");
		
		System.out.println("Thank you for using this program.");
	}
	
	public static void get_number_of_routes(final int x_pos, final int y_pos, final int x_dim, final int y_dim) {
		if (x_pos == x_dim && y_pos == y_dim) {
			no_of_routes++;
			System.out.println(no_of_routes);
		}
		for (int i=0;i<2;i++) {//2 is no. of dimensions
			//i=0 -> go right, i=1 -> go down
			if (i == 0 && x_pos < x_dim)
				get_number_of_routes(x_pos+1,y_pos,x_dim,y_dim);
			if (i == 1 && y_pos < y_dim)
				get_number_of_routes(x_pos,y_pos+1,x_dim,y_dim);
		}
	}
}
