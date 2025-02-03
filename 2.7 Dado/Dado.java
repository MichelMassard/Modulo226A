import java.util.Random;
public class Dado{
	public static void main(String[] args){
		Random rnd = new Random();
		int num = rnd.nextInt(1,7);
		System.out.print(num);
	}
}