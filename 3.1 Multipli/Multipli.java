public class Multipli {
    public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num % 5 == 0){
			System.out.print(num + " è multiplo di 5"); 
		}
		else{
			System.out.print(num + " non è multiplo di 5"); 
		}
    }
}