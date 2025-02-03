public class Potenza {
    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);
		double potenza = Math.pow(num,2);
        System.out.println(num + " elevato a 2: " + potenza);
    }
}