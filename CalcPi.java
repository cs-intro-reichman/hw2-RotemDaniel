// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int terms = Integer.parseInt(args[0]);
		double myPI = 0;
		int stage = 0;
		double i = 1.0;
		while (terms > 0) {
			if (stage % 2 == 0)
			{
				myPI += (1.0 / i);
			}
			else 
			{
				myPI -= (1.0 / i);
			}
			terms--;
			stage++;
			i += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (myPI * 4));
	}
}
