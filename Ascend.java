// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);

		int a = (int)(Math.random()*limit);
		int b = (int)(Math.random()*limit);
		int c = (int)(Math.random()*limit);

		System.out.println(a + " " + b + " " + c);
	
		int min = Math.min((Math.min (a,b)),c);
		int max = Math.max((Math.max (a,b)),c);
		int mid = (a + b + c) - (min + max); // we add all the random int and then remove the minimum and maximum to find the middle one

		System.out.println(min + " " + mid + " " + max);
	}
}
