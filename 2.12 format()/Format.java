public class Format {
    public static void main(String[] args) {
		double myNumber = 123456.78;
		String result;

		// Default
		result = String.format("%f", myNumber);
		System.out.println(result);

		// Two decimal digits
		result = String.format("%.2f", myNumber);
		System.out.println(result);

		// No decimal digits
		result = String.format("%.0f", myNumber);
		System.out.println(result);

		// No decimal digits but keep the decimal point
		result = String.format("%#.0f", myNumber);
		System.out.println(result);

		// Group digits
		result = String.format("%,.2f", myNumber);
		System.out.println(result);

		// Scientific notation with two digits of precision
		result = String.format("%.2e", myNumber);
		System.out.println(result);
    }
}