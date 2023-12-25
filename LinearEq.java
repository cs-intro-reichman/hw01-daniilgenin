/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {	
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = (int)(Math.random() * (a - b) + b);
		int c1 = (int)(Math.random() * (a - b) + b);
		int c2 = (int)(Math.random() * (a - b) + b);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		int mini = Math.min(c, c1);
		int minimum = Math.min(mini, c2);
		System.out.println("The minimal generated item was " + minimum);
	}
}