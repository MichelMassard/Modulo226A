public class Progressione{
    public static void main(String[] args) {
		int n4;
		int n5;
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		n4 = n2-n1;
		n5 = n3-n2;
		if(n4 != n5){
			System.out.print("I tre numeri non sono in progressione aritmetica");
		}
		else{
			System.out.print("I tre numeri sono in progressione aritmetica (differenza costante di " + n4 + " )");
		}
    }
}