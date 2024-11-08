// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentvalue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double presentege = (rate/100) + 1; // taking an input of number between 0 to 100 and turn it to presenege
		int years = Integer.parseInt(args[2]);

		double futurevalue = currentvalue * (Math.pow(presentege, years));

		System.out.println("After " + years + " years, $" + currentvalue + " saved at " + rate + "% will yield $" + (int)futurevalue);
	}
}