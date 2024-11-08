// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	  int number = Integer.parseInt(args[0]);
	  int hundrends = number / 100;
	  int rest = number-(hundrends*100);
	  int tens = rest/10;
	  int ones = rest-(tens*10);

	  System.out.println(hundrends + " hundrends , " + tens + " tens , " + ones + " ones.");
	}
}
