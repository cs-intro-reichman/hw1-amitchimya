// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	  int number = Integer.parseInt(args[0]);
	  int hundreds = number / 100;
	  int rest = number-(hundreds*100);
	  int tens = rest/10;
	  int ones = rest-(tens*10);

	  System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
