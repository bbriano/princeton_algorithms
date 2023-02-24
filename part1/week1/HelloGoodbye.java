public class HelloGoodbye {
	public static void main(String[] args) {
		if (args.length < 2) {
			return;
		}
		String a = args[0];
		String b = args[1];
		System.out.printf("Hello %s and %s.\n", a, b);
		System.out.printf("Goodbye %s and %s.\n", b, a);
	}
}
