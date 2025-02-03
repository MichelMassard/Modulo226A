public class Codice {
    public static void main(String[] args) {
		String s = args[0];
		int dime = s.length();
		String s1 = s.substring(0,1);
		String s2 = s.substring(2,3);
		String s3 = s.substring(dime-1,dime);
		String s4 = s.substring(dime-2,dime-1);
		String codice = s1+s2+s3+s4;
		System.out.print(codice);
    }
}