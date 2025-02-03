public class Pitagora{
	public static void main(String[] args){
		double cat1 = Double.parseDouble(args[0]);
		double cat2 = Double.parseDouble(args[1]);
		double cat3 = Math.pow(cat1,2);
		double cat4 = Math.pow(cat2,2);
		double cat5 = cat3 + cat4;
		double ipotenusa = Math.sqrt(cat5);
		System.out.print(ipotenusa);
	}
}