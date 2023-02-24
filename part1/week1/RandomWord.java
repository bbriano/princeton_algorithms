import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args) {
		String champ = "";
		for (double i = 1; !StdIn.isEmpty(); i++) {
			String s = StdIn.readString();
			if (StdRandom.bernoulli(1/i)) {
				champ = s;
			}
		}
		StdOut.println(champ);
	}
}
